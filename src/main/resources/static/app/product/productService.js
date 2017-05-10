var routerApp = angular.module('myApp');
routerApp.factory('productService', productService);

productService.$inject = ['$http', '$log'];

function productService($http, $log) {
    return {
        findProduct: findProduct
    };

    function findProduct(productData) {
        $log.info('find Product service');
        return $http.get("/book/" + productData);
    }
}