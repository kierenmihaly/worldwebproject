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
		
		
		
	System.out.println("listproductaction service 실행전 ");

		ProductService service=new ProductServiceImpl();
	System.out.println("listproductaction service 실행중 ");
		HashMap<String,Object> map=service.getProductList(searchVO);
		
		
		//hashmap은 key value구하는것 , serice = dao가 db에서 가져온 데이터 전달받아 가공 
	System.out.println("listproductaction service 실행후 ");
		
		request.setAttribute("map", map);
		request.setAttribute("searchVO", searchVO);
		request.setAttribute("menu", request.getParameter("menu"));
		
	
	
		return "forward:/product/listProduct.jsp";
	}
}