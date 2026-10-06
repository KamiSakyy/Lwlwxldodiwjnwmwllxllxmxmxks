package com.github.rudroid.utilities;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.Window;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static float a = 9.80665f;
    public static float b = 9.80665f;
    public static long c = System.currentTimeMillis();

    public static boolean a(Context context) {
        return new n4.b0(context).b.areNotificationsEnabled();
    }

    public static void b(Context context, String str) {
        k71.k.g(str, "text");
        Object systemService = context.getSystemService("clipboard");
        k71.k.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("clip_data_label", str));
    }

    public static void c(Window window) {
        y51.c cVar = new y51.c(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new a5.t2(window, cVar) : i >= 30 ? new a5.r2(window, cVar) : new a5.q2(window, cVar)).W(false);
    }

    public static void d(Window window) {
        y51.c cVar = new y51.c(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new a5.t2(window, cVar) : i >= 30 ? new a5.r2(window, cVar) : new a5.q2(window, cVar)).W(true);
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
    public Object b(int, Object, int) { return null; }
    public Object e(int, int) { return null; }
}
