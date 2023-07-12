package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Dueno;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-05-29T02:26:44")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Integer> num_cliente;
    public static volatile SingularAttribute<Mascota, Dueno> dueno;
    public static volatile SingularAttribute<Mascota, String> nombre_perro;
    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, String> atencion_especial;

}