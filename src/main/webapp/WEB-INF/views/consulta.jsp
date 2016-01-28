		<div class="panel panel-default col-md-10 col-md-offset-1">
			<div class="panel-heading">
				<h1>Consulta Filme</h1>
			</div>
			<div class="panel-body">
				<form name="consultaPessoa" >
					<div class="col-md-4 row">
								
						<label class="label label-default">Título: </label> 
						<input type="text" class="form-control" ng-model="ctrl.titulo"> <br>
						<button ng-click="ctrl.consultaTitulo()"
							class="btn btn-default">Consultar</button>
					</div>

				</form>
					<table class="table table-default">
						<thead>
							<tr>
								<th>Titulo</th>
								<th>Data de Lançamento</th>
								<th>Genero</th>
								<th>Local</th>
							</tr>
						</thead>
						<tbody>
								<tr ng-repeat="filme in ctrl.filmes">
									<td>{{filme.titulo}}</td>
									<td>{{filme.dtLancamento}}</td>
									<td>{{filme.genero}}</td>
									<td>{{filme.local}}</td>
									<td><a ng-click="ctrl.viewFilme(filme.id)"
											class="btn btn-primary btn-xs">Editar</a></td>
									<!-- } -->
									<td><a ng-click="ctrl.deleteFilme(filme.id)"
										class="btn btn-danger btn-xs">Deletar</a></td>
								</tr>
						</tbody>
					</table>
			</div>
		</div>