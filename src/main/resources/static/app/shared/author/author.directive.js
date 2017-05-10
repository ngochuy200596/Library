// var routerApp = angular.module('myApp');
//
// routerApp.directive('findAuthorRandom', findAuthorRandom);
//
// findAuthorRandom.$inject = ['$log', '$http'];
//
// function findAuthorRandom($log, $http) {
//     return {
//         link: link,
//         templateUrl: 'app/shared/author/author.html',
//         replace: true,
//         restrict: 'E'
//     };
//
//     function link($scope) {
//         $log.info('findAuthor directive');
//         findAuthorRandom();
//
//         function findAuthorRandom() {
//             $http.get("/author/authorRandom").then(function (response) {
//                 $scope.author = response.data;
//             });
//         }
//     }
// }
