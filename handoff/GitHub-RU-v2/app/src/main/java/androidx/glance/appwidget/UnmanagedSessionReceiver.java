package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b6.v;
import java.util.LinkedHashMap;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public class UnmanagedSessionReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2682a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f2683b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !k.b(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            throw new IllegalStateException("Intent is missing ActionKey extra");
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("Intent is missing AppWidgetId extra");
        }
        v.b(intExtra);
    }
}
