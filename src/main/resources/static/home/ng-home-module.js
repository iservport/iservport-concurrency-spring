(function() {
	app = angular.module('home', ['angular-loading-bar'])
	/**
	 * Home controller
	 */
    .controller('HomeController', ['$scope', '$rootScope', '$window', '$http', '$filter', '$log', '$interval'
	                                  , function($scope, $rootScope, $window, $http, $filter, $log, $interval) {

            const $ctrl = this;

			$http.get("/api/game/start")
				.then(function(response) {
					$scope.game = response.data;
				}).catch(function(e) { $log.error("Game start FAILED"+e); })
		}])
    ;

} )();
