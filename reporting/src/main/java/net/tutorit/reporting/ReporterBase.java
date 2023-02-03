package net.tutorit.reporting;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class ReporterBase implements Reporter { 
	public ArrayList<ColumnDef> columns = new ArrayList<>(); 
	private int counter; 
	
	protected PrintWriter pw;
	public Formatter format;// = new Formatter(){};
	
	//public void setFormatter(Formatter formatter) {
    //	if (formatter==null) formatter=new Formatter() {};
    //	this.format=formatter;
    //}
	protected abstract PrintWriter getWriter();
	protected abstract void closeWriter(PrintWriter pw);
	
	
	
	public ReporterBase(Formatter formatter) {
		this.format = formatter; 
	}
	 
	
	String pad(String s, int l){
        String format="%-"+l+"s";
        String result=String.format(format, s).substring(0,l);
        return result;
    }
	
	
	public void beginReport() {
		//format.begin(columns);
		this.pw = getWriter();
		this.pw.println(format.begin(columns));
		//printColumns(); 	
	}


	public void endReport() {
		closeWriter(this.pw);
		format.end(columns); 
		//columns.clear(); //jos käyttää useaan kertaan, muistaa ekat "asetukset"!
	}
	
	

	public void addColumn(String title, int width) {
		columns.add(new ColumnDef(title, width));
	}
/*	
	public void printColumns() {
		
		for (ColumnDef c: columns)  {
			String line = String.format("%-"+c.getWidth()+"s", c.getName()).substring(0, c.getWidth());
			this.pw.print(line);
			
		}
		
		this.pw.println(); 
	}
*/	
	ArrayList<String> items = new ArrayList<>(); 

	public void printData(String data) {
		
		//ColumnDef col = columns.get(counter);
			//this.pw.print(pad(data, col.getWidth()));
		items.add(data); 
		counter++;
		if (counter >= columns.size()) {
				counter = 0;
				this.pw.println(format.row(columns, items));
				items.clear();
				//this.pw.println("");
		}
			 
	}
	
	public void printData(int data) {
		
		printData(""+data); 
		//String s = String.valueOf(data);
		//ColumnDef col = columns.get(counter);
		//this.pw.println(pad(s, col.getWidth()));
		//counter++;
		//if (counter >= columns.size()) {
		//	counter = 0; 
		//}
	
		
	}




	
	
	
}
