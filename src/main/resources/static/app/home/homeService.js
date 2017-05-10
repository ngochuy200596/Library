var routerApp = angular.module('myApp');
routerApp.factory('getCategory',getCategory);

getCategory.$inject = ['$http','$log'];

function getCategory($http,$log) {
    return{
        findAllCategory : findAllCategory
    };

    function findAllCategory(){
        $log.info('category home service');
        return $http.get("/category/parent/0");
    }
}