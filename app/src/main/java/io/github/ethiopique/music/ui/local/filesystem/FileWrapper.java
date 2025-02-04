package io.github.ethiopique.music.ui.local.filesystem;

import java.io.File;

/**
 * Created with Android Studio.
 * User: ethiopique@gmail.com
 * Date: 9/4/16
 * Time: 6:10 PM
 * Desc: SystemFile
 */
public class FileWrapper {

    public File file;
    public boolean selected;

    public FileWrapper() {
        // Empty
    }

    public FileWrapper(File file) {
        this.file = file;
    }

    public FileWrapper(File file, boolean selected) {
        this.file = file;
        this.selected = selected;
    }
}
