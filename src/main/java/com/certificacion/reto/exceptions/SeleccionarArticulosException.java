package com.certificacion.reto.exceptions;

public class SeleccionarArticulosException extends RuntimeException{

    private static final long serialVersionUID = 4L;

    private static final String ERROR = "Error al dar tap en agregar al carrito";

    public SeleccionarArticulosException (String mensaje, Throwable razon){
        super(mensaje,razon);
    }

    public static String Error() {
        return ERROR;
    }
}
