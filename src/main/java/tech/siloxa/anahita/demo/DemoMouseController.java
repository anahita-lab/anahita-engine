package tech.siloxa.anahita.demo;

import tech.siloxa.anahita.io.AbstractMouseController;
import tech.siloxa.anahita.io.Mouse;
import tech.siloxa.anahita.io.MouseButton;

import java.util.List;

public class DemoMouseController extends AbstractMouseController {

    public final MouseButton left = new MouseButton(Mouse.LEFT);
    public final MouseButton right = new MouseButton(Mouse.RIGHT);

    public DemoMouseController() {
        init(List.of(left, right));
    }

    @Override
    public void input() {
        if(right.clicked) {
            System.out.println("rightMouse");
        }
        if(left.clicked) {
            System.out.println("leftMouse");
        }
    }
}
