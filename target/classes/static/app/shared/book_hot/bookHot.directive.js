var routerApp = angular.module('myApp');

routerApp.directive('bookHot',bookHot);

bookHot.$inject = ['$log','$http']

function bookHot($log,$http) {
    return{
        link:link,
        templateUrl: 'app/shared/book_hot/bookHot.html',
        restrict: 'E'
    };

    function link($scope) {
        $log.info('BookHot');
        findBookHot();

        function findBookHot() {
            $http.get('/book/BookHot').then(function (resp) {
                $log.info(resp.data);
                $scope.bookHot = resp.data;
            })
        }

    }
}