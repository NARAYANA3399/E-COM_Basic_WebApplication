package air.Deve.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import air.Deve.Entity.UserEntity;

@Repository

	public interface UserRepo extends JpaRepository<UserEntity, Long>{
} 
