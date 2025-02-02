Jstyler Library
===============

**Jstyler** is a Java library designed to make it easy to format and style text using Markdown.
It supports a variety of features, such as:

- **Bold** text.
- *Italic* text.
- ~~Strikethrough~~ text.
- Inline `code`.
- Code blocks.
- Lists (both ordered and unordered).
- Headers and blockquotes.
- Colors for text using predefined palettes.

Example:
--------

```java
Jstyler jstyler = new Jstyler();
String styled = jstyler.bold("This is bold text");
System.out.println(styled);
```

The library also allows you to apply colors to your text. Here are some examples:

- %%#2a2349%%Dark Blue%%: `Dark Blue`
- %%#10d275%%Bright Green%%: `Bright Green`
- %%#c16c5b%%Warm Red%%: `Warm Red`

You can use predefined color names from the palette, making it easy to stylize text for enhanced readability.
