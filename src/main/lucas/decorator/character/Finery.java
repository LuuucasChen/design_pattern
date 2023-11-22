package main.lucas.decorator.character;

public class Finery implements ICharacter{
    protected ICharacter component;

    public void decorate(ICharacter component) {
        this.component = component;
    }
    @Override
    public void show() {
        if (this.component != null) {
            this.component.show();
        }
    }
}
