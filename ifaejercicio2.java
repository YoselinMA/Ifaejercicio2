import java.util.Scanner;
public class Ifaejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produc;
        System.out.println("Ingresa el costo de tu producto: ");
        produc = sc.nextInt();

        if(produc >= 100){
            int produc1;
            produc1 = (int)(produc-(produc*0.20));
            if(produc1 >=80){
                System.out.println("El total a pagar es: "+produc1);
            }

        }

        System.out.println("Gracias por su compra");

    }
    
}
