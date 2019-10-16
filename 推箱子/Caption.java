import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 *字幕类
 */
public class Caption extends Actor
{
    public Caption(){//封面字幕
        GreenfootImage Picture=new GreenfootImage(600,480);
        Picture.drawString("click   \"Run\"   to  play", 220, 250);
        Font Type/*字体*/=new Font("Arial",Font.ITALIC+Font.BOLD,50);
        Picture.setFont(Type);
        Picture.drawString("Push", 220, 200);
        setImage(Picture);
    }
    
    public Caption(boolean isEnd/*是否结束*/){//结束字幕
        GreenfootImage Picture=new GreenfootImage(600,480);
        Font Type=new Font("Arial",Font.ITALIC+Font.BOLD,50);
        Picture.setFont(Type);
        Picture.drawString("Finished!", 180, 220);
        setImage(Picture);
    }
    
}
