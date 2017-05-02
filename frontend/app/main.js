var app = angular.module('MicroGerApp', ['ngRoute']);

app.config(function($routeProvider, $locationProvider) {
    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });
    $routeProvider.when('/', {
        templateUrl: 'index.html'
    });

    $routeProvider.when("/teste", {
        templateUrl: 'teste.html'
    });

    $routeProvider.when("/estoque", {
        templateUrl: '/views/Estoque/TelaPrincipalEstoque.html'
    });

    $routeProvider.when("/pessoas", {
        templateUrl: '/views/Pessoas/TelaPrincipalPessoa.html'
    });

    $routeProvider.when("/cardapio", {
        templateUrl: '/views/Pessoas/TelaPrincipalCardapio.html'
    });

    $routeProvider.otherwise({ redirectTo: '/' });


});