package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.states.GameState;
import com.mygdx.game.states.GameStateManager;

public class Main extends ApplicationAdapter {

	SpriteBatch batch;
	GameStateManager gsm;
	public final static int HIGHT = 600;
	public final static int WIDTH = 600;
	public final static float ft=1f/60f;
	public static BitmapFont font;
	
	@Override
	public void create () {
		Gdx.graphics.setTitle("TicTacToe");
		Gdx.graphics.setWindowedMode(WIDTH,HIGHT);
		font =new BitmapFont();
		batch = new SpriteBatch();
		gsm= new GameStateManager();
		gsm.push(new GameState());

	}

	@Override
	public void render () {
		update();
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);

	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
	public void update(){

	}
}
