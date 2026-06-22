package utils;

import exceptions.DniInvalidoException;
import exceptions.NombreApellidoInvalidoException;
import org.apache.commons.lang3.StringUtils;
import persona.Alumno;

public final class AlumnoUtils {

    private static final String DELIM = "\t";

    private AlumnoUtils() {
    }

    public static String alumno2String(Alumno alumno) {

        String dniFormatted = StringUtils.leftPad(String.valueOf(alumno.getDni()), 8, '0');
        String nombreFormatted = StringUtils.leftPad(alumno.getNombre(), 15, StringUtils.SPACE);

        // TODO: Apellido + cantMatAprob + 
        
        return dniFormatted+DELIM+nombreFormatted+DELIM+
                String.format("%5.2f", alumno.getPromedio())+DELIM+
                alumno.getFecIngStr()+DELIM+
                alumno.getEstado();
    }
    public static Alumno string2Alumno(String alumnoStr) throws NombreApellidoInvalidoException, DniInvalidoException {
        Alumno alumno = new Alumno();
        String[] campos = alumnoStr.split(DELIM);

        int index = 0;

        alumno.setDni(Integer.parseInt(campos[index++]));
        alumno.setNombre(campos[index++]);

        // TODO: Apellido + cantMatAprob + 
        
        return alumno;

    }

}
