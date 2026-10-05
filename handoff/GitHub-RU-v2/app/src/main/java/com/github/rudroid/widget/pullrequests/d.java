package com.github.rudroid.widget.pullrequests;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import b6.x0;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetWorker;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends x0 {
    public final m71.a e() {
        return new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDisabled(Context context) {
        k71.k.g(context, "context");
        super/*android.appwidget.AppWidgetProvider*/.onDisabled(context);
        PullRequestsWidgetWorker.Companion.getClass();
        w8.q Z = w8.q.Z(context);
        k71.k.f(Z, "getInstance(...)");
        Z.X("PullRequestsWidgetWorker");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onEnabled(Context context) {
        k71.k.g(context, "context");
        super/*android.appwidget.AppWidgetProvider*/.onEnabled(context);
        PullRequestsWidgetWorker.Companion.getClass();
        PullRequestsWidgetWorker.a.a(context);
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        k71.k.g(context, "context");
        k71.k.g(appWidgetManager, "appWidgetManager");
        k71.k.g(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        PullRequestsWidgetWorker.Companion.getClass();
        PullRequestsWidgetWorker.a.a(context);
    }
}
