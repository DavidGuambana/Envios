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
        iniciar();
        listar();
    }

    public void iniciar() {
        vubicacion.getBtnBuscar().addActionListener(l -> buscar());
    }

    public void listar() {
        mubicacion.listar(vubicacion.getJtUbicaciones());
    }

    public void buscar() {
        if (!vubicacion.getTxtBuscar().getText().isEmpty()) {
            String columna = "";
            int codigo = 0;
            switch (vubicacion.getCbColumnas().getSelectedIndex()) {
                case 0:
                    columna = "C.codigo";
                    break;
                case 1:
                    columna = "C.nombre";
                    break;
                case 2:
                    columna = "P.codigo";
                    break;
                case 3:
                    columna = "P.nombre";
                    break;
            }
            mubicacion.buscar(vubicacion.getTxtBuscar().getText(), columna, vubicacion.getJtUbicaciones());
        } else {
            mubicacion.listar(vubicacion.getJtUbicaciones());
        }
    }
}
