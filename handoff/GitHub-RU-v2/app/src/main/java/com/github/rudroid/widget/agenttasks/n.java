package com.github.rudroid.widget.agenttasks;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import b6.x0;
import com.github.rudroid.widget.agenttasks.AgentTasksWidgetWorker;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends x0 {
    public final m71.a e() {
        return new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDisabled(Context context) {
        k71.k.g(context, "context");
        super/*android.appwidget.AppWidgetProvider*/.onDisabled(context);
        AgentTasksWidgetWorker.Companion.getClass();
        w8.q Z = w8.q.Z(context);
        k71.k.f(Z, "getInstance(...)");
        Z.X("AgentTasksWidgetWorker");
        v71.b0.E(new m(context, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onEnabled(Context context) {
        k71.k.g(context, "context");
        super/*android.appwidget.AppWidgetProvider*/.onEnabled(context);
        AgentTasksWidgetWorker.Companion.getClass();
        AgentTasksWidgetWorker.a.a(context);
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        k71.k.g(context, "context");
        k71.k.g(appWidgetManager, "appWidgetManager");
        k71.k.g(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        AgentTasksWidgetWorker.Companion.getClass();
        AgentTasksWidgetWorker.a.a(context);
    }
}
