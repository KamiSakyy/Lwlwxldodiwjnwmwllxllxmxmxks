package com.github.rudroid.widget.shortcuts;

import android.content.Context;
import android.net.NetworkRequest;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutWidgetWorker extends CoroutineWorker {
    public static final a Companion = new a();
    public static final v8.f g;

    public static final class a {
        public static void a(Context context) {
            k71.k.g(context, "context");
            w8.q Z = w8.q.Z(context);
            k71.k.f(Z, "getInstance(...)");
            Z.s("ShortcutWidgetWorker", v8.n.s, new v8.z(ShortcutWidgetWorker.class).e(ShortcutWidgetWorker.g).d(v8.a.r, 10000L, TimeUnit.MILLISECONDS).a());
        }
    }

    static {
        v8.y yVar = v8.y.r;
        g = new v8.f(new e9.i((NetworkRequest) null), v8.y.s, false, false, false, false, -1L, -1L, x61.m.K0(new LinkedHashSet()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutWidgetWorker(Context context, WorkerParameters workerParameters, g gVar) {
        super(context, workerParameters);
        k71.k.g(context, "context");
        k71.k.g(workerParameters, "workerParameters");
        k71.k.g(gVar, "preferences");
    }

    public final Object c(a71.c cVar) {
        return v8.v.a();
    }
}
