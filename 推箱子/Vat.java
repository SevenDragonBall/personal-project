import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *木桶类
 */
public class Vat extends Moves
{
    private boolean MoveSign = false;//移动标志
    public void act() 
    {
        if(MoveSign==true){//如果检测到移动了的话
            Greenfoot.playSound("roll.wav");
            Move();
            SetMoveSign(false);//重新设置移动标志
        }
        SetCrash();//碰撞检测

    }   

    public void SetCrash(){//碰撞检测
        super.SetCrash();
        Actor Vat = getOneIntersectingObject(Vat.class);
        if(Vat!=null){
            Retreat();//后退
        }

    }
  
    public void SetMoveSign(boolean isMove/*是否移动*/){//设置移动标志
        MoveSign = isMove;
    }

}
