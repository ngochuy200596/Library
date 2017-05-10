var routerApp = angular.module('myApp');

routerApp.controller('CategoryHomeCtrl',function (getCategory,$scope,$log) {
    findAllCategory();

    function findAllCategory(){
        getCategory.findAllCategory().then(function (response) {
            $scope.categoryData = response.data;
            $log.info('FindAll Category home')
        })
    }
})