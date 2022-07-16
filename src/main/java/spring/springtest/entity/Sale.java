package spring.springtest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long slNo;
    private int salemanId;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Product product;
    private String salesmanName;
}
