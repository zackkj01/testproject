<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html>

		<div class="py-1 bg-black">
    	<div class="container">
    		<div class="row no-gutters d-flex align-items-start align-items-center px-md-0">
	    		<div class="col-lg-12 d-block">
		    		<div class="row d-flex">
		    			<div class="col-md pr-4 d-flex topper align-items-center">
					    	<div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-phone2"></span></div>
						    <span class="text">0349677437</span>
					    </div>
					    <div class="col-md pr-4 d-flex topper align-items-center">
					    	<div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-paper-plane"></span></div>
						    <span class="text">leducit98@gmail.com</span>
					    </div>
					    <div class="col-md-5 pr-4 d-flex topper align-items-center text-lg-right">
						    <span class="text">3-5 NGÀY LÀM VIỆC GIAO HÀNG &amp;ĐỔI TRẢ MIỄN PHÍ</span>
					    </div>
				    </div>
			    </div>
		    </div>
		  </div>
    </div>
 
    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container">
	      <a class="navbar-brand" href="<c:url value="/"/>">Minishop</a>
	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="oi oi-menu"></span> Menu
	      </button>

	      <div class="collapse navbar-collapse" id="ftco-nav">
	        <ul class="navbar-nav ml-auto">
	          <li class="nav-item active"><a href="<c:url value="/"/>" class="nav-link">Trang Chủ</a></li>
	          <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Mục Lục</a>
              <div class="dropdown-menu" aria-labelledby="dropdown04">
              	<a class="dropdown-item" href="shop.html">Shop</a>
                <a class="dropdown-item" href="product-single.html">Sản phẩm đơn lẻ</a>
                <a class="dropdown-item" href="cart.html">Giỏ hàng</a>
                <a class="dropdown-item" href="checkout.html">Checkout</a>
              </div>
            </li>
	          <li class="nav-item"><a href="about.html" class="nav-link">Giới Thiệu</a></li>
	          <li class="nav-item"><a href="${pageContext.request.contextPath}/blog" class="nav-link">Tin Tức</a></li>
	          <li class="nav-item"><a href="contact.html" class="nav-link">Liên Hệ</a></li>
	          <li class="nav-item cta cta-colored"><a href="<c:url value="gio-hang"/>" class="nav-link"><span class="icon-shopping_cart">[${Total_Quanty_Cart}]</span></a></li>

	        </ul>
	      </div>
	    </div>
	  </nav>
    <!-- END nav -->
     <div class="hero-wrap hero-bread" style="background-image: url('<c:url value="/resources/images/bg_6.jpg"/>');">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          	<p class="breadcrumbs"><span class="mr-2"><a href="index.html">Home</a></span> <span>Cart</span></p>
            <h1 class="mb-0 bread">My Wishlist</h1>
          </div>
        </div>
      </div>
    </div>
 