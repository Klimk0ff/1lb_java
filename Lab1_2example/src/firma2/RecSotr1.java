package firma2;
import java.util.Scanner;
class Sotrudnik{
    String fam,im,otch, doljnost ;
    int kolDet;
    Child []reb= null;
}
class Child{
    String imaR;
    int vozrastR;
}

public class RecSotr1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("������ ������� ����������� => ");
        int kol=sc.nextInt();
        sc.nextLine(); 					// �������� ������
        Sotrudnik [] sotr = new Sotrudnik [kol];
        System.out.println("������ ���������� ��� ������� �����������: ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Sotrudnik();
            System.out.print("������ ������� "+(i+1)+" ����������� => ");
            sotr [i]. fam = sc.nextLine ();

            System.out.print("������ ���� ��'� => ");
            sotr[i].im=sc.nextLine();

            System.out.print("������ ���� �� ������� => ");
            sotr[i].otch=sc.nextLine();

            System.out.print("������ ���� ������ => ");
            sotr[i].doljnost=sc.nextLine();

            System.out.print("������ ������� ���� =>");
            sotr[i].kolDet=sc.nextInt();
            sc.nextLine(); 				// �������� ������

            if(sotr[i].kolDet != 0) {
                sotr[i].reb=new Child[sotr[i].kolDet];
                System.out.println("ĳ�� =>");
                for(int j = 0; j < sotr[i].reb.length; j++) {
                    sotr[i].reb[j]=new Child();

                    System.out.print("������ ��'� "+(j+1)+" ������ => ");
                    sotr[i].reb[j].imaR = sc.nextLine();
                    System.out.print("������ ���� �� =>");
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine(); 			// �������� ������
                } } }

// ��������� ���������� ��� �����������
        System.out.println("\n����������� ����� \n ��� \t ��'� \t ��� \t ������");
        for(Sotrudnik s: sotr) {
            System.out.print(s.fam+ "\t"+s.im + "\t"+ s.otch+ "\t "+ s.doljnost); System.out.println("\nĳ��: ");
            for(Child r: s.reb)
                System.out.println("\t\t"+ r.imaR+ "\t\t"+ r.vozrastR);
            System.out.println("");
        }
    }

}
