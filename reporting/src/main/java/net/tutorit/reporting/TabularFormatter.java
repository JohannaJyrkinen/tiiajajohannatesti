package net.tutorit.reporting;

import java.util.List;

public class TabularFormatter implements Formatter{
	
	//private int counter;
	 
	String pad(String s, int l){
        String format="%-"+l+"s";
        String result=String.format(format, s).substring(0,l);
        return result;
    } 

	@Override
	public String begin(List<ColumnDef> defs) {
		//Palautetaan otsikkorivi tietoineen ja leveyksineen
		String title = "";
		for (ColumnDef c: defs) {
			title += String.format("%-"+c.getWidth()+"s", c.getName()).substring(0, c.getWidth());
		}
		return title;
	}

	@Override
	public String end(List<ColumnDef> defs) {
		// Tyhjennetään rivi
		String end = ""; 
		return end;
	}

	@Override
	public String row(List<ColumnDef> defs, List<String> data) {
		// Luodaan rivi käyttäen column sisältöä ja dataa
		String row = "";
		//int size = defs.size(); 
		for (int i =0; i < defs.size(); i++) {
			row += pad(data.get(i), defs.get(i).getWidth()); 
			
		}
		//ColumnDef col = defs.get(counter);
		//String d = data.get(counter);
		//counter++; 
		//pad(d, col.getWidth()); 
		return row; 
		
		
		
	}

}
