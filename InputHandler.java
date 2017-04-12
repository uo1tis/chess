package com.mygdx.game.test;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Vyacheslav on 12.04.2017.
 */

public class InputHandler {

    private Vector2 position;

    public static boolean isClicked() {
        return Gdx.input.justTouched();
    }

    public static boolean isPressed() {
        return Gdx.input.isTouched();
    }

    public static Vector2 getMousePosition() {
        return new Vector2(Gdx.input.getX(), GameApl.GAME_HEIGHT-Gdx.input.getY());
    }
}
