var routerApp = angular.module('myApp');

routerApp.directive('slideCombo',slideCombo);

slideCombo.$inject = ['$log'];

function slideCombo($log) {
    return{
        link:link,
        templateUrl: 'app/shared/slide_combo/slideCombo.html',
        replace: true,
        restrict:'E'
    };

    function link(scope, els) {
        $log.info('Slide Combo directive');
        els.slick({
            dots: true,
            infinite: true,
            slidesToShow: 4,
            slidesToScroll: 4
        });
    }
}