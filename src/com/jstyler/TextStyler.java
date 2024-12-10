package com.jstyler;

/**
 * TextStyler is a class designed to apply Markdown styles to text.
 * It provides methods to format text in Markdown, such as bold, italic, headers,
 * lists, blockquotes, links, images, and more.
 *
 * Main methods:
 * - applyBold: Applies bold formatting to the text.
 * - applyItalic: Applies italic formatting to the text.
 * - applyStrikethrough: Applies strikethrough formatting to the text.
 * - applyCode: Applies inline code formatting to the text.
 * - applyHeader1, applyHeader2, applyHeader3: Applies different levels of headers.
 * - applyBulletedList: Creates an unordered list.
 * - applyNumberedList: Creates an ordered list.
 * - applyBlockquote: Applies blockquote formatting to text.
 * - applyCodeBlock: Creates a block of code.
 * - applyHorizontalRule: Adds a horizontal rule.
 * - applyLink: Creates a link.
 * - applyImage: Creates an image.
 * - applyUnderline: Applies underline formatting to the text.
 *
 */
public class TextStyler {

    public static final String BOLD = "**";
    public static final String ITALIC = "*";
    public static final String UNDERLINE = "++";
    public static final String STRIKETHROUGH = "~~";
    public static final String CODE = "`";
    public static final String HEADING_1 = "# ";
    public static final String HEADING_2 = "## ";
    public static final String HEADING_3 = "### ";
    public static final String BULLETED_LIST = "- ";
    public static final String NUMBERED_LIST = "1. ";
    public static final String BLOCKQUOTE = "> ";
    public static final String CODE_BLOCK = "```\n";
    public static final String HORIZONTAL_RULE = "---";
    public static final String LINK_TEMPLATE = "[text](url)";
    public static final String IMAGE_TEMPLATE = "![alt text](image url)";

    public String applyBold(String text) {
        return BOLD + text + BOLD;
    }

    public String applyItalic(String text) {
        return ITALIC + text + ITALIC;
    }

    public String applyStrikethrough(String text) {
        return STRIKETHROUGH + text + STRIKETHROUGH;
    }

    public String applyCode(String text) {
        return CODE + text + CODE;
    }

    public String applyHeader1(String text) {
        return HEADING_1 + text;
    }

    public String applyHeader2(String text) {
        return HEADING_2 + text;
    }

    public String applyHeader3(String text) {
        return HEADING_3 + text;
    }

    public String applyBulletedList(String... items) {
        StringBuilder list = new StringBuilder();
        for (String item : items) {
            list.append(BULLETED_LIST).append(item).append("\n");
        }
        return list.toString();
    }

    public String applyNumberedList(String... items) {
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            list.append(i + 1).append(". ").append(items[i]).append("\n");
        }
        return list.toString();
    }

    public String applyBlockquote(String text) {
        return BLOCKQUOTE + text;
    }

    public String applyCodeBlock(String code) {
        return CODE_BLOCK + code + "\n" + CODE_BLOCK;
    }

    public String applyHorizontalRule() {
        return HORIZONTAL_RULE;
    }

    public String applyLink(String text, String url) {
        return LINK_TEMPLATE.replace("text", text).replace("url", url);
    }

    public String applyImage(String altText, String imageUrl) {
        return IMAGE_TEMPLATE.replace("alt text", altText).replace("image url", imageUrl);
    }

    public String applyUnderline(String text) {
        return UNDERLINE + text + "++";
    }
}
