var routerApp = angular.module('myApp',['ui.router']);

routerApp.config(function ($stateProvider,$urlRouterProvider) {
    $urlRouterProvider.otherwise('/home');

    $stateProvider
        .state('home',{
            url:'/home',
            templateUrl:'app/home/homeView.html',
            controller:'CategoryHomeCtrl',
        })
        .state('product',{
            url:'/product/{bookID}',
            templateUrl:'app/product/productView.html',
            controller:'productCtrl',
            resolve: {
                productData: function ($stateParams) {
                    return $stateParams.bookID;
                }
            }
        })
        .state('category',{
            url:'/category/{categoryID}',
            templateUrl:'app/category/categoryView.html',
            controller:'CategoryCtrl',
            resolve:{
                categoryID: function ($stateParams) {
                    return $stateParams.categoryID;
                }
            }
        })

        .state('author',{
            url:'/author/{authorID}',
            templateUrl:'app/author/authorView.html',
            controller:'authorCtrl',
            resolve:{
                authorData: function ($stateParams) {
                    return $stateParams.authorID;
                }
            }
        })

        .state('categoryDetail',{
            url:'/categoryDetail/{categoryID}',
            templateUrl: 'app/categoryDetail/categoryDetailView.html',
            controller:'categoryDetailCtrl',
        })

        .state('add',{
            url:'/add',
            templateUrl:'addUsers/addUser.html',
            controller:'addUserCtrl',
        })
});

// routerApp.controller('productCtrl',function ($log, $http, $scope, productData) {
//     $log.info('productData: ');
//     $log.info(productData);
//     get(productData);
//     function get(productData) {
//         if(productData!==0){
//             $http.get("/book/ReleaseDate").then(function (response) {
//                 $scope.ReleasePreparation = response.data;
//             });
//         }
//     }
// });