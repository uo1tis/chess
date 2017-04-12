package com.mygdx.game.test;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.IndexArray;
import com.badlogic.gdx.math.Vector2;
import com.sun.org.apache.bcel.internal.generic.INEG;

/**
 * Created by Vyacheslav on 12.04.2017.
 */

public class Figure {

    protected Vector2 position;
    Vector2 mouselastcoor = new Vector2();
    protected Texture texture;
    public final static int size = 64;

    public Figure(Vector2 position, Texture texture) {
        this.position = position;
        this.texture = texture;
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y, size, size);

    }

    public void update() {
        if (InputHandler.isPressed()) {
            Gdx.app.log("cl", String.valueOf(InputHandler.getMousePosition().x + " " + InputHandler.getMousePosition().y));
            if ((InputHandler.getMousePosition().x > position.x && InputHandler.getMousePosition().x < position.x + size) &&
                    (InputHandler.getMousePosition().y > position.y && InputHandler.getMousePosition().y < position.y + size)) {
                position.x = InputHandler.getMousePosition().x - size/2;
                position.y = InputHandler.getMousePosition().y - size/2;
            }
        }
    }

    public Vector2 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }


}
