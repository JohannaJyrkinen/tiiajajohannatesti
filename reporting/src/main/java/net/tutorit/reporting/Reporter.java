package net.tutorit.reporting;

public interface Reporter {
	
	public void beginReport();
	void endReport();
	void addColumn(String title, int width);
	void printData(String data);
	void printData(int data);

}
