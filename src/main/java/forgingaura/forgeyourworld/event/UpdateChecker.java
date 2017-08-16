package forgingaura.forgeyourworld.event;

import cjminecraft.core.util.VersionChecker;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class UpdateChecker {
	
	@SubscribeEvent
	public void onPlayerJoinEvent(PlayerLoggedInEvent event) {
		VersionChecker.checkForUpdate(MainHandler.VERSION_CHECKER_URL, MainHandler.MODID, MainHandler.VERSION, event.player);
	}

}
