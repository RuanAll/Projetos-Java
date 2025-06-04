package idades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Idades {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);	
//-----------------------------------------------------------------------//
		Date data = new Date();
		SimpleDateFormat dataFormatada = new SimpleDateFormat("y");
		String dataF = dataFormatada.format(data);
		int anoAtual = Integer.parseInt(dataF);
		
		Date data2 = new Date();
		SimpleDateFormat dataFormatada2 = new SimpleDateFormat("M");
		String dataF2 = dataFormatada2.format(data2);
		int mesAtual = Integer.parseInt(dataF2);
		
		Date data3 = new Date();
		SimpleDateFormat dataFormatada3 = new SimpleDateFormat("d");
		String dataF3 = dataFormatada3.format(data3);
		int diaAtual = Integer.parseInt(dataF3);
		
		System.out.println(dataF3 + "/" + dataF2 + "/" + dataF);
//-----------------------------------------------------------------------//
		System.out.println("Digite o dia do seu nascimento:");
		int dia = ler.nextInt();
		System.out.println("Digite o mes do seu nascimento:");
		int mes = ler.nextInt();
		System.out.println("Digite o ano do seu nascimento:");
		int ano = ler.nextInt();
//-----------------------------------------------------------------------//
		int subDia = 0, subMes = 0;
		
		
		if (diaAtual > dia)
			subDia = diaAtual - dia;
		if (diaAtual < dia)
			subDia = 30 - dia;
		if (diaAtual == dia)
			subDia = 0;
		
		
		if (mesAtual > mes)
			subMes = mesAtual - mes;
		if (mesAtual < mes)
			subMes = 12 - mes;
		if (mesAtual == mes)
			subMes = 0;
		
		
		int subAno = (ano - anoAtual)*(-1);
//-----------------------------------------------------------------------//
		System.out.println(subAno + " anos, " + subMes + " meses e " + subDia + " dias");
	
		
	}
}
