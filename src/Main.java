import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaration de variable
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio""";


        double mediaEvaluacionUsuario = 0;

        System.out.println("Película: " + nombre);
        System.out.println(sinopsis);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            double mediaEvaluacionUsario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}



