package ioprogramming.designpatterns;

class Editor {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public EditorMemento save() {
        return new EditorMemento(state);
    }

    public void restore(EditorMemento memento) {
        state = memento.getState();
    }
}

class EditorMemento {
    private final String state;

    public EditorMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

public class MementoPatternDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setState("Version1");
        EditorMemento saved = editor.save();

        editor.setState("Version2");
        editor.restore(saved);

        System.out.println(editor.getState());
    }
}