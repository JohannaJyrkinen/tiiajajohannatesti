package net.tutorit.reporting;


public class ColumnDef {
	private String name;
	private Integer width;
	
	public ColumnDef(String name, Integer width) {
	
		this.name = name;
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	@Override
	public String toString() {
		
		return "ColumnDef [name=" + name + ", width=" + width ;
	}
	
	
	
	

}
