var routerApp = angular.module('myApp');
routerApp.factory('authorService', authorService);

authorService.$inject = ['$http', '$log'];

function authorService($http, $log) {
    return {
        findAuthor: findAuthor
    };

    function findAuthor(authorData) {
        $log.info('find author service');
        return $http.get("/author/" + authorData);
    }
}