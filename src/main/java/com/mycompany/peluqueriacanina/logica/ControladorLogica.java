package com.mycompany.peluqueriacanina.logica;
import com.mycompany.peluqueriacanina.persistencia.ControladorPersistencia;
import java.util.List;

public class ControladorLogica {
    ControladorPersistencia control = new ControladorPersistencia();

    public void guarda(String nombreMasco, String raza, String color, String observaciones, String alergico, String ateEsp, String nombredueno, String celDueno) {
        Dueno dueno = new Dueno();
        dueno.setNombre(nombredueno);
        dueno.setCelular(celDueno);
        
        Mascota masco = new  Mascota();
        masco.setNombre_perro(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        masco.setObservaciones(observaciones);
        masco.setDueno(dueno);
        
        control.guardar(dueno,masco);
    }

    public List<Mascota> traerMascotas() {
        return control.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        control.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return control.traerMascota(num_cliente);
    }

    public void editarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String ateEsp, String nombredueno, String celDueno) {
        masco.setNombre_perro(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        
        //Modifico la mascota
        control.editarMascota(masco);
        
        Dueno dueno = this.buscarDueno(masco.getDueno().getId_dueno());
        dueno.setCelular(celDueno);
        dueno.setNombre(nombredueno);
        
        //Llamar al modificar dueño
        this.editarDueno(dueno);
    }

    private Dueno buscarDueno(int id_dueno) {
        return control.buscarDueno(id_dueno);
    }

    private void editarDueno(Dueno dueno) {
        control.editarDueno(dueno);
    }

}
