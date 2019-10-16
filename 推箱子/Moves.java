import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 移动体类，作为父类
 */
public abstract class Moves extends Actor
{
    protected int Direction=-1;
    public static final int Sourth=0;
    public static final int North=1;
    public static final int East=2;
    public static final int West=3;

    public void Move(){//移动
        switch(Direction){
            case East:setLocation(getX()+1, getY());break;
            case West:setLocation(getX()-1,getY());break;
            case North:setLocation(getX(),getY()-1);break;
            case Sourth:setLocation(getX(),getY()+1);break;
        }
       
    }

    public void Retreat(){//后退
        switch(Direction){
            case East:setLocation(getX()-1, getY());break;
            case West:setLocation(getX()+1,getY());break;
            case North:setLocation(getX(),getY()+1);break;
            case Sourth:setLocation(getX(),getY()-1);break;
        }
    }

    public void SetDirection(int Direction){//设置方向
        this.Direction=Direction;
    }

    public void SetCrash(){//碰撞检测
        Actor Stone=getOneIntersectingObject(Stone.class);
        if(Stone!=null){
            Retreat();
        }

    }

}
