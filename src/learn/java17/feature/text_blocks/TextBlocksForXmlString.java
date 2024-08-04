package learn.java17.feature.text_blocks;

/**
 * Text Blocks:
 * - To support pasting of large files contents such as xml
 */
public class TextBlocksForXmlString {

    public static void main(String[] args) {
        var xml = """
            <note>
                <to>Tove</to>
                <from>Jani</from>
                <heading>Reminder</heading>
                <body>Don't forget me this weekend!</body>
            </note>
            """;
        System.out.println(xml);
    }
}
