package fi;

import android.content.Context;
import android.content.SharedPreferences;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static int a(Context context) {
        k.g(context, "context");
        String string = g(context).getString("key_dark_mode", "follow_system");
        if (string == null) {
            return -1;
        }
        int hashCode = string.hashCode();
        return hashCode != 3075958 ? (hashCode == 102970646 && string.equals("light")) ? 1 : -1 : string.equals("dark") ? 2 : -1;
    }

    public static int b(Context context) {
        k.g(context, "context");
        return g(context).getInt("left_swipe_action", 0);
    }

    public static int c(Context context) {
        k.g(context, "context");
        return g(context).getInt("right_swipe_action", 2);
    }

    public static boolean d(Context context) {
        k.g(context, "context");
        return g(context).getBoolean("key_analytics_enabled", true);
    }

    public static void e(Context context, int i) {
        SharedPreferences.Editor edit = g(context).edit();
        edit.putInt("left_swipe_action", i);
        edit.apply();
    }

    public static void f(Context context, int i) {
        SharedPreferences.Editor edit = g(context).edit();
        edit.putInt("right_swipe_action", i);
        edit.apply();
    }

    public static SharedPreferences g(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("settings_preferences", 0);
        k.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
