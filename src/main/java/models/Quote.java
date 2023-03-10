package models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Quote implements Serializable {
    private int id;
    private String author;
    private String content;
}
