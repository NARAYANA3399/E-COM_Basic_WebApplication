package air.Deve.Controller;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import air.Deve.Entity.UserEntity;
import air.Deve.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@GetMapping
	public List<UserEntity> getAllData() {
		return userService.getAllData();
	}
	
	@GetMapping("/id")
	public Optional<UserEntity> getData(@PathVariable Long id) {
		return userService.getData(id);
	} 
	
	@PostMapping
	public String postData(@RequestBody UserEntity user) {
		return userService.addedData(user);
	}
	
	@DeleteMapping("/id")
	public void delete() {
		 userService.deleteData();
	}
	
}
