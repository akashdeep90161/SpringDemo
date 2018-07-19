package org.akash.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
//@Controller it is defined for controller class in spring mvc
// @Service it defines services in mvc
//@Repository it define data resources in spring
public class Circle implements Shape{

    private Point centre;
    public Point getCentre() {
        return centre;
    }

    @Resource
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
       System.out.println("Drawing a Circle");
      System.out.println("Circle Point is: (" + centre.getX() + "," + centre.getY() + ")");
    }

    @PostConstruct
    public void initializeCircle()
    {
        System.out.println("circle is initializing");
    }
    @PreDestroy
    public void destroyCircle()
    {
        System.out.println("Circle is destroying");
    }

}
