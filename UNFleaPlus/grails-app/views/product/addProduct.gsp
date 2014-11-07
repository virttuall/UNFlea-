<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="addProduct" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="addProduct.css" />
<asset:javascript src="addProduct.js" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="dropzoneAddProduct.js" />
<asset:stylesheet src="dropzone.css" />
</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>

				</button>
				<a class="font-menu" href="#"> ${params.name}
				</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Home</a></li>
					<li><a href="#">Profile</a></li>
					<li><g:link controller="user" action="logout">Logout</g:link>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="margin-menu container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="well well-sm">

					<form class="form-horizontal" name="genDesc">
						<g:set var="name_input" value="${g.message(code: 'nameVar')}"
							scope="page" />
						<g:set var="description_input"
							value="${g.message(code: 'descriptionVar')}" scope="page" />
						<g:set var="state_input" value="${g.message(code: 'stateVar')}"
							scope="page" />
						<fieldset>
							<legend class="text-center">
								<g:message code="addProduct" />
							</legend>

							<!-- Name input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="name"><g:message
										code="nameVar" /></label>
								<div class="col-md-9">
									<input id="myName" name="myName" type="text"
										onchange="onChangeName()" placeholder="${name_input }"
										class="form-control" required>
								</div>
							</div>

							<!-- Description body -->
							<div class="form-group">
								<label class="col-md-3 control-label" for="message"><g:message
										code="descriptionVar" /></label>
								<div class="col-md-9">
									<textarea class="form-control" id="myDescription"
										onchange="onChangeDescription()" name="myDescription"
										placeholder="${description_input }" rows="5" maxlength="200"
										required></textarea>
								</div>
							</div>
							<!-- State selection -->

							<div class="form-group">
								<label class="col-md-3 control-label" for="state"><g:message
										code="stateVar" /></label>
								<div class="col-md-9">
									<label class="radio-inline"> <input type="radio"
										name="myState" id="myNormalState" onchange="onChangeState()"
										checked> <g:message code="normalVar" />
									</label> <label class="radio-inline"> <input type="radio"
										name="myState" id="myAuctionState" onchange="onChangeState()">
										<g:message code="auctionVar" />
									</label> <label class="radio-inline"> <input type="radio"
										name="myState" id="myDonateState" onchange="onChangeState()">
										<g:message code="donateVar" />
									</label>
								</div>
							</div>
							<div class="myAuctionOptions" id="myAuctionOptions">
								<g:set var="date_now" value="${dateNow = new Date()}" />
								<div class="form-group">
									<label class="col-md-3 control-label" for="state"><g:message
											code="dateStartVar" /></label>
									<div class="col-md-9">
										<g:datePicker name="myDateStart" id="myDateStart"
											value="${dateNow}" precision="minute"
											years="${date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2}" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label" for="state"><g:message
											code="dateEndVar" /></label>
									<div class="col-md-9">
										<g:datePicker name="myDateEnd" id="myDateEnd"
											value="${dateNow}" precision="minute"
											years="${date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2}" />
									</div>
								</div>
							</div>


							<!-- Form actions -->


						</fieldset>

					</form>
					<fieldset>
						<div id="dropzone">
							<form controller="product" action="addProduct"
								class="dropzone dz-clickable" method="post"
								enctype="multipart/form-data" name="files">
								<input id="name" name="name" type="hidden" /> <input
									id="description" name="description" type="hidden" /> <input
									id="state" name="state" type="hidden" value="0" />
								<div id="datesAuction">
									<g:datePicker name="dateStart" id="dateStart"
										value="${dateNow}" precision="minute"
										years="${date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2}" />
									<p>
										<g:datePicker name="dateEnd" id="dateEnd" value="${dateNow}"
											precision="minute"
											years="${date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2}" />
								</div>
							</form>
							<div class="form-group" style="margin-top: 10px">
								<div class="col-md-12 text-right">
									<button class="btn btn-primary btn-lg" id="submit-all"
										onclick="submitForms()">
										<g:message code="send" />
									</button>
								</div>
							</div>
						</div>
					</fieldset>

				</div>

			</div>
		</div>
	</div>


</body>
</html>