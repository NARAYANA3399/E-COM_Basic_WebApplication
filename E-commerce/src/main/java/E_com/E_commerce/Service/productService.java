package E_com.E_commerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import E_com.E_commerce.Entity.product;
import E_com.E_commerce.Repositroy.productRepo;

@Service
public class productService {
	@Autowired
	private productRepo repo;
	
	private productService(productRepo repo) {
		this.repo=repo;
	}
	
	public List<product> productList() {
		return repo.findAll();
	}
	public product productAdd(product entity) {
		return repo.save(entity);
	}
	
	public Optional<product> edit(Integer id) {
		return repo.findById(id);
	}
	public product update(product entity) {
		return repo.save(entity);
	}
	public void delete(Integer id) {
		 repo.deleteById(id);
	}
	
}
