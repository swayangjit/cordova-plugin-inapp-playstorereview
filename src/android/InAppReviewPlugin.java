package com.swayangjit.review;

import android.support.annotation.NonNull;

import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * This plugin utilizes the Play core API class to show the In app review flow.
 */
public class InAppReviewPlugin extends CordovaPlugin {
    private static final String SHOW_INAPP_REVIEWFLOW = "showInAppReviewFlow";

    @Override
    protected void pluginInitialize() {
        super.pluginInitialize();
    }

    /**
     * Executes the request.
     * <p>
     * This method is called from the WebView thread. To do a non-trivial
     * amount of work, use:
     * cordova.getThreadPool().execute(runnable);
     * <p>
     * To run on the UI thread, use:
     * cordova.getActivity().runOnUiThread(runnable);
     *
     * @param action          The action to execute.
     * @param args            The exec() arguments in JSON form.
     * @param callbackContext The callback context used when calling back into
     *                        JavaScript.
     * @return Whether the action was valid.
     */
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals(SHOW_INAPP_REVIEWFLOW)) {
            this.showInAppReviewFlow(callbackContext);
            return true;
        }
        return false;
    }

    /**
     * Launces review popup
     *
     * @param callbackContext The callback context used when calling back into JavaScript.
     */
    private void showInAppReviewFlow(CallbackContext callbackContext) {
        final ReviewManager manager = ReviewManagerFactory.create(cordova.getActivity());
        Task<ReviewInfo> request = manager.requestReviewFlow();
        request.addOnCompleteListener(new OnCompleteListener<ReviewInfo>() {
            @Override
            public void onComplete(@NonNull Task<ReviewInfo> task) {
                if (task.isSuccessful()) {
                    ReviewInfo reviewInfo = task.getResult();
                    Task<Void> flow = manager.launchReviewFlow(cordova.getActivity(), reviewInfo);
                    flow.addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            callbackContext.success();
                        }
                    });
                } else {
                    callbackContext.error(task.getException().getMessage());
                }
            }
        });
    }
}
