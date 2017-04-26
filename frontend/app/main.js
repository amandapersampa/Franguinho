var app = angular.module('MicroGerApp', ['ngRoute']);

app.config(function ($routeProvider, $locationProvider) {
    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });
    $routeProvider.when('/', {
        templateUrl: 'index.html'
    });
    $routeProvider.when("/estoque", {
        templateUrl: '/views/Estoque/TelaPrincipalEstoque.html'
    });

    $routeProvider.when("/pessoas", {
        templateUrl: '/views/Pessoas/TelaPrincipalPessoa.html'
    });

    $routeProvider.otherwise({ redirectTo: '/' });

});