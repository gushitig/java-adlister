package models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Author implements Serializable {
    private String firstName;
    private String lastName;


}
