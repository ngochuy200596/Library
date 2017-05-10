var routerApp = angular.module('myApp');

routerApp.controller('authorCtrl', authorCtrl);

authorCtrl.$inject = ['authorService', '$scope', '$log', 'authorData','$http'];

function authorCtrl(authorService, $scope, $log, authorData,$http) {
    findAllAuthor();

    function findAllAuthor() {
        authorService.findAuthor(authorData).then(function (resp) {
            $log.info('Found Author');
            $log.info(resp.data);
            $scope.authorData1 = resp.data;
        });

        $http.get('/book/BookByAuthor/' + authorData).then(function (resp) {
            $log.info(resp.data);
            $scope.authorData2 = resp.data;
        })
    }
}
