package com.mailgram.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatDelegate;

import com.mailgram.app.crypto.NativeCrypto;
import com.mailgram.app.store.Prefs;
import com.mailgram.app.sync.Notifier;

/** Точка входа: тема, каналы уведомлений, отслеживание «приложение на экране». */
public class App extends Application {

    private static final String TAG = "MailGram";
    private static volatile boolean foreground;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "MailGram запускается; нативное ядро: " + NativeCrypto.isLoaded()
                + (NativeCrypto.isLoaded() ? " (" + NativeCrypto.version() + ")" : " (" + NativeCrypto.loadError() + ")"));
        Notifier.ensureChannels(this);
        applyTheme(themeMode(Prefs.theme(this)));
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            private int started;

            @Override
            public void onActivityStarted(Activity activity) {
                started++;
                foreground = started > 0;
            }

            @Override
            public void onActivityStopped(Activity activity) {
                started = Math.max(0, started - 1);
                foreground = started > 0;
            }

            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            }

            @Override
            public void onActivityResumed(Activity activity) {
            }

            @Override
            public void onActivityPaused(Activity activity) {
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
            }
        });
    }

    public static boolean isForeground() {
        return foreground;
    }

    public static int themeMode(String theme) {
        switch (theme == null ? "" : theme) {
            case Prefs.THEME_LIGHT:
                return AppCompatDelegate.MODE_NIGHT_NO;
            case Prefs.THEME_DARK:
                return AppCompatDelegate.MODE_NIGHT_YES;
            default:
                return AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
        }
    }

    public static void applyTheme(int mode) {
        if (AppCompatDelegate.getDefaultNightMode() != mode) {
            AppCompatDelegate.setDefaultNightMode(mode);
        }
    }
}
