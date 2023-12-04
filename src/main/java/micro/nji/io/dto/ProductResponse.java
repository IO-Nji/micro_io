package micro.nji.io.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    @Id
    private Long Id;
    private String name;
    private String description;
    private BigDecimal price;

}
