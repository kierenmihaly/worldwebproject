package com.model2.mvc.view.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;





public class AddProductAction extends Action {

	public String execute(	HttpServletRequest request,
												HttpServletResponse response) throws Exception {
		Product product=new Product();
	
		product.setProdName(request.getParameter("prodName"));
		product.setProdDetail(request.getParameter("prodDetail"));
		product.setManuDate(request.getParameter("manuDate"));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setFileName(request.getParameter("fileName"));
									//겟파라미터로 메뉴데이터 
	
		
		System.out.println("AddProductAction ::"+product);
		
		ProductService service=new ProductServiceImpl();
		service.addProduct(product);
		
		/* request.setAttribute("product", product); */
		//오브젝트스코프  productVO를 쓰면 productvo get하겠다는거 
		
		return "forward:/product/addProduct.jsp";
	}
}

