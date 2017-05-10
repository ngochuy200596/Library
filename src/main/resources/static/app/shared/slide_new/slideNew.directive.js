var routerApp = angular.module('myApp');

routerApp.directive('slideNew',slideNew);

slideNew.$inject = ['$log'];

function slideNew($log) {
    return{
        link:link,
        templateUrl: 'app/shared/slide_new/slideNew.html',
        replace: true,
        restrict: 'E'
    };

    function link(scope, els) {
        $log.info('Slide Header directive');
        els.slick({
            dots: true,
            infinite: true,
            slidesToShow: 4,
            slidesToScroll: 4
        });
    }
}



