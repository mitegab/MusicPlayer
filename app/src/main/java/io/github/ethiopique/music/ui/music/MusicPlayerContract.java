package io.github.ethiopique.music.ui.music;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import io.github.ethiopique.music.data.model.Song;
import io.github.ethiopique.music.player.PlayMode;
import io.github.ethiopique.music.player.PlaybackService;
import io.github.ethiopique.music.ui.base.BasePresenter;
import io.github.ethiopique.music.ui.base.BaseView;

/**
 * Created with Android Studio.
 * User: ethiopique@gmail.com
 * Date: 9/12/16
 * Time: 8:27 AM
 * Desc: MusicPlayerContract
 */
/* package */ interface MusicPlayerContract {

    interface View extends BaseView<Presenter> {

        void handleError(Throwable error);

        void onPlaybackServiceBound(PlaybackService service);

        void onPlaybackServiceUnbound();

        void onSongSetAsFavorite(@NonNull Song song);

        void onSongUpdated(@Nullable Song song);

        void updatePlayMode(PlayMode playMode);

        void updatePlayToggle(boolean play);

        void updateFavoriteToggle(boolean favorite);
    }

    interface Presenter extends BasePresenter {

        void retrieveLastPlayMode();

        void setSongAsFavorite(Song song, boolean favorite);

        void bindPlaybackService();

        void unbindPlaybackService();
    }
}
