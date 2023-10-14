package com.project.pub3.entities;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Costumer {


    @Id
    private Long id;
    private String name;
    private String telephone;
    private List<String> drinks;
    private Integer totalPrice;
}
