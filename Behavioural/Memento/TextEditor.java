import java.util.Objects;

public class TextEditor {
    History history = new History();

    EditorMemento editorMemento = new EditorMemento("");

    void setContent(String content) {
        editorMemento.setContent(content);
    }

    void save() {
        history.addEntry(new EditorMemento(editorMemento.getContent()));
    }

    void undo() {
        EditorMemento memento = history.undo();
        if (Objects.nonNull(memento)) {
            editorMemento.setContent(memento.getContent());
        }
    }

    String getContent() {
        return editorMemento.getContent();
    }
}
