package com.model2.mvc.view.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;
import com.model2.mvc.service.product.vo.ProductVO;


public class UpdateProductAction extends Action {

	public String execute(	HttpServletRequest request,
												HttpServletResponse response) throws Exception {
		
		int prodNo=Integer.parseInt(request.getParameter("prodNo"));
		
		ProductVO productVO=new ProductVO();
		productVO.setProdNo(prodNo);
		productVO.setProdName(request.getParameter("prodName"));
		System.out.println("prodDetail check" +request.getParameter("prodDetail"));
		productVO.setProdDetail(request.getParameter("prodDetail"));
		productVO.setManuDate(request.getParameter("manuDate"));
		productVO.setPrice(Integer.parseInt(request.getParameter("price")));
		productVO.setFileName(request.getParameter("fileName"));
		
	System.out.println("before service");
		
		ProductService service=new ProductServiceImpl();
		service.updateProduct(productVO);
		
	System.out.println("after service");
	System.out.println("before session");
		
	/*
	 * HttpSession session=request.getSession(); System.out.println("2"+session);
	 * System.out.println("1"+(ProductVO)session.getAttribute("product")); int
	 * sessionId=((ProductVO)session.getAttribute("product")).getProdNo();
	 * System.out.println(sessionId);
	 * 
	 * System.out.println("after session"); System.out.println("before sessionId");
	 * 
	 * if(sessionId==prodNo){ session.setAttribute("product", productVO); }
	 */
	
	System.out.println("after sessionId");
		
		return "redirect:/getProduct.do?prodNo="+prodNo+"&menu=manage";
	}
}
