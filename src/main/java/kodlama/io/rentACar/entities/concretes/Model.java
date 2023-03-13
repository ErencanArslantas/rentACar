package kodlama.io.rentACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name="models")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //sen bir veri tabanı varlığısın
public class Model {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id oto arttırma
    @Column(name="id")
    private int id ;


    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "model")
    private List<Car> cars;
}
