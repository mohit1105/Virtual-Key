package Project;

import java.util.Scanner;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class Main 
{
	public static final String path = "C:\\Users\\Lenovo\\Desktop\\Practice-Project2"; 
	static Scanner sc=new Scanner(System.in);
	static Main obj =new Main();
	
	static MainMenu mm=new MainMenu();
	public static void main(String[] args) 
	{
		System.out.println("     [ Welcome To LockedMe.com ]          \n");
		System.out.println("       Develop by Mohit Verma      \n");
		
		Menu();
	}
	
	static void Menu()
	{
		
		while(true)
			
		{
			System.out.println("            MAIN MENU            ");
			System.out.println("        -----------------        \n");
			System.out.println("( Select any one of the following :- )\n");
		    System.out.println("  1 ==>   List of all files               ");
		    System.out.println("  2 ==>   All Functions                 ");
		    System.out.println("  3 ==>   Exit                         \n");
		    System.out.print("  Enter your options ==> ");
		    
		    
		    int n=sc.nextInt();
		    switch(n)
		    {
		    	case 1: mm.AllFiles(Main.path);
		    	System.out.println();
		    	Menu();
		    	break;
		    	
		    	case 2: Allfunctions();
		    	Menu();
		    	break;
		    	
		    	case 3:
		    		System.out.println("\n  Thanks for using LockedMe.com");
		    		System.out.println("\n  Program Exit.");
		    		System.exit(0);
		    
		    }   
		}
	}
	
	static void Allfunctions()
	{
		while(true)
		{

			System.out.println("             SUB MENU                ");
			System.out.println("         ----------------            \n");
			System.out.println("( Select any one of the following:  )\n");
		    System.out.println("   1 ==> Add a file                  ");
		    System.out.println("   2 ==> Search a file               ");
		    System.out.println("   3 ==> Delete a file               ");
		    System.out.println("   4 ==> Return To Main Function     \n");
		    System.out.print("    Choose anyone option to perform ==> ");
		    
		    int options=sc.nextInt();
		    switch(options)
		    {
		    case 1:
		    	System.out.print("    Enter a filename to create ==> ");
		    	String fileName=sc.next();
		    	try 
		    	{
					mm.CreateFile(Main.path , fileName);
					Allfunctions();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    break;
		    
		    case 2:
		    	System.out.print("    Enter the filename to be search ==> ");
		    	String Search=sc.next();
		    	mm.Searchfile(Main.path,Search);
		    	Allfunctions();
		    	
		    case 3:
		    	System.out.print("    Enter the filename to delete ==> ");
		    	String s=sc.next();
		    	
		    	try {
					mm.DeleteFile(Main.path , s);
					Allfunctions();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		    case 4:Menu();	
		    	
		    }   
		}	
	}
	
	
	
}
