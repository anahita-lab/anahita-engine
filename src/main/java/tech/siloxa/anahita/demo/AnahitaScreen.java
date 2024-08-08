package tech.siloxa.anahita.demo;

import tech.siloxa.anahita.controller.InputController;
import tech.siloxa.anahita.grapichs.DynamicScreen;
import tech.siloxa.anahita.grapichs.Map;

import java.awt.*;

public class AnahitaScreen extends DynamicScreen {

    @Override
    public Map map() {
        return null;
    }

    @Override
    public void input(InputController controller) {
        controller.setKeyboardController(new AnahitaKeyboardController());
        // باید آناهیتا کیبورد هندلر بره تو ابسترکت کیبورد هندلر بعد این ابسترکتش پاک شه تبدیل شه به یه کلاس عادی. تمام دکمه های کیبورد همونجا تعریف میشن و در نهایت هر اسکرین میتونه به کل کیبوردا دسترسی داشته باشه و اکشن های خودشو برای هر دکمه تعریف کنه و تو لوپ اصلی اسکرین منیجره که تصمیم می گیره الان کدوم اسکرین باید کنترل رو به دست بگیره
    }

    @Override
    public void render(Graphics2D graphics) {
        graphics.setColor(Color.GRAY);
        graphics.fillRect(100, 50, 100, 100);
    }
}
