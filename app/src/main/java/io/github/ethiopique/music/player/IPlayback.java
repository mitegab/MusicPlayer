package io.github.ethiopique.music.player;

import android.support.annotation.Nullable;
import io.github.ethiopique.music.data.model.PlayList;
import io.github.ethiopique.music.data.model.Song;

/**
 * Created with Android Studio.
 * User: ethiopique@gmail.com
 * Date: 9/5/16
 * Time: 6:02 PM
 * Desc: IPlayer
 */
public interface IPlayback {

    void setPlayList(PlayList list);

    boolean play();

    boolean play(PlayList list);

    boolean play(PlayList list, int startIndex);

    boolean play(Song song);

    boolean playLast();

    boolean playNext();

    boolean pause();

    boolean isPlaying();

    int getProgress();

    Song getPlayingSong();

    boolean seekTo(int progress);

    void setPlayMode(PlayMode playMode);

    void registerCallback(Callback callback);

    void unregisterCallback(Callback callback);

    void removeCallbacks();

    void releasePlayer();

    interface Callback {

        void onSwitchLast(@Nullable Song last);

        void onSwitchNext(@Nullable Song next);

        void onComplete(@Nullable Song next);

        void onPlayStatusChanged(boolean isPlaying);
    }
}
