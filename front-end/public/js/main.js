var app = angular.module('MicroGerApp', [ 'ngRoute', 'ngResource' ]);

app.config(function($routeProvider, $provide, $httpProvider,
				$locationProvider) {
			$routeProvider.when("/", {
				templateUrl : "views/Inicio/inicio.html",
				controller : "IndexController"
			}).when("/estoque", {
				templateUrl : "views/Estoque/TelaPrincipalEstoque.html",
				controller : "EstoqueController"
			}).when("/cardapio", {
				templateUrl : "views/Cardapio/TelaPrincipalCardapio.html",
				controller : "CardapioController"
			}).when("/cadastroProduto", {
				templateUrl : "views/Estoque/CadastroProduto.html",
				controller : "EstoqueController"
			}).when("/cadastroCompra", {
				templateUrl : "views/Cardapio/TelaPrincipalCardapio.html",
				controller : "EstoqueController"
			}).when("/tabelaProduto", {
				templateUrl : "views/Cardapio/TelaPrincipalCardapio.html",
				controller : "EstoqueController"
			}).otherwise({
				redirectTo : '/'
			});
		});

angular.module('MicroGerApp').factory('HomeService',
		[ '$http', '$q', function($http, $q) {
			var REST_SERVICE_URI = 'http://localhost:8080/';
			$http.get(REST_SERVICE_URI);
    		 $http.defaults.headers.post["Content-Type"] = "application/json";

		} ]);