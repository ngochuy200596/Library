var routerApp = angular.module('myApp');

routerApp.directive('saleImage',saleImage);

saleImage.$inject = ['$log'];

function saleImage($log){
    return{
        link:link,
        templateUrl: 'app/shared/sale/sale.html',
        restrict: 'E'
    };

    function link(){
        $log.info('Sale directive');
    }
}