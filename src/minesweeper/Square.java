package minesweeper;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Square {

    private boolean clicked;
    private int mineCount;
    private Type squareType;
    private JButton button;
    private JLabel label;

    public enum Type {

        BLANK, MINE, NUMBER
    };

    public Square() {
        clicked = false;
        mineCount = 0;
        squareType = Type.BLANK;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setAsClicked() {
        clicked = true;
    }

    public int getMineCount() {
        return mineCount;
    }

    public void increaseMineCount() {
        mineCount++;
    }

    public boolean isMine() {
        return (this.squareType == Type.MINE);
    }

    public boolean isBlank() {
        return (this.squareType == Type.BLANK);
    }

    public boolean isNumber() {
        return (this.squareType == Type.NUMBER);
    }

    public void setType(Type squareType) {
        this.squareType = squareType;
    }

    public Type getType() {
        return squareType;
    }
}