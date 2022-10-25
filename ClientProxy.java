package com.jawser.main;

import com.jawser.entity.cfalcon.CfalconMob;
import com.jawser.entity.cfalcon.CfalconRender;
import com.jawser.entity.cfalcon.ModelCfalcon;
import com.jawser.entity.drmario.DrmarioMob;
import com.jawser.entity.drmario.DrmarioRender;
import com.jawser.entity.drmario.ModelDrmario;
import com.jawser.entity.fox.FoxMob;
import com.jawser.entity.fox.FoxRender;
import com.jawser.entity.fox.ModelFox;
import com.jawser.entity.hand.HandMob;
import com.jawser.entity.hand.HandRender;
import com.jawser.entity.hand.ModelHand;
import com.jawser.entity.kirby.KirbyMob;
import com.jawser.entity.kirby.KirbyRender;
import com.jawser.entity.kirby.ModelKirby;
import com.jawser.entity.link.LinkMob;
import com.jawser.entity.link.LinkRender;
import com.jawser.entity.link.ModelLink;
import com.jawser.entity.littlemac.LittleMacMob;
import com.jawser.entity.littlemac.LittleMacRender;
import com.jawser.entity.littlemac.ModelLittleMac;
import com.jawser.entity.luigi.LuigiMob;
import com.jawser.entity.luigi.LuigiRender;
import com.jawser.entity.luigi.ModelLuigi;
import com.jawser.entity.mario.MarioMob;
import com.jawser.entity.mario.MarioRender;
import com.jawser.entity.mario.ModelMario;
import com.jawser.entity.megaman.MegamanMob;
import com.jawser.entity.megaman.MegamanRender;
import com.jawser.entity.megaman.ModelMegaman;
import com.jawser.entity.pacman.ModelPacman;
import com.jawser.entity.pacman.PacmanMob;
import com.jawser.entity.pacman.PacmanRender;
import com.jawser.entity.pokemon.charizard.ChariMob;
import com.jawser.entity.pokemon.charizard.ChariModel;
import com.jawser.entity.pokemon.charizard.ChariRender;
import com.jawser.entity.pokemon.mewtwo.MTMob;
import com.jawser.entity.pokemon.mewtwo.MTRender;
import com.jawser.entity.pokemon.mewtwo.Mewtwo;
import com.jawser.entity.pokemon.pikachu.PikaMob;
import com.jawser.entity.pokemon.pikachu.PikaModel;
import com.jawser.entity.pokemon.pikachu.PikaRender;
import com.jawser.entity.samus.ModelSamus;
import com.jawser.entity.samus.SamusMob;
import com.jawser.entity.samus.SamusRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings() {
		//Mobs
		RenderingRegistry.registerEntityRenderingHandler(MarioMob.class, new MarioRender(new ModelMario(), 0));
		RenderingRegistry.registerEntityRenderingHandler(LuigiMob.class, new LuigiRender(new ModelLuigi(), 0));
		RenderingRegistry.registerEntityRenderingHandler(LinkMob.class, new LinkRender(new ModelLink(), 0));
		RenderingRegistry.registerEntityRenderingHandler(KirbyMob.class, new KirbyRender(new ModelKirby(), 0));
		RenderingRegistry.registerEntityRenderingHandler(HandMob.class, new HandRender(new ModelHand(), 0));
		RenderingRegistry.registerEntityRenderingHandler(LittleMacMob.class, new LittleMacRender(new ModelLittleMac(), 0));
		RenderingRegistry.registerEntityRenderingHandler(PacmanMob.class, new PacmanRender(new ModelPacman(), 0));
		RenderingRegistry.registerEntityRenderingHandler(MegamanMob.class, new MegamanRender(new ModelMegaman(), 0));
		RenderingRegistry.registerEntityRenderingHandler(SamusMob.class, new SamusRender(new ModelSamus(), 0));
		RenderingRegistry.registerEntityRenderingHandler(DrmarioMob.class, new DrmarioRender(new ModelDrmario(), 0));
		RenderingRegistry.registerEntityRenderingHandler(CfalconMob.class, new CfalconRender(new ModelCfalcon(), 0));
		RenderingRegistry.registerEntityRenderingHandler(FoxMob.class, new FoxRender(new ModelFox(), 0));
		
		//Pokemons
		RenderingRegistry.registerEntityRenderingHandler(PikaMob.class, new PikaRender(new PikaModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(ChariMob.class, new ChariRender(new ChariModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(MTMob.class, new MTRender(new Mewtwo(), 0));
	}
	
	}
