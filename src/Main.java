import com.jstyler.Jstyler;

public class Main {
    public static void main(String[] args) {
        Jstyler jstyler = new Jstyler();

        // Crear contenido Markdown
        String content = """
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

                """ +
                "- " + jstyler.colorName("Dark Blue", "Dark Blue") + ": `" + jstyler.colorHex("Dark Blue", "#2a2349") + "`\n" +
                "- " + jstyler.colorName("Bright Green", "Bright Green") + ": `" + jstyler.colorHex("Bright Green", "#10d275") + "`\n" +
                "- " + jstyler.colorName("Warm Red", "Warm Red") + ": `" + jstyler.colorHex("Warm Red", "#c16c5b") + "`\n" +
                """
                
                You can use predefined color names from the palette, making it easy to stylize text for enhanced readability.
                """;

        // Guardar contenido en un archivo
        jstyler.saveToFile("JstylerDocumentation.md", content);

        // Leer el contenido del archivo para verificar
        String result = jstyler.readFromFile("JstylerDocumentation.md");
        System.out.println("File Content:\n" + result);
    }
}
