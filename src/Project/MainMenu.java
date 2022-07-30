package Project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainMenu {
	
	
	void AllFiles(String path)
	{
		File file=new File(path);
		
		List<String> FileList=Arrays.asList(file.list());
		System.out.println(FileList);
		
	}
		
	
	void CreateFile(String path,String fileName) throws IOException
	{
		File newfile=new File(path + File.separator + fileName);
		
		try {
			newfile.createNewFile();
			System.out.println("    This file is created at location ==> "+ path+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void DeleteFile(String path, String fileName)
	{
		File file=new File(path + File.separator + fileName);
		
		boolean res=file.delete();
		if(res)
		{
			System.out.println("    File is delete.\n");
		}
		else
		{
			System.out.println("    File not Found.\n");
		}
	}
	
	void Searchfile(String path,String fileName)
	{
		File file=new File(path);
		
		List<String> FileList=Arrays.asList(file.list());
		
		if(FileList.contains(fileName))
		{
			System.out.println("    This file is present at location ==> "+ path +"\n");
		}
		else {
			System.out.println("    File is not found."
					+ "\n");
		}

	}

}
