import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 人物类
 */
public class Person extends Moves
{

    public void act() 
    {
        MouseClicked();//按键检测

        Move();//移动

        SetCrash();//碰撞检测
    }    

    public void MouseClicked(){//按键检测
        if(Greenfoot.isKeyDown("right")){
            Direction=East;
        }
        else if(Greenfoot.isKeyDown("left")){
            Direction=West;
        }
        else if(Greenfoot.isKeyDown("up")){
            Direction=North;
        }
        else if(Greenfoot.isKeyDown("down")){
            Direction=Sourth;
        }
        else Direction=-1;
    }

    public void SetCrash(){//碰撞检测
        super.SetCrash();//调用父类
        Actor Vat=getOneIntersectingObject(Vat.class);
        if(Vat!=null){
            Retreat();//后退
            PushVat(Direction,Vat);//推木桶
        }

    }

    public void PushVat(int Direction, Actor Vat){//推木桶
        ((Vat)Vat).SetMoveSign(true);//设置移动标志
        ((Vat)Vat).SetDirection(Direction);
    }


}
