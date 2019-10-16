import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Font;
/**
 *沙滩类
 */
public class SandBeach extends World
{
    private int[][] Map=//地图
           {{1,1,1,1,1,1,1,1,1,1},
            {1,2,1,0,0,0,0,0,0,1}, 
            {1,0,0,0,1,3,0,0,0,1}, 
            {1,0,0,0,1,0,0,0,0,1}, 
            {1,0,0,0,1,3,0,0,0,1}, 
            {1,0,0,0,0,0,0,0,1,1}, 
            {1,9,0,0,0,0,0,0,2,1}, 
            {1,1,1,1,1,1,1,1,1,1}};

    public SandBeach()
    {    
        super(10, 8, 60); //创建10*8的单元格
        setPaintOrder(Caption.class,Person.class,Vat.class,Stone.class,Red.class);//添加了演员类
        addObject(new Caption(),getWidth()/2, getHeight()/2);
    }

    public void started(){//初始化
        StartMap();
        removeObjects(getObjects(Caption.class));
    }

    public void StartMap(){//将演员类添加在各个位置
        for(int i = 0 ; i < Map.length ; i++ )
            for(int j = 0 ; j < Map[i].length ; j++ )
                if(Map[i][j]==1){
                    addObject(new Stone(), j, i);
                }
                else if(Map[i][j]==2){
                    addObject(new Red(), j, i);
                }
                else if(Map[i][j]==3){
                    addObject(new Vat(), j, i);
                }
                else if(Map[i][j]==9){
                    addObject(new Person(), j, i);
        }
    }

    public void act(){
        if(GameOver()){  //如果游戏结束
            addObject(new Caption(true),getWidth()/2, getHeight()/2);//添加游戏说明
            Greenfoot.stop();//游戏结束
        }
    }

    public boolean GameOver(){//判断游戏是否结束
        List AllRed=getObjects(Red.class);
        int k = 0 ;
        for( ; k < AllRed.size() ; k++ ){
            Object Red = AllRed.get(k);
            if(((Red)Red).isHold() == false) break;//是否木桶被压住
        }
        if(k == AllRed.size()) return true;
        else return false;
    } 

}
