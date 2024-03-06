import java.util.Stack;

public class History {
    Stack<EditorMemento> history = new Stack<>();

    void addEntry(EditorMemento editorMemento) {
        history.push(editorMemento);
    }

    EditorMemento undo() {
        if (history.isEmpty())
            return null;
        return history.pop();
    }
}
