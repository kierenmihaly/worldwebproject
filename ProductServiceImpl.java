package com.model2.mvc.service.product.impl;

import java.util.HashMap;

import com.model2.mvc.common.SearchVO;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.dao.ProductDAO;
import com.model2.mvc.service.product.vo.ProductVO;

public class ProductServiceImpl implements ProductService {

	
private ProductDAO productDAO;
	
	public ProductServiceImpl() {
		productDAO=new ProductDAO();
	}

	@Override
	public void addProduct(ProductVO productVO) throws Exception {
		// TODO Auto-generated method stub
		productDAO.insertProduct(productVO);
		//add���� insert�ϴ°�
	}

	@Override
	public ProductVO getProduct(int prodNo) throws Exception {
		// TODO Auto-generated method stub
		
		return productDAO.findProduct(prodNo);
		//������ �������°� select , find�� ��������� �������� �޼���  , ��ǰ�����ϳ��� find product
	}

	@Override
	public HashMap<String, Object> getProductList(SearchVO searchVO) throws Exception {
		// TODO Auto-generated method stub
		return productDAO.getProductList(searchVO);
		//��� ��ü�������°� productList 
	}

	@Override
	public void updateProduct(ProductVO productVO) throws Exception {
		// TODO Auto-generated method stub
		productDAO.updateProduct(productVO);

	}

}
