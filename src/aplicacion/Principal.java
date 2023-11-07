package aplicacion;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Principal{

    public static void main(String[] args){

        ZonedDateTime caracas = ZonedDateTime.now(ZoneId.of("America/Caracas"));
        ZonedDateTime españa = ZonedDateTime.now();

        DateTimeFormatter formatoEspañol = DateTimeFormatter.ofPattern("dd-MM-yyy, hh:mm:ss a");

         //Fecha actual caracas con  formato español
         String caracasFecha = caracas.format(formatoEspañol);
        //Fecha actual españa con formato español
        String españaFecha = españa.format(formatoEspañol);

        //fecha del descubrimiento de America, su diferencia
        LocalDate añosAmerica = LocalDate.of(1492,Month.OCTOBER,12);

        //Diferencia de horas e y c
        int offsetCaracas = caracas.getOffset().getTotalSeconds();
        int offsetSpain = españa.getOffset().getTotalSeconds();
        // Calcular la diferencia en horas
        int diffHoras = (offsetSpain - offsetCaracas) / 3600;

        //Fecha de cuando se piso la luna
        LocalDateTime luna = LocalDateTime.of(1969, Month.JULY, 11, 3, 56);
        
        System.out.println("La fecha actual en España es "+ españaFecha );
        System.out.println("La fecha actual en Caracas es "+ caracasFecha );
        System.out.println("El tiempo transcurrido desde el descubrimiento de america es de "+ ChronoUnit.YEARS.between(añosAmerica, españa)+"años" );
        System.out.println("La hora actual en España es "+españa.toLocalTime());
        System.out.println("La hora actual en España es "+ caracas.toLocalTime());
        System.out.println("La diferencia de horas entre España y Caracas son "+ diffHoras);
        System.out.println("La hora y fecha en el que Neil Amstrong psio la Luna en hora de Madrid fue " +luna);
        
       


    }

 
}