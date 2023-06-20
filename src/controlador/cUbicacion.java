package controlador;

import modelo.mUbicacion;
import vista.vUbicacion;

public final class cUbicacion{
    mUbicacion mubicacion;
    vUbicacion vubicacion;

    public cUbicacion(mUbicacion mubicacion, vUbicacion vubicacion) {
        this.mubicacion = mubicacion;
        this.vubicacion = vubicacion;
        vubicacion.setVisible(true);
        //iniciar();
        listar();
    }
    public void iniciar(){
        as
    }
    public void listar(){
        mubicacion.listar(vubicacion.getJtUbicaciones());
    }
}