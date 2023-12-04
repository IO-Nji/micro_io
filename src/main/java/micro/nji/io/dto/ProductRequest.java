package micro.nji.io.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String description;

    @Column(name = "age")
    private BigDecimal price;
}
