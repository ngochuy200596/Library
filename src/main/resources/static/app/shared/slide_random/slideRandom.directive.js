var routerApp = angular.module('myApp');

routerApp.directive('slideByAuthorHot', slideByAuthorHot);

slideByAuthorHot.$inject = ['$log', '$http', '$timeout'];

function slideByAuthorHot($log, $http, $timeout) {
    return {
        link: link,
        templateUrl: 'app/shared/slide_random/slideRandom.html',
        replace: true,
        restrict: 'E'
    };

    function link($scope, els) {
        $log.info('Slide author hot directive');
        findByAuthor();

        function findByAuthor() {
            $http.get("/book/BookByAuthor/8").then(function (response) {
                $scope.authordata = response.data;
                initEls();
            });
        }

        function initEls(){
            $timeout(function () {
                els.slick({
                    dots: true,
                    infinite: true,
                    slidesToShow: 4,
                    slidesToScroll: 4
                });
            });
        }
    }
}
