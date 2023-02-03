package net.tutorit.reporting;

import java.util.List;

public class HtmlFormatter implements Formatter{

	@Override
	public String begin(List<ColumnDef> defs) {
		// TODO Auto-generated method stub
		String title = "<table>\n"
				+"<tr><td>" +""
				
		;
		for (ColumnDef c: defs) {
			title += c.getName(); 
		}
		return title; 
	}

	@Override
	public String end(List<ColumnDef> defs) {
		// TODO Auto-generated method stub
		return Formatter.super.end(defs);
	}

	@Override
	public String row(List<ColumnDef> defs, List<String> data) {
		// TODO Auto-generated method stub
		return Formatter.super.row(defs, data);
	}
	
	

}
