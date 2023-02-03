package net.tutorit.reporting;

import java.io.PrintWriter;



public class ScreenReporter extends ReporterBase{
	
	

	public ScreenReporter(Formatter formatter) {
		super(formatter);
		// Ei välttämätön!
	}

	protected PrintWriter getWriter() {
		return new PrintWriter(System.out);
		
	}
	
	protected void closeWriter(PrintWriter pw) {
		pw.flush();
	}
	
	
	

	
	
	
	
	

	

}
