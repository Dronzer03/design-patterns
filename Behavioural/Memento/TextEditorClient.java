public class TextEditorClient {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.setContent("First Sentence");
        textEditor.save();

        textEditor.setContent("Second Sentence");
        textEditor.save();

        textEditor.setContent("Updated Content");
        textEditor.undo();

        System.out.println(textEditor.getContent());
    }
}
