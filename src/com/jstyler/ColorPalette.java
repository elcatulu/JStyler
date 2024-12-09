package com.jstyler;

import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.Map;

public class ColorPalette {

    public static final Map<String, Color> COLORS = new LinkedHashMap<>();

    static {
        COLORS.put("Dark Gray", new Color(22, 23, 26));
        COLORS.put("Very Dark", new Color(13, 8, 13));
        COLORS.put("Dark Blue", new Color(42, 35, 73));
        COLORS.put("Teal Blue", new Color(50, 83, 95));
        COLORS.put("Blue", new Color(65, 128, 160));
        COLORS.put("Light Blue", new Color(104, 174, 212));
        COLORS.put("Sky Blue", new Color(116, 173, 187));
        COLORS.put("Green", new Color(123, 178, 78));
        COLORS.put("Bright Green", new Color(16, 210, 117));
        COLORS.put("Light Beige", new Color(255, 249, 228));
        COLORS.put("Warm Gray", new Color(190, 187, 178));
        COLORS.put("Warm Yellow", new Color(251, 223, 155));
        COLORS.put("Orange Yellow", new Color(240, 189, 119));
        COLORS.put("Warm Orange", new Color(197, 145, 84));
        COLORS.put("Reddish Orange", new Color(232, 153, 115));
        COLORS.put("Warm Red", new Color(193, 108, 91));
        COLORS.put("Dark Red", new Color(79, 43, 36));
        COLORS.put("Deep Red", new Color(127, 6, 34));
        COLORS.put("Bright Red", new Color(214, 36, 17));
        COLORS.put("Light Pink", new Color(255, 128, 164));
        COLORS.put("Bright Pink", new Color(255, 38, 116));
        COLORS.put("Dark Pink", new Color(148, 33, 106));
        COLORS.put("Dark Purple", new Color(67, 0, 103));
    }

    public static String applyColorByName(String text, String colorName) {
        Color color = COLORS.get(colorName);
        if (color != null) {
            String hexColor = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
            return "<span style='color:" + hexColor + "'>" + text + "</span>";
        }
        return text;
    }

    public static String applyColorByHex(String text, String hexColor) {
        return "<span style='color:" + hexColor + "'>" + text + "</span>";
    }
}
