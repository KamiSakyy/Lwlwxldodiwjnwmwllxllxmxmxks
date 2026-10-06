package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 {
    public static volatile k1 g;
    public final ExecutorService a;
    public final s21.a b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile l0 f;

    public k1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        int i = 0;
        this.b = new s21.a(i, this);
        this.c = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.c2.b(context, com.google.android.gms.measurement.internal.c2.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, k1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new z0(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new j1(this));
    }

    public static k1 c(Context context, Bundle bundle) {
        c21.u.g(context);
        if (g == null) {
            synchronized (k1.class) {
                try {
                    if (g == null) {
                        g = new k1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final void a(g1 g1Var) {
        this.a.execute(g1Var);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (!z && z2) {
            a(new x0(this, exc));
        }
    }
}
