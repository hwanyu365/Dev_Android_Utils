package com.hwanyu365.utils;

public class Log {
    private static final String TAG = "[Hwanyu365]_";
    private static final int REAL_METHOD_POS = 2;

    private static StringBuilder prefix() {
        StackTraceElement[] ste = new Throwable().getStackTrace();
        StackTraceElement realMethod = ste[REAL_METHOD_POS];
        return new StringBuilder("[")
                .append(realMethod.getMethodName())
                .append("():")
                .append(realMethod.getLineNumber())
                .append("] ");
    }

    public static void i(String tag, String log) {
        android.util.Log.i(TAG + tag, prefix().append(log).toString());
    }

    public static void v(String tag, String log) {
        android.util.Log.v(TAG + tag, prefix().append(log).toString());
    }

    public static void d(String tag, String log) {
        android.util.Log.d(TAG + tag, prefix().append(log).toString());
    }

    public static void w(String tag, String log) {
        android.util.Log.w(TAG + tag, prefix().append(log).toString());
    }

    public static void e(String tag, String log) {
        android.util.Log.e(TAG + tag, prefix().append(log).toString());
    }
}