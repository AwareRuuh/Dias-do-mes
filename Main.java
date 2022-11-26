import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
  
int mes;
float ano;
String sair;
do{
System.out.println("\t NÚMEROS DE DIAS DO MÊS");
System.out.println("Digite um número correspondente ao mês:  ");
mes=sc.nextInt();
System.out.println("Digite o ano: ");
ano=sc.nextFloat();
switch(mes)
{
case 1: System.out.println("Janeiro tem 31 dias");
break;
case 3: System.out.println("Março tem 31 dias");
break;
case 5: System.out.println("Maio tem 31 dias");
break;
case 7: System.out.println("Julho tem 31 dias");
break;
case 8: System.out.println("Agosto tem 31 dias");
break;
case 10: System.out.println("Outubro tem 31 dias");
break;
case 12: System.out.println("Dezembro tem 31 dias");
break;
case 4: System.out.println("Abril tem 30 dias");

break;
case 6: System.out.println("Junho tem 30 dias");
break;
case 9: System.out.println("Setembro tem 30 dias");
break;
case 11:System.out.println("Novembro tem 30 dias");
break;
case 2: System.out.print("Fevereiro tem ");
if(ano%4==0)
System.out.println(" 29");
else
System.out.println(" 28");
break;
default: System.out.println("Digite em mês um número de 1-12");
}
System.out.println("Digite '$' para continuar ou qualquer coisa para sair: ");
sair=sc.next();
System.out.println();
System.out.println();
}while(sair.equals("$"));
}
}