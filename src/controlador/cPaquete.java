package controlador;

import modelo.mPaquete;
import vista.vPaquete;

public final class cPaquete{
    mPaquete modelo;
    vPaquete vista;

    public cPaquete(mPaquete modelo, vPaquete vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        iniciar();
        listar();
    }

    public void iniciar() {
        vista.getBtnBuscar().addActionListener(l -> buscar());
    }

    public void listar() {
//        modelo.listar(vista.getJtPaquetes());
    }

    public void buscar() {
//        if (!vubicacion.getTxtBuscar().getText().isEmpty()) {
//            String columna = "";
//            int codigo = 0;
//            switch (vubicacion.getCbColumnas().getSelectedIndex()) {
//                case 0:
//                    columna = "C.codigo";
//                    break;
//                case 1:
//                    columna = "C.nombre";
//                    break;
//                case 2:
//                    columna = "P.codigo";
//                    break;
//                case 3:
//                    columna = "P.nombre";
//                    break;
//            }
//            mubicacion.buscar(vubicacion.getTxtBuscar().getText(), columna, vubicacion.getJtUbicaciones());
//        } else {
//            mubicacion.listar(vubicacion.getJtUbicaciones());
//        }
    }
}
