package fi;

import android.content.Context;
import android.content.SharedPreferences;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static void a(Context context) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.remove("notifications_banner_last_shown");
        edit.remove("app_launch_countdown_between_banners");
        edit.apply();
    }

    public static SharedPreferences b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("system_preferences", 0);
        k.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
