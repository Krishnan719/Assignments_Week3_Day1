package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("My desktop size is 12.5 inches");
	}
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.desktopSize();
		desktop.computerModel();
	}
}