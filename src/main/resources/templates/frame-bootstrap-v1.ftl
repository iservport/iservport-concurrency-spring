[#ftl]
<!DOCTYPE html >
<html data-ng-app="${baseName}" data-ng-cloak
	  id="ng-app"
	  xmlns:ng="http://angularjs.org" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	  xsi:schemaLocation="http://angularjs.org ">

<head>
	<meta content="text/html; iso-8859-1" http-equiv="content-type"/>
	<meta http-equiv="content-language" content="${.locale!'pt-BR'}"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	[#include "v1/frame-head-v1.ftl" /]
	<title>${title!''}</title>

	[#if _csrf??]
	<meta name="_csrf" content="${_csrf.token}"/>
	<!-- default header name is X-CSRF-TOKEN -->
	<meta name="_csrf_header" content="${_csrf.headerName}"/>
	[/#if]

</head>
<body id="app"
	  data-ng-controller="${baseName?capitalize}Controller as _main"
	  style="height: 100vh;"
	  class="app ng-animate [#if navCollapsedMin?? && navCollapsedMin]nav-collapsed-min[#else]nav-collapsed-min-hide [/#if] ">

[#if _csrf??]
	<input type="hidden" id="_csrf" name="${_csrf.parameterName}" value="${_csrf.token}"/>
[/#if]

<!--
	 ! Top line.
	 ! -->
<section id="header"
		 class="header-container header-fixed bg-dark hidden-print">
	[#include "v1/frame-top-v1.html" /]
</section>

<!--
	 ! Main content
	 ! -->
<div class="main-container">
	<aside id="nav-container"
		   class="nav-container nav-fixed nav-vertical">
		[#include "v1/frame-menu-v1.html" /]
	</aside>

	<div id="content" class="content-container">
		<section class="view-container animate-fade-up">
			<div class="page-top hidden-print" ng-hide="topHide">
				<fieldset ng-disabled="noQualifiers()">
					<div class="row" ng-include="'/assets/${baseName}/selection-${baseName}-top.html'"></div>
				</fieldset>
			</div>
			<div class="container-x page page-dashboard">
				<div class="row">
					<div id="selection-page" class="col-md-12" ng-include="'${baseName}/selection-${baseName}.html'">

					</div>
				</div>
			</div><!-- end of page -->
		</section>
	</div><!--content-->
</div><!--main-container-->

[#include "v1/scripts.html" /]

</body>

</html>
