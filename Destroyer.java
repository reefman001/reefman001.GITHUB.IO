/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipgraphical;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Destroyer implements Ship{
	int health;
	int orientate;
	int x, y;
	Image img;
	public Destroyer(){
		health = 3;
		orientate = 0;
		//supply image for drawing to screen needs image return or draw method
        img = new ImageIcon("C:\\Users\\Notorious-V\\Desktop\\resources\\BattleShipSprites\\destroyer.png").getImage();
	}
	@Override
	public void health() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Orientation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void repaint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, 110, 110, null);
	}

}

