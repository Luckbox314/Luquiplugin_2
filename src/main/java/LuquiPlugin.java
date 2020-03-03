import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LuquiPlugin extends JavaPlugin implements Listener {

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {

    }

    @EventHandler
    public void playerLogin(EntityDamageByEntityEvent event){
        Entity damager = event.getDamager();
        if(damager instanceof Player){
            Player jugador = (Player)damager;
            Location location = jugador.getLocation();
            location.add(0, 10, 0);
            jugador.teleport(location);
            jugador.sendMessage("Up we go");
        }
    }
}
