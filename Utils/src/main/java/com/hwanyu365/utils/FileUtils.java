package com.hwanyu365.utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    private static final String TAG = "FileUtil";

    public static boolean createNewFile(File file) {
        if (file == null) {
            return false;
        } else if (file.isFile() && !delete(file)) {
            return false;
        }

        try {
            File parent = file.getParentFile();
            if ((parent != null) && !parent.isDirectory() && !parent.mkdirs()) {
                Log.w(TAG, "Failed to create dirs " + parent);
            } else {
                return file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean delete(File file) {
        if ((file == null) || !file.exists()) {
            return true;
        }

        if (file.isDirectory()) {
            File[] contents = file.listFiles();
            if (contents != null) {
                for (File content : contents) {
                    delete(content);
                }
            }
        }

        boolean result = file.delete();
        if (!result) {
            Log.d(TAG, "Failed to delete the " + file);
        }
        return result;
    }
}
