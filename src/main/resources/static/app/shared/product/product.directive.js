var routerApp = angular.module('myApp');

routerApp.directive('product',product);

product.$inject = ['$log'];

function product($log){
    return{
        link:link,
        templateUrl: 'app/shared/product/product.html',
        restrict: 'E'
    };

    function link(){
        $log.info('Product directive');
    }
}