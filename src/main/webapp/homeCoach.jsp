<%@page import="it.contrader.dto.UserDTO"%>
<%@ include file="/function/header.jsp"%>
<body>
	<%
		UserDTO userDTO = (UserDTO) request.getAttribute("userDTO");
	%>
	<!-- container section start -->
	<section id="container" class="">
		<!--header start-->
		<header class="header dark-bg">
			<div class="toggle-nav">
				<div class="icon-reorder tooltips"
					data-original-title="Toggle Navigation" data-placement="bottom">
					<i class="icon_menu"></i>
				</div>
			</div>

			<!--logo start-->
			<a href="index.html" class="logo">Welcome <span class="lite"><%=userDTO.getUsertype().name()%>
					<%=userDTO.getName()%> <%=userDTO.getSurname()%></span></a>
			<!--logo end-->

			<%@ include file="/function/dropDownProfile.jsp"%>
		</header>
		<!--header end-->

		<!--sidebar start-->
		<%@ include file="/function/menuCoach.jsp"%>
		<!--sidebar end-->

		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">
				<div class="row">
					<div class="col-lg-12">
						<h3 class="page-header">
							<i class="fa fa-list-alt"></i> Dashboard
						</h3>
						<jsp:include page="/player/playerManagement/" flush="true">
							<jsp:param name="idCoach" value="<%=userDTO.getId()%>" />
						</jsp:include>
					</div>
				</div>
			</section>


		</section>
		<br>
		<%@ include file="/function/footer.jsp"%>