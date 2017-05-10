var routerApp = angular.module('myApp');

routerApp.directive('libraryHeader',libraryHeader);

libraryHeader.$inject = ['$log'];

function libraryHeader($log) {
    return{
        link:link,
        templateUrl:'app/shared/header/header.html',
        restrict:'E'
    };

    function link(){
        $log.info('Header directive');
    }
}