package me.cachat.main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PstopExe implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command arg1, String arg2, String[] args) {
        if (!(s instanceof Player)) {
            s.sendMessage("\u0412\u0430\u043c \u043d\u0435 \u043d\u0430\u0434\u043e \u043f\u043b\u0430\u0442\u0438\u0442\u044c \u043d\u0430\u043b\u043e\u0433\u0438.");
            return true;
        }
        
        Player p = (Player) s;
        
        if (args.length == 0 || args.length > 1) {
        	p.sendMessage("\u00a74/purn [ник]");
        }
        
        Player target = Bukkit.getPlayer(args[0]);
        
        target.setWalkSpeed(0);
        target.setFlySpeed(0);
        
		return true;
	}

}
