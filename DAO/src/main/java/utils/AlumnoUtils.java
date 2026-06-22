package utils;

import exceptions.CantidadMateriasInvalidaException;
import exceptions.DniInvalidoException;
import exceptions.EstadoInvalidoException;
import exceptions.FechaInvalidaException;
import exceptions.NombreApellidoInvalidoException;
import exceptions.PromedioInvalidoException;
import java.time.LocalDate;
import persona.Alumno;

public final class AlumnoUtils {

    private static final String DELIM = "\t";

    private AlumnoUtils() {
    }

    public static String alumno2String(Alumno alumno) {
        return alumno.getDni() + DELIM
                + alumno.getNombre() + DELIM
                + alumno.getApellido() + DELIM
                + alumno.getFecNac() + DELIM
                + alumno.getPromedio() + DELIM
                + alumno.getFecIng() + DELIM
                + alumno.getCantMatAprob() + DELIM
                + alumno.getEstado();
    }

    public static Alumno string2Alumno(String alumnoStr)
            throws DniInvalidoException,
                   NombreApellidoInvalidoException,
                   FechaInvalidaException,
                   PromedioInvalidoException,
                   CantidadMateriasInvalidaException,
                   EstadoInvalidoException {

        String[] campos = alumnoStr.split(DELIM);

        int index = 0;

        Alumno alumno = new Alumno();

        alumno.setDni(Integer.parseInt(campos[index++]));
        alumno.setNombre(campos[index++]);
        alumno.setApellido(campos[index++]);
        alumno.setFecNac(LocalDate.parse(campos[index++]));
        alumno.setPromedio(Double.parseDouble(campos[index++]));
        alumno.setFecIng(LocalDate.parse(campos[index++]));
        alumno.setCantMatAprob(Short.parseShort(campos[index++]));
        alumno.setEstado(campos[index++].charAt(0));

        return alumno;
    }
}