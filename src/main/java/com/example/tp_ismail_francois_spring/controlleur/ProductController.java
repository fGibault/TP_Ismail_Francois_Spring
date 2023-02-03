package controlleur;

import modele.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProductService;

import java.util.List;

@RestController

public class ProductController {

    @Autowired
    private ProductService productService;
@GetMapping
public String welcome(){
    return "Ceci est la page d'ouverture";
}
    @GetMapping("/products")
    public List<Product> listAll() {
        return productService.listsAll();
    }

    @GetMapping("/{id}")
    public Product get(@PathVariable Long id) {
        return productService.get(id);
    }

    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        productService.save(product);
    }
}

