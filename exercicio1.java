import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double abacaxi, maca, pera, Qa, Qm, Qp, VT;
        abacaxi = 7.30;
        maca = 2.00;
        pera = 3.00;
        
        System.out.print("Digite a quantidade de abacaxis:");
            Qa = sc.nextDouble();
            
        System.out.print("Digite a quantidade de maçãs:");
            Qm = sc.nextDouble();
            
        System.out.print("Digite a quantidade de pêras:");
            Qp = sc.nextDouble();
        
                VT = (abacaxi * Qa + maca * Qm + pera * Qp);
        
         System.out.println("o valor total sera R$"+VT);
    
	}
}
