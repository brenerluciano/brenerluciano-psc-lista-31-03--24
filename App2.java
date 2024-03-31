import java.util.Scanner;
public class App2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int temperaturas = 12;
        int valordatemperatura = 0;
        int valorfinal = 0;

           
          
                
            for (int i = 1; i <= temperaturas; i++){
            
            System.out.println("Digite a temperatura " + i + " (entre 4 e 10): ");
            valordatemperatura = scanner.nextInt();
            valorfinal += valordatemperatura; 
            
            if (valordatemperatura >=4 && valordatemperatura <=10){
            
            }else{
                System.out.println("Valor invalido, tente novamente.");
                return; 
            }
             }
             int valor = valorfinal / 12;
             

             System.out.println("A média de hoje das temperaturas é : " + valor + " C ");

}}  

