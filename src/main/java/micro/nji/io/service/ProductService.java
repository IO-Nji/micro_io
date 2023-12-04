package micro.nji.io.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import micro.nji.io.dto.ProductRequest;
import micro.nji.io.dto.ProductResponse;
import micro.nji.io.model.Product;
import micro.nji.io.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepo productRepo;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepo.save(product);
        log.info("Product {} Created!", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepo.findAll();
        return products.stream().map(this::mapToProductResponse).toList();

    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .Id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

    }
}
