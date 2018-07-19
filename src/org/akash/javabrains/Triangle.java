package org.akash.javabrains;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }


    public void draw() {
        System.out.println("Drawing a Triangle");
        System.out.println("point A = (" + getPointA().getX() + "," + getPointA().getY() + ")" );
        System.out.println("point B = (" + getPointB().getX() + "," + getPointB().getY() + ")" );
        System.out.println("point C = (" + getPointC().getX() + "," + getPointC().getY() + ")" );
    }

 /*   @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method called for triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method called for triangle");
    }

   public void myInit()
   {
       System.out.println("myInit method called for triangle");
   }
   public void cleanup()
   {
       System.out.println("cleanup method called for triangle");
   }  */

}
