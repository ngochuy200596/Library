var routerApp = angular.module('myApp');

routerApp.directive('slideHeader',slideHeader);

slideHeader.$inject = ['$log'];

function slideHeader($log) {
    return{
        link:link,
        templateUrl: 'app/shared/slide/slide.html',
        replace: true,
        restrict:'E'
    };

    function link(scope, els) {
        $log.info('Slide Header directive');
        els.slick({
            dots: true,
            infinite: true,
            slidesToShow: 6,
            slidesToScroll: 6
        });
    }
}