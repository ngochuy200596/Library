var routerApp = angular.module('myApp');

routerApp.controller('categoryDetailCtrl',categoryDetailCtrl);

categoryDetailCtrl.$inject = ['categoryDetailService','$scope'];

function categoryDetailCtrl(categoryDetailService,$scope){
    findBookByCategory();

    function findBookByCategory() {
        categoryDetailService.findCategory().then(function (response) {
            $scope.categoryDetail = response.data;
        })
    }
}
