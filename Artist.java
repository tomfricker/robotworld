package helpers;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glVertex2i;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Artist {
	
	public static final int WIDTH = 600, HEIGHT = 400;
	
	public static void BeginSession() {
		Display.setTitle("Robot World");
		try {
			Display.setDisplayMode(new DisplayMode(600, 400));
			Display.create();
		}
		catch(LWJGLException e) {
			e.printStackTrace();
		}
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 600, 400, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
	}
	
	public static void DrawQuad(int x, int y, int width, int height) {
		glBegin(GL_QUADS);
		glVertex2i(x, y); //top left corner
		glVertex2i(x + width, y); //top right corner
		glVertex2i(x + width, y + height); //bottom right corner
		glVertex2i(x, y + height); //bottom left corner
		glEnd();
	}

}
