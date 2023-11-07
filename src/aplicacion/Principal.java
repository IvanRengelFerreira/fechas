package aplicacion;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Principal{

    //DateFormat formatoEspañol = new SimpleDateFormat("d-MM-yyy, hh:mm:ss a ");
        //String date = formatoEspañol.format(new Date());

        ZonedDateTime caracas = ZonedDateTime.now(ZoneId.of("America/Caracas"));
        ZonedDateTime españa = ZonedDateTime.now();

        DateTimeFormatter formatoEspañol = DateTimeFormatter.ofPattern("MM-dd-yyy, hh:mm:ss a");

         //Fecha actual caracas con  formato español
         String caracasFecha = caracas.format(formatoEspañol);
        //Fecha actual españa con formato español
        String españaFecha = españa.format(formatoEspañol);

        //fecha del descubrimiento de America, su diferencia
        LocalDate añosAmerica = LocalDate.of(1492,Month.OCTOBER,12);

        //Diferencia de horas e y c
        Duration duration = Duration.between(caracas,españa );
        long diffHoras = duration.toHours();

        //Fecha de cuando se piso la luna
        LocalDateTime luna = LocalDateTime.of(1969, Month.JULY, 11, 3, 56);


    public void main(String[] args){

        
        
        System.out.println("La fecha actual en España es "+ españaFecha );
        System.out.println("La fecha actual en Caracas es "+ caracasFecha );
        System.out.println("El tiempo transcurrido desde el descubrimiento de america es de "+ ChronoUnit.YEARS.between(añosAmerica, españa) );
        System.out.println("La hora actual en España es "+españa.toLocalTime());
        System.out.println("La hora actual en España es "+ caracas.toLocalTime());
        System.out.println("La diferencia de horas entre España y Caracas son "+ diffHoras);
        System.out.println("La hora y feccha en el que Neil Amstring psio la Luna en hora de Madrid fue" +luna);
        
       


    }

 
}