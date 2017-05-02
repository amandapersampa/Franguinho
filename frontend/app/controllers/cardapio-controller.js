angular.module('MicroGerApp')
    .controller('CardapioController', function($scope, $http) {
        $http.get('http://localhost:8080/cardapio').
        then(function(response) {
            $scope.greeting = response.data;
        });

        $scope.foto = {};

    });