package wintryInquest;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;
import renderEngine.MasterRenderer;

public class MainGameLoop {

	public static void main(String[] args) {

		DisplayManager.createDisplay();
		
		MasterRenderer renderer = new MasterRenderer();
		
		while(!Display.isCloseRequested()) {
			
			renderer.prepare();
			
			DisplayManager.updateDisplay();
			
		}
		
		DisplayManager.closeDisplay();

	}

}
