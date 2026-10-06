package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.compose.foundation.lazy.layout.q1;
import androidx.compose.foundation.lazy.layout.t1;
import androidx.lifecycle.b;
import androidx.lifecycle.l1;
import b6.a2;
import c21.uShadow;
import com.google.android.gms.measurement.internal.e3;
import com.google.android.gms.measurement.internal.p2;
import com.google.firebase.messaging.FirebaseMessaging;
import h21.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k41.g;
import m51.c;
import n51.h;
import p41.e;
import q51.d;
import t.q;
import w21.o;
import w51.j;
import w51.m;
import w51.s;
import w51.w;
import y11.k;
import y11.l;

/* loaded from: /home/user/work/p/classes4.dex */
public class FirebaseMessaging {
    public static h k;
    public static ScheduledThreadPoolExecutor m;
    public g a;
    public Context b;
    public b c;
    public j d;
    public t1 e;
    public ScheduledThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public j4.h h;
    public boolean i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static p51.b l = new e(6);

    public FirebaseMessaging(g gVar, p51.b bVar, p51.b bVar2, d dVar, p51.b bVar3, c cVar) {
        gVar.a();
        Context context = gVar.a;
        final j4.h hVar = new j4.h();
        final int i = 0;
        hVar.b = 0;
        hVar.c = context;
        final b bVar4 = new b(gVar, hVar, bVar, bVar2, dVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-File-Io"));
        this.i = false;
        l = bVar3;
        this.a = gVar;
        t1 t1Var = new t1();
        t1Var.d = this;
        t1Var.b = cVar;
        this.e = t1Var;
        gVar.a();
        final Context context2 = gVar.a;
        this.b = context2;
        p2 p2Var = new p2();
        this.h = hVar;
        this.c = bVar4;
        this.d = new j(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(p2Var);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: w51.l
            public final /* synthetic */ FirebaseMessaging s;

            {
                this.s = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w21.o j2;
                int i3;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.s;
                        if (firebaseMessaging.e.h() && firebaseMessaging.k(firebaseMessaging.g())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.j(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.s;
                        final Context context3 = firebaseMessaging2.b;
                        a2.f(context3);
                        androidx.lifecycle.b bVar5 = firebaseMessaging2.c;
                        final boolean i4 = firebaseMessaging2.i();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences k2 = sy.tShadow.k(context3);
                            if (!k2.contains("proxy_retention") || k2.getBoolean("proxy_retention", false) != i4) {
                                y11.b bVar6 = (y11.b) bVar5.d;
                                if (bVar6.c.n() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", i4);
                                    y11.l n = y11.l.n(bVar6.b);
                                    synchronized (n) {
                                        i3 = n.a;
                                        n.a = i3 + 1;
                                    }
                                    j2 = n.o(new y11.k(i3, 4, bundle, 0));
                                } else {
                                    j2 = t.q.j(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                j2.d(new i7.c(0), new w21.e() { // from class: w51.p
                                    @Override // w21.e
                                    public final void e(Object obj) {
                                        SharedPreferences.Editor edit = sy.tShadow.k(context3).edit();
                                        edit.putBoolean("proxy_retention", i4);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.i()) {
                            firebaseMessaging2.h();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
        int i3 = w.j;
        q.f(scheduledThreadPoolExecutor2, new Callable() { // from class: w51.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                uShadow uVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                j4.h hVar2 = hVar;
                androidx.lifecycle.b bVar5 = bVar4;
                synchronized (uShadow.class) {
                    try {
                        WeakReference weakReference = uShadow.b;
                        uVar = weakReference != null ? (uShadow) weakReference.get() : null;
                        if (uVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            uShadow uVar2 = new uShadow();
                            synchronized (uVar2) {
                                uVar2.a = l1.m(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            uShadow.b = new WeakReference(uVar2);
                            uVar = uVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new w(firebaseMessaging, hVar2, uVar, bVar5, context3, scheduledThreadPoolExecutor3);
            }
        }).d(scheduledThreadPoolExecutor, new m(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: w51.l
            public final /* synthetic */ FirebaseMessaging s;

            {
                this.s = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w21.o j2;
                int i32;
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.s;
                        if (firebaseMessaging.e.h() && firebaseMessaging.k(firebaseMessaging.g())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.j(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.s;
                        final Context context3 = firebaseMessaging2.b;
                        a2.f(context3);
                        androidx.lifecycle.b bVar5 = firebaseMessaging2.c;
                        final boolean i4 = firebaseMessaging2.i();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences k2 = sy.tShadow.k(context3);
                            if (!k2.contains("proxy_retention") || k2.getBoolean("proxy_retention", false) != i4) {
                                y11.b bVar6 = (y11.b) bVar5.d;
                                if (bVar6.c.n() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", i4);
                                    y11.l n = y11.l.n(bVar6.b);
                                    synchronized (n) {
                                        i32 = n.a;
                                        n.a = i32 + 1;
                                    }
                                    j2 = n.o(new y11.k(i32, 4, bundle, 0));
                                } else {
                                    j2 = t.q.j(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                j2.d(new i7.c(0), new w21.e() { // from class: w51.p
                                    @Override // w21.e
                                    public final void e(Object obj) {
                                        SharedPreferences.Editor edit = sy.tShadow.k(context3).edit();
                                        edit.putBoolean("proxy_retention", i4);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.i()) {
                            firebaseMessaging2.h();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new a("TAG"));
                }
                m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(g.c());
        }
        return firebaseMessaging;
    }

    public static synchronized h d(Context context) {
        h hVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (k == null) {
                    k = new h(context);
                }
                hVar = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            uShadow.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        o oVar;
        s g = g();
        if (!k(g)) {
            return g.a;
        }
        String c = j4.h.c(this.a);
        j jVar = this.d;
        synchronized (jVar) {
            oVar = (o) ((x.e) jVar.b).get(c);
            if (oVar != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                b bVar = this.c;
                oVar = bVar.m(bVar.B(j4.h.c((g) bVar.b), "*", new Bundle())).k(this.g, new r11.b(this, c, g, 7)).f((Executor) jVar.a, new q1(15, jVar, c));
                ((x.e) jVar.b).put(c, oVar);
            }
        }
        try {
            return (String) q.c(oVar);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final String e() {
        g gVar = this.a;
        gVar.a();
        return "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
    }

    public final o f() {
        final w21.g gVar = new w21.g();
        final int i = 1;
        this.f.execute(new Runnable(this) { // from class: w51.k
            public final /* synthetic */ FirebaseMessaging s;

            {
                this.s = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.s;
                        w21.g gVar2 = gVar;
                        n51.h hVar = FirebaseMessaging.k;
                        try {
                            androidx.lifecycle.b bVar = firebaseMessaging.c;
                            bVar.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("delete", "1");
                            t.q.c(bVar.m(bVar.B(j4.h.c((k41.g) bVar.b), "*", bundle)));
                            n51.h d = FirebaseMessaging.d(firebaseMessaging.b);
                            String e = firebaseMessaging.e();
                            String c = j4.h.c(firebaseMessaging.a);
                            synchronized (d) {
                                String b = n51.h.b(e, c);
                                SharedPreferences.Editor edit = d.a.edit();
                                edit.remove(b);
                                edit.commit();
                            }
                            gVar2.a(null);
                            return;
                        } catch (Exception e2) {
                            gVar2.a.l(e2);
                            return;
                        }
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.s;
                        w21.g gVar3 = gVar;
                        n51.h hVar2 = FirebaseMessaging.k;
                        try {
                            gVar3.a(firebaseMessaging2.a());
                            return;
                        } catch (Exception e3) {
                            gVar3.a.l(e3);
                            return;
                        }
                }
            }
        });
        return gVar.a;
    }

    public final s g() {
        s a;
        h d = d(this.b);
        String e = e();
        String c = j4.h.c(this.a);
        synchronized (d) {
            a = s.a(d.a.getString(h.b(e, c), null));
        }
        return a;
    }

    public final void h() {
        o j2;
        int i;
        y11.b bVar = (y11.b) this.c.d;
        if (bVar.c.n() >= 241100000) {
            l n = l.n(bVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (n) {
                i = n.a;
                n.a = i + 1;
            }
            j2 = n.o(new k(i, 5, bundle, 1)).e(y11.h.t, y11.d.t);
        } else {
            j2 = q.j(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        j2.d(this.f, new m(this, 1));
    }

    public final boolean i() {
        Context context = this.b;
        a2.f(context);
        if (!a2.h(context)) {
            return false;
        }
        if (this.a.b(m41.a.class) != null) {
            return true;
        }
        return sy.s.h() && l != null;
    }

    public final synchronized void j(long j2) {
        b(new e3(this, Math.min(Math.max(30L, 2 * j2), j)), j2);
        this.i = true;
    }

    public final boolean k(s sVar) {
        if (sVar != null) {
            return System.currentTimeMillis() > sVar.c + s.d || !this.h.b().equals(sVar.b);
        }
        return true;
    }


}
