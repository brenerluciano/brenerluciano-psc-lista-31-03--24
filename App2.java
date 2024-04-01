import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int temperaturas = 12;
        int valordatemperatura = 0;
        double valorfinal = 0;

           
          
                
            for (int i = 1; i <= temperaturas; i++){
            
            System.out.println("Digite a temperatura " + i + " (entre 4 e 10): ");
            valordatemperatura = scanner.nextInt();
             
            
            if (valordatemperatura >=4 && valordatemperatura <=10){
            valorfinal += valordatemperatura;     
            
            }else{
                System.out.println("Valor invalido, tente novamente.");
                i--;
            }
             }
             double valor = valorfinal / temperaturas;
             

             System.out.printf("A média de hoje das temperaturas é : " + String.format("%.1f", valor)  + " C° ");

}} 

