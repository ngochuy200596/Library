var routerApp = angular.module('myApp');

routerApp.directive('categoryDetail',categoryDetail);

categoryDetail.$inject = ['$log'];

function categoryDetail($log) {
    return{
        link: link,
        templateUrl:'app/shared/category_detail/categoryDetail.html',
        restrick:'E'
    };

    function link() {
        $log.info('Category directive');
    }
}