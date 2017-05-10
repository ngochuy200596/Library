var routerApp = angular.module('myApp');

routerApp.directive('slideReleasePreparation', slideReleasePreparation);

slideReleasePreparation.$inject = ['$log', '$http', '$timeout'];

function slideReleasePreparation($log, $http, $timeout) {
    return {
        link: link,
        templateUrl: 'app/shared/slide_release_preparation/releasePreparation.html',
        replace: true,
        restrict: 'E'
    };

    function link($scope, els) {
        $log.info('Slide Header directive');
        findAllReleasePreparation();

        function findAllReleasePreparation() {
            $http.get("/book/AuthorRandom").then(function (response) {
                $scope.ReleasePreparation = response.data;
                $timeout(function () {
                    els.slick({
                        dots: true,
                        infinite: true,
                        slidesToShow: 4,
                        slidesToScroll: 4
                    });
                });
            });
        }
    }
}
