package com.github.rudroid.widget.shortcuts;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import b6.x0;
import com.github.rudroid.widget.shortcuts.ShortcutWidgetWorker;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t extends x0 {
    public final m71.a e() {
        return new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDisabled(Context context) {
        k71.k.g(context, "context");
        super/*android.appwidget.AppWidgetProvider*/.onDisabled(context);
        ShortcutWidgetWorker.Companion.getClass();
        w8.q Z = w8.q.Z(context);
        k71.k.f(Z, "getInstance(...)");
        Z.X("ShortcutWidgetWorker");
        v71.b0.E(new s(context, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onEnabled(Context context) {
        k71.k.g(context, "context");
        super/*android.appwidget.AppWidgetProvider*/.onEnabled(context);
        ShortcutWidgetWorker.Companion.getClass();
        ShortcutWidgetWorker.a.a(context);
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        k71.k.g(context, "context");
        k71.k.g(appWidgetManager, "appWidgetManager");
        k71.k.g(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        ShortcutWidgetWorker.Companion.getClass();
        ShortcutWidgetWorker.a.a(context);
    }
    public static Object I(Object p1, Object p2, Object p3) { return null; }
    public static Object L(Object p1) { return null; }
    public static Object n(Object p1, Object p2) { return null; }
    public static Object w(Object p1, Object p2, Object p3) { return null; }
}
