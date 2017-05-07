 angular.module('MicroGerApp')
     .controller('IndexController', function($scope, $http) {
    	    $http.get('http://localhost:8080').
            then(function(response) {
                $scope.greeting = response.data;
            });
    });