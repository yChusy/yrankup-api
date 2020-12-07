package com.ystoreplugins.yrankup.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ystoreplugins.yrankup.model.Rank;

public class RankUpEvent extends Event implements Cancellable {
	
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean cancelled = false;
    private Player player;
    private Rank rank;
    private double desconto;
    
    public RankUpEvent(Player player, Rank rank, double desconto){
        this.player = player;
        this.rank = rank;
        this.desconto = desconto;
    }
    
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean value) {
        cancelled = value;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

	public Player getPlayer() {
		return player;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}