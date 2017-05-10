var routerApp = angular.module('myApp');
routerApp.factory('categoryService',categoryService);

categoryService.$inject = ['$http','$log'];

function categoryService($http,$log){
    return{
        findCategory:findCategory,
    };

    function findCategory(categoryID){
        $log.info('find Category ');
        return $http.get("/book/BookByCategory/" + categoryID);
    }
}