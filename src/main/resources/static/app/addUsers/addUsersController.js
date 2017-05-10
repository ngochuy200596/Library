var routerApp = angular.module('myApp');

routerApp.controller('addUserCtrl',addUserCtrl);

addUserCtrl.$inject = ['$scope','addUserService','$log'];

function addUserCtrl($scope,addUserService,$log) {
    addUsersCtrl();

    function addUsersCtrl() {
        addUserService.addUsers().then(function (resp) {
            $log.info(resp);
            alert("Insert success full!");
        }),function (errResp) {
            $log.info(errResp);
            alert("Fail");
        }
    }
}