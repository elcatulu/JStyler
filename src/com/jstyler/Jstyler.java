package com.jstyler;

/**
 * JStyler class provides simplified access to various styling, color, and file operations.
 *
 * Methods:
 * - colorName: Retrieves the name of the color if it exists in the palette.
 * - colorHex: Retrieves the hexadecimal representation of a color by its name.
 * - applyBold: Applies bold formatting to the text.
 * - applyItalic: Applies italic formatting to the text.
 * - applyStrikethrough: Applies strikethrough formatting to the text.
 * - applyCode: Applies inline code formatting to the text.
 * - applyHeader1: Applies level 1 header formatting.
 * - applyHeader2: Applies level 2 header formatting.
 * - applyHeader3: Applies level 3 header formatting.
 * - applyBulletedList: Creates an unordered list.
 * - applyNumberedList: Creates an ordered list.
 * - applyBlockquote: Applies blockquote formatting to text.
 * - applyCodeBlock: Creates a block of code.
 * - applyHorizontalRule: Adds a horizontal rule.
 * - applyLink: Creates a link.
 * - applyImage: Creates an image.
 * - applyUnderline: Applies underline formatting to the text.
 * - saveToFile: Saves content to a file.
 * - readFromFile: Reads content from a file.
 * - editAndSaveFile: Edits an existing file by saving new content to it.
 */
public class Jstyler {

    private ColorPalette colorPalette;
    private TextStyler textStyler;
    private FileHandler fileHandler;

    public Jstyler() {
        colorPalette = new ColorPalette();
        textStyler = new TextStyler();
        fileHandler = new FileHandler();
    }


    public String colorName(String text, String colorName) {
        return colorPalette.applyColorByName(text, colorName);
    }

    public String colorHex(String text, String hexColor) {
        return colorPalette.applyColorByName(text, hexColor);
    }


    public String bold(String text) {
        return textStyler.applyBold(text);
    }

    public String italic(String text) {
        return textStyler.applyItalic(text);
    }

    public String applyStrikethrough(String text) {
        return textStyler.applyStrikethrough(text);
    }

    public String applyCode(String text) {
        return textStyler.applyCode(text);
    }

    public String header1(String text) {
        return textStyler.applyHeader1(text);
    }

    public String header2(String text) {
        return textStyler.applyHeader2(text);
    }

    public String header3(String text) {
        return textStyler.applyHeader3(text);
    }

    public String bulletedList(String... items) {
        return textStyler.applyBulletedList(items);
    }

    public String numberedList(String... items) {
        return textStyler.applyNumberedList(items);
    }

    public String blockquote(String text) {
        return textStyler.applyBlockquote(text);
    }

    public String codeBlock(String code) {
        return textStyler.applyCodeBlock(code);
    }

    public String horizontalRule() {
        return textStyler.applyHorizontalRule();
    }

    public String link(String text, String url) {
        return textStyler.applyLink(text, url);
    }

    public String images(String altText, String imageUrl) {
        return textStyler.applyImage(altText, imageUrl);
    }

    public String underline(String text) {
        return textStyler.applyUnderline(text);
    }

    // FileHandler Methods
    public void saveToFile(String fileName, String content) {
        fileHandler.createAndSaveFile(fileName, content);
    }

    public String readFromFile(String fileName) {
        return fileHandler.readFile(fileName);
    }

    public void editAndSaveFile(String fileName, String newContent) {
        fileHandler.editAndSaveFile(fileName, newContent);
    }
}
