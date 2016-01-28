<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <!-- Fixed navbar -->
	    <nav class="navbar navbar-default navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" ng-click="ctrl.pegaPagina('consulta')">Filmes</a>
	        </div>
	        <div id="navbar" class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li ng-class="{'active' : ctrl.pagina == 'consulta'}"><a ng-click="ctrl.pegaPagina('consulta')">Consulta Filmes</a></li>
	            <li ng-class="{'active' : ctrl.pagina == 'cadastra'}"><a ng-click="ctrl.pegaPagina('cadastra')">Cadastra Filmes</a></li>
	            <li ng-class="{'active' : ctrl.pagina == 'edita'}"><a ng-click="ctrl.pegaPagina('edita')">Informações dos Filmes</a></li>
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
	    </nav>