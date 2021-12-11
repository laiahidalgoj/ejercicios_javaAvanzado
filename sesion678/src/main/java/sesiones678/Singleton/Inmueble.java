package sesiones678.Singleton;

import javax.persistence.*;

public class Inmueble {

    private static Inmueble inmueble;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public static Inmueble getInstance() {
        if(inmueble == null) {
            inmueble = new Inmueble();
        }
        return inmueble;
    }

    private String ubicacion;
    private String clasificacion;
    private String tipoInmueble;

    private Inmueble(){}

    public Inmueble(Long id, String ubicacion, String clasificacion, String tipoInmueble) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.clasificacion = clasificacion;
        this.tipoInmueble = tipoInmueble;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }
}
