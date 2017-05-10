var routerApp = angular.module('myApp');

routerApp.directive('slideGiangSinh', slideGiangSinh);

slideGiangSinh.$inject = ['$log', '$http', '$timeout'];

function slideGiangSinh($log, $http, $timeout) {
    return {
        link: link,
        templateUrl: 'app/shared/slide_giangsinh/slideGiangSinh.html',
        replace: true,
        restrict: 'E'
    };

    function link($scope, els) {
        $log.info('Slide Giang Sinh directive');
        findByCategory();

        function findByCategory() {
            $http.get("/book/BookByCategory/6").then(function (response) {
                $scope.giangsinh = response.data;
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
