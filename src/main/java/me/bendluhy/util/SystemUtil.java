package me.bendluhy.util;

import java.awt.*;

public class SystemUtil {
    public SystemUtil()
    {

    }
    public Dimension getScreenDimensions()
    {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
