package org.jachievement;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author cedaniel200
 */
public final class AchievementButton extends JButton {

    public static final String POSITION_FULL_SIZE_TO_RIGHT_OF_THE_DECRIPTION = "cell 2 1, aligny center, growy";
    public static final String POSITION_TO_BOTTOM_RIGHT_OF_THE_DECRIPTION = "cell 2 2, aligny center, growy";
    public static final String POSITION_BOTTOM_OF_DESCRIPTION_RIGHT_ALIGNED = "cell 1 2, right, growy";;
    public static final String POSITION_BOTTOM_OF_DESCRIPTION_LEFT_ALIGNED = "cell 1 2, left, growy";
    public static final String POSITION_FULL_SIZE_BOTTOM_OF_DESCRIPTION = "cell 1 2, width 260!";
    
    private Color hoverBackgroundColor;
    private Color pressedBackgroundColor;
    private String position;

    public AchievementButton() {
        this(null);
        setPosition(AchievementButton.POSITION_FULL_SIZE_TO_RIGHT_OF_THE_DECRIPTION);
        setBackground(Color.WHITE);
        setHoverBackgroundColor(Color.WHITE);
        setPressedBackgroundColor(Color.WHITE);
    }

    public AchievementButton(String text) {
        super(text);
        super.setContentAreaFilled(false);
        setPosition(AchievementButton.POSITION_FULL_SIZE_TO_RIGHT_OF_THE_DECRIPTION);
        setBackground(Color.WHITE);
        setHoverBackgroundColor(Color.WHITE);
        setPressedBackgroundColor(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(pressedBackgroundColor);
        } else if (getModel().isRollover()) {
            g.setColor(hoverBackgroundColor);
        } else {
            g.setColor(getBackground());
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    @Override
    public void setContentAreaFilled(boolean b) {
    }

    public Color getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public void setHoverBackgroundColor(Color hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
    }

    public Color getPressedBackgroundColor() {
        return pressedBackgroundColor;
    }

    public void setPressedBackgroundColor(Color pressedBackgroundColor) {
        this.pressedBackgroundColor = pressedBackgroundColor;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
