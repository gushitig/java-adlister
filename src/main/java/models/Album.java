package models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Album implements Serializable {
    private int id;
    private String artist;
    private String recordName;
    private int releaseDate;
    private double sales;
    private String genre;


}
