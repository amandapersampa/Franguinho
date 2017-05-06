var app = angular.module('MicroGerApp', ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "resources/views/Inicio/inicio.html",
            controller: "IndexController"
        })
        .when("/estoque", {
            templateUrl: "resources/views/Estoque/TelaPrincipalEstoque.html",
            controller: "EstoqueController"
        })
        .when("/cardapio", {
            templateUrl: "resources/views/Cardapio/TelaPrincipalCardapio.html",
            controller: "CardapioController"
        })
        .otherwise({
            redirect: '/'
        });
});