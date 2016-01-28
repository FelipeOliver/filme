<div class="panel panel-default col-md-8 col-md-offset-2">
		<div class="panel-heading">
			<h1>Visualiza Filme</h1>
		</div>
		<div class="panel-body">
			<form name="savePessoa" ng-submit="ctrl.saveFilmeView()">
				<span hidden>{{ctrl.filmeView.id}}</span>
				<div class="row">
						<label class="label label-default">Título</label>
						<input type="text"
							   ng-model="ctrl.filmeView.titulo"
							   class="form-control">
					    
					    <label class="label label-default">Diretor</label>
						<input type="text"
							   ng-model="ctrl.filmeView.diretor"
							   class="form-control">
					    
					    <label class="label label-default">Data de lançamento</label>
						<input type="text"
							   ng-model="ctrl.filmeView.dtLancamento"
							   class="form-control">
						
						<label class="label label-default">Elenco</label>
						<input type="text"
							   ng-model="ctrl.filmeView.elenco"
							   class="form-control">
					    
					    <label class="label label-default">Genêro</label>
						<input type="text"
							   ng-model="ctrl.filmeView.genero"
							   class="form-control">
							   
					    <label class="label label-default">Local</label>
						<input type="text"
							   ng-model="ctrl.filmeView.local"
							   class="form-control">	   
				</div>
				<!-- TextArea -->
				<div class="row">
					<div class="col-md-6">
						<label class="label label-default">Sinopse:</label>
						<textarea type="textarea"
							      ng-model="ctrl.filmeView.sinopse"
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