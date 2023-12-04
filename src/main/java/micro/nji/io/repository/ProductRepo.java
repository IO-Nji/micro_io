package micro.nji.io.repository;

import micro.nji.io.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository <Product, String> {
}
