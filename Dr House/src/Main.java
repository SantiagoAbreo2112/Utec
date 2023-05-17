import java.util.Scanner;
public class Main {
    //Modulo Pregunta
    public static String Consulta(String pregunta){
        Scanner sc = new Scanner(System.in);
        //Pregunta
        System.out.println(pregunta);
        //Respuesta
        String respuesta=sc.nextLine();
        //devolvemos la respuesta
        return respuesta;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.println("Bienvenido al Hospital, Ingrese su nombre");
        String nombre = sc.nextLine();

        //Pregunta 1

        respuesta = Consulta(nombre + ", Has tenido alguna caida? Responde con S/N");

        while (!respuesta.equals("S") && !respuesta.equals("N")){
            System.out.println("Creo que no me has entendido");
            respuesta = Consulta(nombre + ", Has tenido alguna caida? Responde con S/N");
        }

        if (respuesta.equals("S"))
            System.out.println("Necesitas tomarte un descanso, Paracetamol cada 8 horas ");
        else if (respuesta.equals("N")) {

            //Pregunta 2
            respuesta = Consulta(nombre + ", Le duele la cabeza? Responde con S/N");

            while (!respuesta.equals("N") && !respuesta.equals("S")){
                System.out.println("Creo que no me has entendido");
                respuesta = Consulta(nombre + ", Le duele la cabeza? Responde con S/N");
            }

            if (respuesta.equals("S"))
                System.out.println("Necesitas tomarte un descanso, Paracetamol cada 8 horas ");
            else if (respuesta.equals("N")) {

                //Pregunta 3
                respuesta = Consulta(nombre + ", Has tenido alguna caida? Responde con S/N");

                while (!respuesta.equals("S") && !respuesta.equals("N")){
                    System.out.println("Creo que no me has entendido");
                    respuesta = Consulta(nombre + ", Has tenido alguna caida? Responde con S/N");
                }

                if (respuesta.equals("S"))
                    System.out.println("Necesitas tomarte un descanso, Paracetamol cada 8 horas ");
                else if (respuesta.equals("N")) {
                    System.out.println("Anda para alla entonces, bobo");
                }

            }


        }
    }
}