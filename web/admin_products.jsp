<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <!--style>
          table tbody tr:hover {
    background-color: orange;
    cursor: pointer;
}
      </style-->
	<!--
		Charisma v1.0.0

		Copyright 2012 Muhammad Usman
		Licensed under the Apache License v2.0
		http://www.apache.org/licenses/LICENSE-2.0

		http://usman.it
		http://twitter.com/halalit_usman
	-->
	<meta charset="utf-8">
	<title>Baby Shop</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
	<meta name="author" content="Muhammad Usman">

	<!-- The styles -->
	<link id="bs-css" href="css/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="css/bootstrap-responsive.css" rel="stylesheet">
	<link href="css/charisma-app.css" rel="stylesheet">
	<link href="css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='css/fullcalendar.css' rel='stylesheet'>
	<link href='css/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='css/chosen.css' rel='stylesheet'>
	<link href='css/uniform.default.css' rel='stylesheet'>
	<link href='css/colorbox.css' rel='stylesheet'>
	<link href='css/jquery.cleditor.css' rel='stylesheet'>
	<link href='css/jquery.noty.css' rel='stylesheet'>
	<link href='css/noty_theme_default.css' rel='stylesheet'>
	<link href='css/elfinder.min.css' rel='stylesheet'>
	<link href='css/elfinder.theme.css' rel='stylesheet'>
	<link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='css/opa-icons.css' rel='stylesheet'>
        <link href='css/uploadify.css' rel='stylesheet'>
	<link rel="shortcut icon" href="img/favicon.ico">
        
		
</head>

<body >
		
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">		
				</a>
				<a class="brand" href="index.html"> <span>Baby Shop</span></a>
					
				<!-- user dropdown starts -->
				<div class="btn-group pull-right" >
					        <p>
                                                    <button class="btn btn-large" onclick="logout()">Logout</button>
							
						</p>
				</div>
                                
                                <script>
                                 var productIdList;   
                                 var deleteFlag = 0;
                                 var ctr = 0;
                                 function logout()
                                 {
                                     location.href('login.jsp');
                                 }
                                 function getProductId(idpro,checkboxelem)
                                 {
                                     //productIdList = productIdList.concat(idpro,";");
                                    //alert("getpid" + idpro);
                                  

                                        if (checkboxelem.checked) {

                                             productIdList+=";";
                                             productIdList+=idpro;
                                             
                                            alert("getpid" + idpro);
                                        } 

                                   
                                                                     }
                                 function deleteProduct()
                                 {
                                    var options = window.confirm("Are you sure you want to delete the selected items?"); 
                                    if(options = true)
                                    {
                                        //deleteFlag = 1;
                                 
                                    }
                                    else
                                    {
                                        //deleteFlag = 0;
                                    }
                                   
                                 }
                                 
                                </script>
				<!-- user dropdown ends -->
				
				<div class="top-nav nav-collapse">
					<ul class="nav">
						<li><a href="Home.jsp">Visit Site</a></li>
					</ul>
				</div><!--/.nav-collapse -->
			</div>
		</div>
	</div>
	<!-- topbar ends -->
        
		<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu" style="height:600px">
						<li class="nav-header hidden-tablet">Main</li>
						<li><a class="ajax-link" href="index.html"><i class="icon-home"></i><span class="hidden-tablet"> Dashboard</span></a></li>
						<li><a class="ajax-link" href="products.html"><i class="icon-align-justify"></i><span class="hidden-tablet">Products</span></a></li>
						<li><a class="ajax-link" href="table.html"><i class="icon-th"></i><span class="hidden-tablet"> Users</span></a></li>
					</ul>
					
				</div><!--/.well -->
			</div><!--/span-->
			<!-- left menu ends -->
			
			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<div id="content" class="span10">
			
			<div class="row-fluid sortable">
				<div class="box span12">
					<div class="box-header well" data-original-title style="height:30px;">
					<h1>${sessionScope.categoryName}</h1>
                                        
					</div>
					
					<div class="box-content">
						<table class="table table-striped table-bordered bootstrap-datatable datatable">
						  <thead>
							  <tr>
								  <th>Product Title</th>
                                                                  <th>Serial No.</th>
								  <th>Description</th>
                                                                  <th>Price</th>
								  <th>Units</th>
								  <th>Image</th>
                                                                  
								  
							  </tr>
						  </thead>
                                                  
						  <tbody>
                                                      
                                                      <c:forEach items="${requestScope.productList}" var="product">                                                                                                        
							<tr id="tabletr">
                                                                <script>var idp = "${product.id}"
                                                               
                                                                </script>
                                                                
								<td ><input   type="checkbox" onclick="getProductId('${product.id}' ,this) "style="padding: 5px;" id="check" ><c:out value ="${product.title}"/></td>
                               
                                                                <td class="center"><c:out value="${product.id}"/></td>
								<td class="center"><c:out value="${product.description}"/></td>
								<td class="center"><c:out value="${product.units}"/></td>
                                                                <td><c:out value="${product.price}"/></td>
								<td class="center"><c:out value="${product.image}"/></td>	
                                                                <script>ctr++;</script>
                                                        </tr>
                                                     </c:forEach>   
						</tbody>
					</table> 
					<td>&nbsp;<br></td>
					<div class="center">
							
                                                        <a class="btn btn-success" href="admin_addproduct.jsp">
							<i class="icon-plus-sign"></i>  
							Add product                                            
						        </a>
							<a class="btn btn-info" href="#">
							<i class="icon-edit icon-white"></i>  
							Edit                                            
						        </a>
                                            <a class="btn btn-danger"  href="DeleteProductServlet?delProductIds=productIdList">
						       <i class="icon-trash icon-white"></i> 
							Delete
						        </a>
                                                        <!--c:if test = "${deleteFlag =='1'}"-->
                                                            <!--c:redirect url="DeleteProductsServlet?delProductList=productListId"/-->
                                                        <!--/c:if-->    
                                         </div>		

					
				</div>
			</div>	
			
			

			
				
		
	
		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
			</div>
		</div>
		
	
	</div><!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<!-- jQuery -->
	<script src="js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src='js/fullcalendar.min.js'></script>
	<!-- data table plugin -->
	<script src='js/jquery.dataTables.min.js'></script>

	<!-- chart libraries start -->
	<script src="js/excanvas.js"></script>
	<script src="js/jquery.flot.min.js"></script>
	<script src="js/jquery.flot.pie.min.js"></script>
	<script src="js/jquery.flot.stack.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="js/charisma.js"></script>
	
		
</body>
</html>
