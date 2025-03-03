package air.Deve.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class UserEntity {

	@Id
	
	private Long id;
	 
	private String Name;
	private String Role;
	private String Salary;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}

	
}
