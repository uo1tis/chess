package com.mygdx.game.test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Vyacheslav on 12.04.2017.
 */
public class GameApl extends ApplicationAdapter {

   public final static int GAME_WIDTH = 800;
   public final static int GAME_HEIGHT = 480;

    SpriteBatch batch;
    BitmapFont font;
    Figure[] figure;

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        figure = new Figure[3];
        for(int i =0; i<3;i++){
            figure[i] = new Figure(new Vector2(i*Figure.size,i*Figure.size),new Texture("pawn.png"));
        }
    }

    @Override
    public void render() {
        update();

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        for(int i =0;i<3;i++){
            figure[i].render(batch);
        }
        batch.end();
    }

    public void update() {
        for(int i=0;i<3;i++)
            figure[i].update();
    }

    @Override
    public void dispose() {

    }
}
