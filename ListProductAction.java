package com.model2.mvc.view.product;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.common.SearchVO;
import com.model2.mvc.framework.Action;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;


public class ListProductAction extends Action {
	
	public String execute(	HttpServletRequest request,
												HttpServletResponse response) throws Exception {
		SearchVO searchVO=new SearchVO();
		
	
	
		int page=1;
		if(request.getParameter("page") != null)
		page=Integer.parseInt(request.getParameter("page"));
	
		searchVO.setPage(page);
		searchVO.setSearchCondition(request.getParameter("searchCondition"));
		searchVO.setSearchKeyword(request.getParameter("searchKeyword"));
		
		String pageUnit=getServletContext().getInitParameter("pageSize");
		searchVO.setPageUnit(Integer.parseInt(pageUnit));
		
		
		
	System.out.println("listproductaction service ������ ");

		ProductService service=new ProductServiceImpl();
	System.out.println("listproductaction service ������ ");
		HashMap<String,Object> map=service.getProductList(searchVO);
		
		
		//hashmap�� key value���ϴ°� , serice = dao�� db���� ������ ������ ���޹޾� ���� 
	System.out.println("listproductaction service ������ ");
		
		request.setAttribute("map", map);
		request.setAttribute("searchVO", searchVO);
		request.setAttribute("menu", request.getParameter("menu"));
		
	
	
		return "forward:/product/listProduct.jsp";
	}
}