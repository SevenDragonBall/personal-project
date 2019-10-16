import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 标志点类
 */
public class Red extends Actor
{
    private boolean Hold/*被木桶压住*/=false;
    public void act() 
    {
        SetCrash();//碰撞检测
    }    

    public void SetCrash(){//碰撞检测
        Actor Vat=getOneIntersectingObject(Vat.class);
        if(Vat!=null){
             Hold=true;
        }
        else {
             Hold=false;
        }
    }
    
    public boolean isHold(){//是否被木桶压住
       return Hold;
    }
    
}
