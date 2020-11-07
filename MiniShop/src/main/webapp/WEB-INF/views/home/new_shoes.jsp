<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>

    <section class="ftco-section bg-light">
    	<div class="container">
				<div class="row justify-content-center mb-3 pb-3">
          <div class="col-md-12 heading-section text-center ftco-animate">
            <h2 class="mb-4">Giày Mới Về</h2>
            <p>Đến với "MINISHOP.VN” quý khách hàng sẽ có những sản phẩm ưng ý nhất, chất lượng phục vụ tốt và giá thành tốt nhất, cùng những “ Chương Trình Khuyến Mãi Đặc Biệt”.</p>
          </div>
        </div>   		
    	</div>
    	<div class="container">
    		<div class="row">
    			<c:forEach items="${getProductnew_shoes}" var="product">	

    			<div class="col-sm-12 col-md-6 col-lg-3 ftco-animate d-flex">

    				<div class="product d-flex flex-column">
    					<a href="resources/${product.getImage()}" class="img-prod"><img class="img-fluid" src="resources/${product.getImage()}" alt="Colorlib Template">
    					</a>
    					<div class="text py-3 pb-4 px-3">
    						<div class="d-flex">
    							<div class="cat">
		    						<span>Lifestyle</span>
		    					</div>
		    					<div class="rating">
	    							<p class="text-right mb-0">
	    								<a href="#"><span class="ion-ios-star-outline"></span></a>
	    								<a href="#"><span class="ion-ios-star-outline"></span></a>
	    								<a href="#"><span class="ion-ios-star-outline"></span></a>
	    								<a href="#"><span class="ion-ios-star-outline"></span></a>
	    								<a href="#"><span class="ion-ios-star-outline"></span></a>
	    							</p>
	    						</div>
	    					</div>
    						<h3><a href="product/${product.getId() }">${product.getTitle() }</a></h3>
    						<div class="pricing">
	    						<p class="price"><span><fmt:formatNumber value="${product.getPrice()}"
													type="currency" maxIntegerDigits="14" /></span></p>
	    					</div>
	    					<p class="bottom-area d-flex px-3">
    							<a href="cart" class="add-to-cart text-center py-2 mr-1"><span>Thêm vào giỏ <i class="ion-ios-add ml-1"></i></span></a>
    							<a href="product/${product.getId() }" class="buy-now text-center py-2">Chi tiết<span><i class="ion-ios-cart ml-1"></i></span></a>
    						</p>
    					</div>
    				</div>
    			</div>			
    			</c:forEach>

    		</div>
    	</div>
    </section>

