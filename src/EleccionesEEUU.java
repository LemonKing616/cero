import java.util.Arrays;

public class EleccionesEEUU {

    public static void main(String[] args) {
        // Definimos los arrays
        String[] estados = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Carolina del Norte", "Carolina del Sur", "Colorado", "Connecticut", "Dakota del Norte", "Dakota del Sur", "Delaware", "Distrito de Columbia", "Florida", "Georgia", "Hawái", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Luisiana", "Maine", "Maryland", "Massachusetts", "Míchigan", "Minnesota", "Mississippi", "Misuri", "Montana", "Nebraska", "Nevada", "Nueva Jersey", "Nueva York", "Nuevo Hampshire", "Nuevo México", "Ohio", "Oklahoma", "Oregón", "Pensilvania", "Rhode Island", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Virginia Occidental", "Washington", "Wisconsin", "Wyoming"};
        int[] electores = {9, 3, 11, 6, 55, 15, 9, 9, 7, 3, 3, 3, 3, 29, 16, 4, 4, 20, 11, 6, 6, 8, 8, 4, 10, 11, 16, 10, 6, 10, 3, 5, 6, 14, 29, 4, 5, 18, 7, 7, 20, 4, 11, 38, 6, 3, 13, 5, 12, 10, 3};
        int[] votosDemócratas = {729547, 116454, 1161167, 380494, 8753788, 1338870, 897572, 235603, 282830, 4504975, 1877963, 266891, 189765, 3090729, 1033126, 653669, 427005, 628854, 780154, 715326, 1677928, 1995196, 2268839, 1367716, 485131, 1071068, 177709, 568988, 539260, 348526, 2148278, 385234, 4556124, 2189316, 93758, 2394164, 420375, 1002106, 2926441, 252525, 855373, 117458, 870695, 3877868, 310676, 178573, 1981473, 1742718, 188794, 1382536, 55973};
        int[] votosRepublicanos = {1318255, 163387, 1252401, 684872, 4483810, 1202484, 673215, 185127, 12723, 4617886, 2089104, 128847, 409055, 2146015, 1557286, 800983, 671018, 120297, 1178638, 671154, 943169, 1090893, 2279543, 1322951, 700714, 1594511, 279240, 991922, 512058, 345790, 1601933, 319667, 2819534, 2362631, 216794, 2841005, 949136, 782403, 2970733, 180543, 1155389, 227721, 1522925, 4685047, 515231, 95369, 1769443, 1221747, 489371, 1405284, 174419};

        // Declarar variables para almacenar los resultados
        int totalElectoresDemocratas = 0;
        int totalElectoresRepublicanoss = 0;
        int totalVotosDemocratas = 0;
        int totalVotosRepublicanos = 0;
        int partidoGanador = 0;
        int estadosDemocratas = 0;
        int estadosRepublicanos = 0;
        int maxElectoresDemocratas = 0;
        int maxElectoresRepublicanos = 0;
        String estadoMaxElectoresDemocratas = "";
        String estadoMaxElectoresRepublicanos = "";

        // Iterar sobre los estados
        for (int i = 0; i < estados.length; i++) {
            // Sumar los electores de cada partido
            totalElectoresDemocratas += votosDemócratas[i];
            totalElectoresRepublicanoss += votosRepublicanos[i]; //está iterando sobre el array de estados, empezando en el índice 0 y terminando en el índice estados.length - 1. En cada iteración, se está sumando el valor del elemento i del array de votosDemócratas al totalElectoresDemocratas y el valor del elemento i del array de votosRepublicanos al totalElectoresRepublicanoss.

            // Sumar los votos de cada partido
            totalVotosDemocratas += votosDemócratas[i];
            totalVotosRepublicanos += votosRepublicanos[i];

            // Verificar el partido ganador en cada estado
            if (votosDemócratas[i] > votosRepublicanos[i]) { //si el número de votos demócratas en el estado i es mayor que el número de votos republicanos, entonces el partido ganador es el partido demócrata y se incrementa el contador estadosDemocratas. En caso contrario, el partido ganador es el partido republicano y se incrementa el contador estadosRepublicanos.
                partidoGanador = 1; // Demócratas
                estadosDemocratas++;
            } else {
                partidoGanador = 2; // Republicanos
                estadosRepublicanos++;
            }

            // Verificar si el estado tiene más electores para los demócratas
            if (votosDemócratas[i] > maxElectoresDemocratas) {
                maxElectoresDemocratas = votosDemócratas[i];
                estadoMaxElectoresDemocratas = estados[i];
            }

            // Verificar si el estado tiene más electores para los republicanos
            if (votosRepublicanos[i] > maxElectoresRepublicanos) {
                maxElectoresRepublicanos = votosRepublicanos[i];
                estadoMaxElectoresRepublicanos = estados[i];
            }
        }

        // Imprimir los resultados
        System.out.println("Presidente electo de los Estados Unidos: " + (totalElectoresDemocratas > totalElectoresRepublicanoss ? "Demócratas" : "Republicanos"));
        System.out.println("Total de electores para los Demócratas: " + totalElectoresDemocratas);
        System.out.println("Total de electores para los Republicanos: " + totalElectoresRepublicanoss);
        System.out.println("Partido más votado con el número de votos totales: " + (totalVotosDemocratas > totalVotosRepublicanos ? "Demócratas" : "Republicanoss"));
        System.out.println("Número de estados que apoyan a los Demócratas: " + estadosDemocratas);
        System.out.println("Número de estados que apoyan a los Republicanos: " + estadosRepublicanos);
        System.out.println("Estado que aporta más electores a los Demócratas: " + estadoMaxElectoresDemocratas + " con " + maxElectoresDemocratas + " electores");
        System.out.println("Estado que aporta más electores a los Republicanos: " + estadoMaxElectoresRepublicanos + " con " + maxElectoresRepublicanos + " electores");
    }
}