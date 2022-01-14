package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "TClients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nom")
    private String name;

    public Client(long id,String name){
        this.id=id;
        this.name=name;
    }

    public Client(){}

    public Client(String name){
        this.name=name;
    }
}
