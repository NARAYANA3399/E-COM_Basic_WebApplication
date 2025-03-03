package E_com.E_commerce.Controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import E_com.E_commerce.Entity.product;
import E_com.E_commerce.Service.productService;


@Controller
public class productController {

	private productService service;
	private productController(productService service) {
		this.service=service;
	}
	
    @GetMapping("/pro")// LogOut Page
    public String homePage() {
        return "/home";
    }
	
	@GetMapping("/")// Return "Product View"
	public String productList(Model model) {
		model.addAttribute("products",service.productList());
		return"/product";
	}
	
	@GetMapping("/add")// Return "Add Product"
    public String showAddForm() {
        return "/productAdd"; // returns the "add product" form view
    }
	
	@PostMapping("/added")// Add product "View"
    public String addProduct(@ModelAttribute product entity) {
        service.productAdd(entity);
        return "redirect:/"; // redirects to the list of products
    }
	
	@GetMapping("/edit") // "Edit Product"
	public String editData(@RequestParam Integer id, Model model) {
	        Optional<product> product = service.edit(id);
	        model.addAttribute("product", product.get());
	        return "productEdit"; // Returns the "productEdit" view
	}
	
	@PostMapping("/update")//"Update Product"
	public String update(@ModelAttribute product entity) {
		service.update(entity);
		return "redirect:/";//Return"Product View"
	}
	
	@GetMapping("/delete")//"Delete Product"
	public String delet(@RequestParam int id) {
        service.delete(id);
        return "redirect:/";
	}
	
	@GetMapping("/login")// LogIn Page
    public String login() {
        return "/login";
	}
	
	@PostMapping("/logins")// LogIn Page
    public String logins() {
        return "redirect:/";
	}
	
    @GetMapping("/logout")// LogOut Page
    public String logOut(Model model) {
    	model.addAttribute("products",service.productList());
        return "/home";
    }
}
	
	
	
	
	
	
	

