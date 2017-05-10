var routerApp = angular.module('myApp');

routerApp.controller('CategoryCtrl',categoryCtr);

categoryCtr.$inject = ['categoryService','$scope','$log','categoryID','$http'];

function categoryCtr(categoryService,$scope,$log,categoryID,$http) {
    findAllCategory();

    function findAllCategory() {
        $log.info('Category Controller');
        categoryService.findCategory(categoryID).then(function (resp) {
            $log.info('category1');
            $log.info(resp.data);
            $scope.categoryData = resp.data;
        });

        $http.get("/category/" + categoryID).then(function (resp) {
            $log.info('category2');
            $log.info(resp.data);
            $scope.categoryData1 = resp.data;
        });

        $http.get("/category/parent/" + categoryID).then(function (resp) {
            $log.info('category3');
            $log.info(resp.data);
            $scope.categoryData2 = resp.data;
        });
    }
}




