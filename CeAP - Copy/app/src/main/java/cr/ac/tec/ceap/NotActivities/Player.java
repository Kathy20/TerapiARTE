package cr.ac.tec.ceap.NotActivities;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Franco on 10/26/2015.
 */
public class Player {
    static MediaPlayer player;
    public static void playMusic(int song, boolean loop, Context c) {

        player = MediaPlayer.create(c, song);
        player.setLooping(loop);
        player.setVolume(100,100);
        player.start();
    }
    public static void stop() {
        player.stop();
    }

    public static MediaPlayer getPlayer() {
        return player;
    }


}
