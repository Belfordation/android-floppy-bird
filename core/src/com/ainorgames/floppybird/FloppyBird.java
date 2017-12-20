package com.ainorgames.floppybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FloppyBird extends ApplicationAdapter {
	SpriteBatch batch;
	Texture background;
	Texture bird;

	Texture[] birds;
	int flapState = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("bg.png");
		bird = new Texture("bird.png");

		birds = new Texture[2];
		birds[0] = new Texture("bird.png");
		birds[1] = new Texture("bird2.png");

	}

	@Override
	public void render () {

		if (flapState == 0) {
			flapState = 1;
		} else {
			flapState = 0;
		}

		batch.begin();
		batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		batch.draw(bird,Gdx.graphics.getWidth() / 2 - bird.getWidth() / 2, Gdx.graphics.getHeight() / 2 - bird.getWidth() /2 );
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
