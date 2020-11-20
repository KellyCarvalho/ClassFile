package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		//filtra o que � diret�rio
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Pastas");
		//lista as pastas
		for(File folder:folders) {
			
			System.out.println(folder);
			
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files");
	for(File file:files) {
			
			System.out.println(file);
			
		}
		//criando uma subpasta atrav�s do caminho da pasta informado
	boolean success = new File(strPath +"\\subdir").mkdir();
	
	System.out.println("Diret�rio criado com sucesso: "+success);
	
		sc.close();
		

	}

}
