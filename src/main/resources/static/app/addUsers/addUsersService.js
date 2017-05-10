var routerApp = angular.module('myApp');
routerApp.factory('addUserService',addUserService);

addUserService.$inject = ['$http','$log','$scope'];

function addUserService($http, $log,$scope) {
    return{
        addUsers: addUsers
    };

    function addUsers() {
        $log.info('add Users Service');
        return $http.post("/users");
    }

}