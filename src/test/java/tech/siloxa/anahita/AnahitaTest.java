package tech.siloxa.anahita;

import java.awt.*;

public class AnahitaTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Anahita(args, AnahitaTest.class).run());
    }
}
