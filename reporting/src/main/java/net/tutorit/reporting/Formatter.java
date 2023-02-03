package net.tutorit.reporting;

import java.util.List;

public interface Formatter {
	default String begin(List<ColumnDef> defs) {return "";}
	default String end(List<ColumnDef> defs) {return "";}
	default String row(List<ColumnDef> defs,List<String> data) {return "";}

}
