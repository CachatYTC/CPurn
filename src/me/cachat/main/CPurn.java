package me.cachat.main;

import org.bukkit.plugin.java.JavaPlugin;

public class CPurn extends JavaPlugin{
	
	public void onEnable() {
		getCommand("purn").setExecutor(new PurnExe());
		getCommand("pstop").setExecutor(new PstopExe());
	}

}
