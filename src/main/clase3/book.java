import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class book {
    @Getter @Setter
    private String Titulo;
       @Getter @Setter
    private String  autor;
     @Getter @Setter
    private float precio;
       @Getter @Setter
    private String editorial;
       @Getter @Setter
    private int paginas;
       @Getter @Setter
    private int año;
       @Getter @Setter
    private String edicion;


  
}
