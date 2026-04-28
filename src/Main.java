import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Sistema sis = new Sistema();
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        int contv = 0;
        int indice;
        Scanner sc = new Scanner(System.in);
        int opc2;

        do {
            int opc = Sistema.menu();
            switch (opc){
                case 1:
                    listaVehiculos.add(sis.crearVehiculo());
                    contv += 1;
                    break;
                case 2:
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    sis.actualizarVehiculo(listaVehiculos.get(indice));
                    break;
                case 3:
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    sis.imprimirVehiculo(listaVehiculos.get(indice));
                    break;
                case 4:
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    sis.imprimirAceleracion(listaVehiculos.get(indice));
                    break;
            }

            System.out.print("¿Desea seleccionar otra opcion? 1.Si. 2.No >> ");
            opc2 = sc.nextInt();
        }while(opc2 == 1);


    }
}