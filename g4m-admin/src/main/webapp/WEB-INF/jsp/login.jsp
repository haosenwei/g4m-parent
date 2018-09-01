<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Login Page - Ace Admin</title>

		<meta name="description" content="User login page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="/static/assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="/static/assets/font-awesome/css/font-awesome.min.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="/static/assets/css/ace.min.css" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="/static/assets/css/ace-part2.css" />
		<![endif]-->
		<link rel="stylesheet" href="/static/assets/css/ace-rtl.min.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="/static/assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="/static/assets/js/html5shiv.js"></script>
		<script src="/static/assets/js/respond.js"></script>
		<![endif]-->
		
		<style type="text/css">
			@font-face {
			  font-family: 'Open Sans';
			  font-style: normal;
			  font-weight: 300;
			  src: local('Open Sans Light'), local('OpenSans-Light'), url(/static/assets/fonts/OpenSans-300.woff) format('woff');
			}
			@font-face {
			  font-family: 'Open Sans';
			  font-style: normal;
			  font-weight: 400;
			  src: local('Open Sans'), local('OpenSans'), url(/static/assets/fonts/OpenSans-400.woff) format('woff');
			}
		
		</style>
		
	</head>

	<body class="login-layout light-login">
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
						<div class="login-container">
							<div class="center">
								<h1>
									<i class="ace-icon fa fa-leaf green"></i>
									<span class="red">Ace</span>
									<span class="white" id="id-text2">Application</span>
								</h1>
								<h4 class="blue" id="id-company-text">&copy; Company Name</h4>
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="login-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												<i class="ace-icon fa fa-coffee green"></i>
												Please Enter Your Information
											</h4>
											<div class="space-6"></div>
											<c:url value="/login" var="loginUrl" />
											<form action="${loginUrl}" method="post">
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" name="username" placeholder="username" />
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" name="password" placeholder="password" />
															<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<div class="space"></div>

													<div class="clearfix">
														<c:if test="${param.error != null}">
															<label class="inline">
																<span class="lbl">密码错误</span>
															</label>
														</c:if>
														<c:if test="${param.logout != null}">
															<label class="inline">
																<span class="lbl">注销成功</span>
															</label>
														</c:if>

														<button type="submit" class="width-35 pull-right btn btn-sm btn-primary">
															<i class="ace-icon fa fa-key"></i>
															<span class="bigger-110">Login</span>
														</button>
													</div>

													<div class="space-4"></div>
												</fieldset>
											</form>
											<div class="space-6"></div>
										</div><!-- /.widget-main -->
									</div><!-- /.widget-body -->
								</div><!-- /.login-box -->
							</div><!-- /.position-relative -->
						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.main-content -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='/static/assets/js/jquery-2.1.4.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='/static/assets/js/jquery1x.js'>"+"<"+"/script>");
		</script>
		<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='/static/assets/js/jquery.mobile.custom.js'>"+"<"+"/script>");
		</script>
	</body>
</html>