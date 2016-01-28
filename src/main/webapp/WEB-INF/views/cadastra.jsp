	<div class="panel panel-default col-md-8 col-md-offset-2">
		<div class="panel-heading">
			<h1>Cadastro de Filmes</h1>
		</div>
		<div class="panel-body">
			<form name="savePessoa" ng-submit="ctrl.saveFilme()">
				<div class="row">
						<label class="label label-default">Título</label>
						<input type="text"
							   ng-model="ctrl.filme.titulo"
							   class="form-control">
					    
					    <label class="label label-default">Diretor</label>
						<input type="text"
							   ng-model="ctrl.filme.diretor"
							   class="form-control">
					    
					    <label class="label label-default">Data de lançamento</label>
						<input type="text"
							   ng-model="ctrl.filme.dtLancamento"
							   class="form-control">
						
						<label class="label label-default">Elenco</label>
						<input type="text"
							   ng-model="ctrl.filme.elenco"
							   class="form-control">
					    
					    <label class="label label-default">Genêro</label>
						<input type="text"
							   ng-model="ctrl.filme.genero"
							   class="form-control">
							   
					    <label class="label label-default">Local</label>
						<input type="text"
							   ng-model="ctrl.filme.local"
							   class="form-control">	   
				</div>
				<!-- TextArea -->
				<div class="row">
					<div class="col-md-6">
						<label class="label label-default">Sinopse:</label>
						<textarea type="textarea"
							      ng-model="ctrl.filme.sinopse"
							      class="form-control"></textarea>
					</div>  
				</div>
				<div class="row">
					<br>
					<button type="submit"
						   class="btn btn-default">Save</button>
				</div>
			</form>		   	   
		</div>
	</div>