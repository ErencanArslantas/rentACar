package kodlama.io.rentACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //sen bir veri tabanı varlığısın

public class Car {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id oto arttırma
    @Column(name="id")
    private int id ;
    @Column(name="plate", unique = true)
    private String plate;
    @Column(name ="dailyPrice")
    private double dailyPrice;
    @Column(name = "modelYear")
    private int modelYear;
    @Column(name = "state")
    private int state;  // 1- available 2- rented 3- maintenance

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}
