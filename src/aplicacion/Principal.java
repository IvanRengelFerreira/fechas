package aplicacion;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.text.*;
public class Principal{


    public static void main(String[] args){

        //Hora actual con  formato español
        DateFormat formatoEspañol = new SimpleDateFormat("d-MM-yyy, hh:mm:ss a ");
        String date = formatoEspañol.format(new Date());
       
        //Hora actual de Caracas
        String caracasDate = ZonedDateTime.now(ZoneId.of("America/Caracas"))
        .format(DateTimeFormatter.ofPattern("MM-dd-yyy, hh:mm:ss a"));

        //Fecha actual y fecha del descubrimiento de America, su diferencia
        LocalDate horaE = LocalDate.now();
        LocalDate añosAmerica = LocalDate.of(1492,Month.OCTOBER,12);

        //
       

        System.out.println("La fecha actual en España es "+ date );
        System.out.println("La fecha actual en Caracas es "+ caracasDate );
        System.out.println("El tiempo transcurrido desde el descubrimiento de america es de "+ ChronoUnit.YEARS.between(añosAmerica, horaE) );
    }

 
}