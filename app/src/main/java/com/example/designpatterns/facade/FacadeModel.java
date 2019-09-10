package com.example.designpatterns.facade;

import android.util.Log;
import android.util.Printer;

/**
 * 外观模式
 * 通过一个外观角色来降低系统的复杂程度
 * 降低类与类之间的耦合关系
 * 优点：对客户端屏蔽了子系统组件，减少了客户端所需处理的对象数目，并使得子系统使用起来更加容易
 * 实现了子系统与客户端之间的松散耦合关系，这使得子系统的变化不会影响到调用它的客户端
 * 缺点：不能很好的限制客户端直接使用子类，
 */
public class FacadeModel {
    private Power power = new Power();
    private CPU cpu = new CPU();
    private Screen screen = new Screen();

    /**
     * 调用者直接调用此方法便可以实现想做的事
     * 就想我们这个例子中，我们只需调用一个方法，就可以实现打开电脑的三步
     */
    public void method() {
        power.start();
        cpu.start();
        screen.start();
    }


    class Power {
        public void start() {
            System.out.println("接通电源");
        }
    }

    class CPU {
        public void start() {
            System.out.println("启动cpu");
        }
    }

    class Screen {
        public void start() {
            System.out.println("启动屏幕");
        }
    }
}
