<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
   		<meta name="viewport" content="width=device-width, initial-scale=1">

	    <!-- Bootstrap core CSS -->
   		<link href="/filme/resources/css/bootstrap.css" rel="stylesheet">

    	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    	<link href="/filme/resources/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    	<!-- Custom styles for this template -->
    	<link href="/filme/resources/css/navbar-fixed-top.css" rel="stylesheet">

    	<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    	<!--[if lt IE 9]><script src="${ pageContext.request.contextPath }/resources/js/bootstrap/3.3.6/ie8-responsive-file-warning.js"></script><![endif]-->
    	<script src="/filme/resources/js/bootstrap/3.3.6/ie-emulation-modes-warning.js"></script>		
	</head>
	
	<body ng-app="MainApp">
		<div ng-controller="filmeController as ctrl">
			<c:import url="core/menu.jsp"></c:import>
			
			<div ng-show="ctrl.pagina == 'consulta'">
				<c:import url="consulta.jsp"></c:import>
			</div>
			
			<div ng-show="ctrl.pagina == 'cadastra'">
				<c:import url="cadastra.jsp"></c:import>
			</div>
			
			<div ng-show="ctrl.pagina == 'edita'">
				<c:import url="edita.jsp"></c:import>
			</div>
						
		</div>
		
		
		<!-- Bootstrap core JavaScript ================================================== -->
    	<!-- Placed at the end of the document so the pages load faster -->
    	<script src="/filme/resources/js/jquery/1.11.3/jquery.min.js"></script>
    	<script>window.jQuery || document.write('<script src="/filme/resources/js/vendor/jquery.min.js"><\/script>')</script>
    	<script src="/filme/resources/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    	<script src="/filme/resources/js/bootstrap/3.3.6/ie10-viewport-bug-workaround.js"></script>
    	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.19/angular.js"> </script>
    	<script src="/filme/resources/js/controllers/filmeController.js"></script>
	</body>
</html>