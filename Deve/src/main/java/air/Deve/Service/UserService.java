package air.Deve.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import air.Deve.Entity.UserEntity;
import air.Deve.Repository.UserRepo;


@Service

public class UserService {
	
	
	@Autowired
	private UserRepo userRepo;
	
	
	public UserService(UserRepo userRepo)
	{
		this.userRepo = userRepo;
	}

	
	public List<UserEntity> getAllData() {
		return userRepo.findAll();
	}
	
	
	public Optional<UserEntity> getData(Long id) {
		return userRepo.findById(id);
	}
	
   
	public String addedData(UserEntity user) {
		 userRepo.save(user);
		 return"User Added";
	}
	
	public void deleteData() {
		 userRepo.deleteById(null);
	}
	

}
