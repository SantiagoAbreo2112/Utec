import java.util.Scanner;
public class Main {
    public static void NuevoRegistro(float[] t, float[] d, String[] e){

    }

    public static void MostrarRegistro(float t[], float d[], String e[]){

    }

    public static void EliminarUltimoRegistro(float t[], float d[], String e[]){

    }
    public static int Menu(boolean error) {
        //MENU

        Scanner sc = new Scanner(System.in);
        if (error) {
            System.out.println("INGRESA SOLAMENTE UN VALOR: [1],[2],[3],[4],[0]");
        }
        System.out.println("------ MENU------");
        System.out.println("[1] NUEVO DATO ");
        System.out.println("[2] MOSTRAR DATO ");
        System.out.println("[3] BORRAR ULTIMO DATO ");
        System.out.println("[0] FINALIZAR ");
        System.out.println("-----------------");
        System.out.println("------ TU OPCION ------");
        int respuesta = sc.nextInt();
        while (respuesta > 3 || respuesta < 0) {
            Menu(true);
        }
        return respuesta;
    }
    public static void main(String[] args) {

        //ELECCION MENU
        int respuesta=Menu(false);

        //DEFINO ARRAYS
        float tiempos[]={0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f};
        float distancia[]={0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f};
        String etiquetas[]={"","","","","","","","","","",};

        //ELECCION 1

        while (respuesta!=0){
            switch (respuesta){
                case 1:
                    NuevoRegistro(tiempos,distancia,etiquetas);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;

            }
        }

    }
}