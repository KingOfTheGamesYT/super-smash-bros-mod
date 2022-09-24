package com.jawser.main;

import com.jawser.entity.cfalcon.Cfalcon;
import com.jawser.entity.drmario.Drmario;
import com.jawser.entity.fox.Fox;
import com.jawser.entity.hand.Hand;
import com.jawser.entity.kirby.Kirby;
import com.jawser.entity.link.Link;
import com.jawser.entity.littlemac.LittleMac;
import com.jawser.entity.luigi.Luigi;
import com.jawser.entity.mario.Mario;
import com.jawser.entity.megaman.Megaman;
import com.jawser.entity.pacman.Pacman;
import com.jawser.entity.pokemon.charizard.Charizard;
import com.jawser.entity.pokemon.mewtwo.MT;
import com.jawser.entity.pokemon.pikachu.Pikachu;
import com.jawser.entity.samus.Samus;
import com.jawser.items.SmashItems;
import com.jawser.lib.Strings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)
public class mainRegistry
{
	
	@SidedProxy(clientSide = "com.jawser.main.ClientProxy", serverSide = "com.jawser.main.ServerProxy")
	public static ServerProxy proxy;

    @Metadata
    public static ModMetadata meta;
    
    @Instance(Strings.MODID)
    public static mainRegistry modInstance;
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	proxy.registerRenderThings();
    	//Mobs
    	Mario.mainRegistry();
    	Luigi.mainRegistry();
    	Link.mainRegistry();
    	Kirby.mainRegistry();
    	Hand.mainRegistry();
    	LittleMac.mainRegistry();
    	Pacman.mainRegistry();
    	Megaman.mainRegistry();
    	Samus.mainRegistry();
    	Drmario.mainRegistry();
    	Cfalcon.mainRegistry();
    	Fox.mainRegistry();
    	//Pokemon
    	Pikachu.mainRegistry();
    	Charizard.mainRegistry();
    	MT.mainRegistry();
    	//Item Registry
    	SmashItems.mainRegistry();
    	
    	CraftingManager.mainRegistry();
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent)
    {	 	
    	}
    }
