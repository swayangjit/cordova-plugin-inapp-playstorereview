
  

  

#  `cordova-plugin-inapp-playstorereview`

  

<p  align="center">
<a  href="https://badge.fury.io/js/cordova-plugin-networkspeed"><img  src="https://badge.fury.io/js/cordova-plugin-inapp-playstorereview.svg"  alt="npm version"  height="18"></a>
<a  href="https://opensource.org/licenses/Apache-2.0">
<img  src="https://img.shields.io/npm/dm/cordova-plugin-inapp-playstorereview.svg"  alt="License" />
</a>
<a  href="https://codeclimate.com/github/codeclimate/codeclimate/maintainability"><img  src="https://api.codeclimate.com/v1/badges/a99a88d28ad37a79dbf6/maintainability" /></a>
<a  href="https://opensource.org/licenses/Apache-2.0">
<img  src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"  alt="License" />
</a>
</p>

  



> Cordova plugin to use Google play core In app review APIs (Android)

  

  

##  API

  

  

The plugin exposes the following method:

  

  

```javascript  

inAppReview.showInAppReviewFlow(success, error);

```

  

  

####  Parameters:

  

* __success:__ success callback

* __error:__ error callback

  

  

##  Installation

The plugin can be installed via [Cordova-CLI](https://cordova.apache.org/docs/en/dev/guide/cli/index.html#The%20Command-line%20Interface) and is publicly available on [NPM](https://www.npmjs.com/package/cordova-plugin-inapp-playstorereview).


Execute from the projects root folder:
```javascript 
$ npm i cordova-plugin-inapp-playstorereview
$ cordova plugin add cordova-plugin-inapp-playstorereview
```

Or install a specific version:

```javascript
$ npm i cordova-plugin-inapp-playstorereview@<latest_version>
$ cordova plugin add cordova-plugin-inapp-playstorereview@<latest_version>
 ```

Or install the latest head version:

```javascript
$ cordova plugin add https://github.com/swayangjit/cordova-plugin-inapp-playstorereview.git
```
Or install from local source:

```javascript
$ cordova plugin add <path> --nofetch --nosave --link
```