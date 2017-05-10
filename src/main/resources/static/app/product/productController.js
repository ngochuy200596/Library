var routerApp = angular.module('myApp');

routerApp.controller('productCtrl', productCtrl);

productCtrl.$inject = ['productService', '$scope', '$log', 'productData'];

function productCtrl(productService, $scope, $log, productData) {
    findAllProduct();

    function findAllProduct() {
        productService.findProduct(productData).then(function (resp) {
            $log.info('Found Product');
            $log.info(resp.data);
            $scope.ReleasePreparation = resp.data;
        });

    }


    // function findAllProduct(){
    //     $http.get("/book/" + productData).then(function (response) {
    //         $log.info('FindAll Product');
    //         $log.info(productData);
    //         $scope.ReleasePreparation = response.data;
    //     });
    // }
}
