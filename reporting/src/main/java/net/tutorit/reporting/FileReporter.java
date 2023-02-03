package net.tutorit.reporting;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class FileReporter extends ReporterBase{
	
	private String filename;
	//private Formatter format; 
	//private PrintWriter pw = null;
	
	public FileReporter(Formatter formatter, String filename) {
		super(formatter); 
		this.filename = filename; 
	}
	
	public PrintWriter getWriter() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(filename));
			return pw;
		} catch (IOException ex) {
			System.out.println("Whoops, could not open the file " +filename);
			System.out.println(ex);
			return null; 
		}

		
	}
	
	protected void closeWriter(PrintWriter pw) {
		pw.flush();
		pw.close();
	}
	
	
	//public void beginReport() {
	
	//}
	
	
	

	
	
	
	
	
	

	
	
	

	

}
