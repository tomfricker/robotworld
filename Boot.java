package data;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

import static helpers.Artist.*;

public class Boot {
	
	//Constructor for the Boot Class
	public Boot() {
		
		BeginSession();
		
		
		while(!Display.isCloseRequested()) {
			
			DrawQuad(0, 0, 100, 100);
			DrawQuad(0, 200, 100, 100);
			DrawQuad(100, 100, 100, 100);
			DrawQuad(100, 300, 100, 100);
			DrawQuad(200, 200, 100, 100);
			DrawQuad(200, 0, 100, 100);
			DrawQuad(300, 300, 100, 100);
			DrawQuad(300, 100, 100, 100);
			DrawQuad(400, 0, 100, 100);
			DrawQuad(400, 200, 100, 100);
			DrawQuad(500, 100, 100, 100);
			DrawQuad(500, 300, 100, 100);
			
			Display.update();
			Display.sync(60);
			
		}
		
		Display.destroy();
	}

	public static void main(String[] args) {
		new Boot();
	}

}
