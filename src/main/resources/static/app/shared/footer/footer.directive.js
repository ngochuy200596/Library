var routerApp = angular.module('myApp');

routerApp.directive('libraryFooter',libraryFooter);

libraryFooter.$inject = ['$log'];

function libraryFooter($log) {
    return {
        link:link,
        templateUrl: 'app/shared/footer/footer.html',
        restrict: 'E'
    };

    function link() {
        $log.info('Footer directive');
    }
}