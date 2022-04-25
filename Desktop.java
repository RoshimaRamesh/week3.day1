package org.system;

public class Desktop extends Computer{
	
	
	public void desktopSize()
	{
		System.out.println("desktop class");
	}
	

	public static void main(String[] args) {
		
		Desktop cmp = new Desktop();
		cmp.computerModel();
		cmp.desktopSize();
		

	}
}
