/*global cordova, module*/

module.exports = {
    pid: function (appendProcStartTime, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Getpid", "pid", [appendProcStartTime]);
    }
};