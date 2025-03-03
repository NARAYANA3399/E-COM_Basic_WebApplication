package E_com.E_commerce.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import E_com.E_commerce.Entity.product;
@Repository
public interface productRepo extends JpaRepository<product, Integer>{

}
