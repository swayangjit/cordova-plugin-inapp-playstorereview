var exec = require('cordova/exec');

var PLUGIN_NAME = 'inAppReview';

var inAppReview = {
    showInAppReviewFlow: function(success, error) {
        exec(success, error, PLUGIN_NAME, "showInAppReviewFlow", []);
    }
};

module.exports = inAppReview;
