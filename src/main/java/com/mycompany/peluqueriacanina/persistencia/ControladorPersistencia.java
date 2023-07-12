package com.mycompany.peluqueriacanina.persistencia;
import com.mycompany.peluqueriacanina.logica.Dueno;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    DuenoJpaController dJpa = new DuenoJpaController();
    MascotaJpaController mJpa = new MascotaJpaController();

    public void guardar(Dueno dueno, Mascota masco) {
        dJpa.create(dueno);
        mJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
       return mJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mJpa.destroy(num_cliente);
            //dJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        return mJpa.findMascota(num_cliente);
    }

    public void editarMascota(Mascota masco) {
        try {
            mJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Dueno buscarDueno(int id_dueno) {
        return dJpa.findDueno(id_dueno);
    }

    public void editarDueno(Dueno dueno) {
        try {
            dJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
