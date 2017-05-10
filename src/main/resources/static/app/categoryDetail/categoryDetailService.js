var router = angular.module('myApp');
routerApp.factory('categoryDetailService',categoryDetailService);

categoryDetailService.$inject = ['$http','$log'];

function categoryDetailService($http,$log) {
    return{
        findCategory:findCategory
    };

    function findCategory() {
        $log.info('Category Detail Service');
        return $http.get("/book/BookByCategory/3");
    }
}