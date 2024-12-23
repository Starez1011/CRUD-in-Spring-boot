package starez.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor

public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    @Column
    private String name;
    @Column
    private float percentage;
    @Column
    private String branch;

    @Override
    public String toString() {
        return "Student [" +
                "rollNo=" + rollNo +
                ", name=" + name + 
                ", percentage=" + percentage +
                ", branch=" + branch +
                "]";
    }
}
