angular.module('MainApp',[])
	.controller('filmeController',['$scope', '$http', function($scope, $http){
		console.log('Controller está funcionando');
		var self = this;
		self.pagina = 'consulta';
		
		self.pegaPagina = function(pagina){
			self.pagina = pagina;
		};		
		
		self.saveFilme = function(){
			self.filme.id = '';
			var req   =   "id=" 			+ self.filme.id 
					     + "&titulo=" 		+ self.filme.titulo 
					     + "&sinopse=" 		+ self.filme.sinopse 
					     + "&diretor=" 		+ self.filme.diretor
				         + "&dtLancamento=" + self.filme.dtLancamento 
				         + "&elenco="       + self.filme.elenco 
				         + "&genero=" 		+ self.filme.genero 
				         + "&local=" 		+ self.filme.local;
			var response = $http.get('saveFilme?'+req);
			response.success(function(data, status, headear, config){
				self.message = 'Filme cadastrado com sucesso!';
			});
		};
		
		self.saveFilmeView = function(){
			var req   =   "id=" 			+ self.filmeView.id 
					     + "&titulo=" 		+ self.filmeView.titulo 
					     + "&sinopse=" 		+ self.filmeView.sinopse 
					     + "&diretor=" 		+ self.filmeView.diretor
				         + "&dtLancamento=" + self.filmeView.dtLancamento 
				         + "&elenco="       + self.filmeView.elenco 
				         + "&genero=" 		+ self.filmeView.genero 
				         + "&local=" 		+ self.filmeView.local;
			var response = $http.get('saveFilme?'+req);
			response.success(function(data, status, headear, config){
				self.message = 'Filme Alterado com sucesso!';
			});
		};
		
		self.consultaTitulo = function(){
			var response = $http.get('consultaTitulo?titulo='+self.titulo);
			response.success(function(data, status, headear, config){
				self.filmes = data;
			});
		};
		
		self.deleteFilme = function(id){
			$http.post('deletaFilme?id='+id).then(function(resp){
				self.message = 'Filme Deletado';
				self.consultaTitulo();
			});
		};
		
		self.viewFilme = function(id){
			var response = $http.get('findOne?id='+id);
			response.success(function(data, status, headear, config){
				self.filmeView = data;
				self.pagina = 'edita';
			});	
		};
		
	}]);
