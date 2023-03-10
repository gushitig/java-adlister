package models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Author implements Serializable {
    private int id;
    private String firstName;
    private String lastName;


}
