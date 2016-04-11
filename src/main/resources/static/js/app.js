var myApp = angular.module('myApp', []);

myApp.controller("counterController", function($http, $scope) {
    $scope.increment =  function() {
        $http.get('/counter').success(function(data) {
            $scope.count = data;
        });
    }

    $scope.increment();
});


myApp.controller("additionController", function($http, $scope) {
    $scope.add =  function() {
        $http.get('/adder',{params:{firstNumber: $scope.firstNumber, secondNumber: $scope.secondNumber}}).success(function(data){
            $scope.additionResult = data;
        });
    }


});

myApp.controller("numeralController", function($http, $scope) {
	$scope.numberResult ="";
    $scope.numeral =  function() {
        $http.get('/numeral',{params:{number: $scope.number}}).success(function(data){
            $scope.numberResult = data;
        });
    }


});