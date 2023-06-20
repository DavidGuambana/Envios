package controlador;

import modelo.mMarcaModelo;
import vista.vModelo;

public final class cMarcaModelo{
    mMarcaModelo mmarcamodelo;
    vModelo vmodelo;

    public cMarcaModelo(mMarcaModelo mmarcamodelo, vModelo vmodelo) {
        this.mmarcamodelo = mmarcamodelo;
        this.vmodelo = vmodelo;
        vmodelo.setVisible(true);
        iniciar();
        listar();
    }
    
    public void iniciar() {
        vmodelo.getBtnBuscar().addActionListener(l -> buscar());
    }

    public void listar() {
        mmarcamodelo.listar(vmodelo.getJtMarcasModelos());
    }

    public void buscar() {
        if (!vmodelo.getTxtBuscar().getText().isEmpty()) {
            String columna = "";
            int codigo = 0;
            switch (vmodelo.getCbColumnas().getSelectedIndex()) {
                case 0:
                    columna = "mod.codigo";
                    break;
                case 1:
                    columna = "mod.nombre";
                    break;
                case 2:
                    columna = "mar.codigo";
                    break;
                case 3:
                    columna = "mar.nombre";
                    break;
            }
            mmarcamodelo.buscar(vmodelo.getTxtBuscar().getText(), columna, vmodelo.getJtMarcasModelos());
        }
    }
}