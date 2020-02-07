package com.example.polls.model;

import com.example.polls.payload.ProductApplied;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Order {

    @Id
    private String _id;
    private Long userId;
    private long orderTime;
    private List<ProductApplied> products;
    private OrderStatus orderStatus;

}
