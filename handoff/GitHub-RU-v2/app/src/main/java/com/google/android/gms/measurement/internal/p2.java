package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int r;
    public Object s;

    public p2(t2 t2Var) {
        this.r = 0;
        this.s = t2Var;
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:12:0x0049, B:15:0x0050, B:17:0x0063, B:19:0x006b, B:24:0x007b, B:28:0x0088, B:36:0x002e, B:38:0x0035, B:40:0x0041), top: B:2:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(com.google.android.gms.internal.measurement.w0 w0Var, Bundle bundle) {
        o1 o1Var;
        o1 o1Var2;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        t2 t2Var = (t2) this.s;
        try {
            try {
                o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                s0 s0Var = o1Var2.w;
                o1.m(s0Var);
                s0Var.F.a("onActivityCreated");
                intent = w0Var.t;
            } catch (RuntimeException e) {
                s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).w;
                o1.m(s0Var2);
                s0Var2.x.b(e, "Throwable caught in onActivityCreated");
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        o1.k(o1Var2.z);
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "auto";
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            boolean z = bundle != null;
                            m1 m1Var = o1Var2.x;
                            o1.m(m1Var);
                            m1Var.I(new j2(this, z, uri, str2, queryParameter));
                            o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                            f3 f3Var = o1Var.C;
                            o1.l(f3Var);
                            f3Var.H(w0Var, bundle);
                        }
                        str = "gs";
                        String str22 = str;
                        String queryParameter2 = uri.getQueryParameter("referrer");
                        boolean z2 = bundle != null;
                        m1 m1Var2 = o1Var2.x;
                        o1.m(m1Var2);
                        m1Var2.I(new j2(this, z2, uri, str22, queryParameter2));
                        o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                        f3 f3Var2 = o1Var.C;
                        o1.l(f3Var2);
                        f3Var2.H(w0Var, bundle);
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                        if (uri != null) {
                            o1.k(o1Var2.z);
                            stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                                str = "auto";
                                String str222 = str;
                                String queryParameter22 = uri.getQueryParameter("referrer");
                                boolean z22 = bundle != null;
                                m1 m1Var22 = o1Var2.x;
                                o1.m(m1Var22);
                                m1Var22.I(new j2(this, z22, uri, str222, queryParameter22));
                                o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                                f3 f3Var22 = o1Var.C;
                                o1.l(f3Var22);
                                f3Var22.H(w0Var, bundle);
                            }
                            str = "gs";
                            String str2222 = str;
                            String queryParameter222 = uri.getQueryParameter("referrer");
                            boolean z222 = bundle != null;
                            m1 m1Var222 = o1Var2.x;
                            o1.m(m1Var222);
                            m1Var222.I(new j2(this, z222, uri, str2222, queryParameter222));
                            o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                            f3 f3Var222 = o1Var.C;
                            o1.l(f3Var222);
                            f3Var222.H(w0Var, bundle);
                        }
                    }
                }
                uri = null;
                if (uri != null) {
                }
            }
            o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
            f3 f3Var2222 = o1Var.C;
            o1.l(f3Var2222);
            f3Var2222.H(w0Var, bundle);
        } catch (Throwable th) {
            f3 f3Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).C;
            o1.l(f3Var3);
            f3Var3.H(w0Var, bundle);
            throw th;
        }
    }

    public void j(com.google.android.gms.internal.measurement.w0 w0Var) {
        f3 f3Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((t2) this.s)).s).C;
        o1.l(f3Var);
        synchronized (f3Var.D) {
            try {
                if (Objects.equals(f3Var.y, w0Var)) {
                    f3Var.y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).u.N()) {
            f3Var.x.remove(Integer.valueOf(w0Var.r));
        }
    }

    public void k(com.google.android.gms.internal.measurement.w0 w0Var) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) ((t2) this.s)).s;
        f3 f3Var = o1Var.C;
        o1.l(f3Var);
        synchronized (f3Var.D) {
            f3Var.C = false;
            f3Var.z = true;
        }
        o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s;
        o1Var2.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (o1Var2.u.N()) {
            b3 E = f3Var.E(w0Var);
            f3Var.v = f3Var.u;
            f3Var.u = null;
            m1 m1Var = o1Var2.x;
            o1.m(m1Var);
            m1Var.I(new e3(f3Var, E, elapsedRealtime));
        } else {
            f3Var.u = null;
            m1 m1Var2 = o1Var2.x;
            o1.m(m1Var2);
            m1Var2.I(new y(f3Var, elapsedRealtime));
        }
        y3 y3Var = o1Var.y;
        o1.l(y3Var);
        o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var).s;
        o1Var3.B.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        m1 m1Var3 = o1Var3.x;
        o1.m(m1Var3);
        m1Var3.I(new u3(y3Var, elapsedRealtime2, 1));
    }

    public void l(com.google.android.gms.internal.measurement.w0 w0Var) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) ((t2) this.s)).s;
        y3 y3Var = o1Var.y;
        o1.l(y3Var);
        o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var).s;
        o1Var2.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m1 m1Var = o1Var2.x;
        o1.m(m1Var);
        m1Var.I(new u3(y3Var, elapsedRealtime, 0));
        f3 f3Var = o1Var.C;
        o1.l(f3Var);
        Object obj = f3Var.D;
        synchronized (obj) {
            f3Var.C = true;
            if (!Objects.equals(w0Var, f3Var.y)) {
                synchronized (obj) {
                    f3Var.y = w0Var;
                    f3Var.z = false;
                    o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s;
                    if (o1Var3.u.N()) {
                        f3Var.A = null;
                        m1 m1Var2 = o1Var3.x;
                        o1.m(m1Var2);
                        m1Var2.I(new d3(f3Var, 1));
                    }
                }
            }
        }
        o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s;
        if (!o1Var4.u.N()) {
            f3Var.u = f3Var.A;
            m1 m1Var3 = o1Var4.x;
            o1.m(m1Var3);
            m1Var3.I(new d3(f3Var, 0));
            return;
        }
        f3Var.I(w0Var.s, f3Var.E(w0Var), false);
        z zVar = ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).E;
        o1.j(zVar);
        o1 o1Var5 = (o1) ((androidx.compose.foundation.lazy.layout.s0) zVar).s;
        o1Var5.B.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        m1 m1Var4 = o1Var5.x;
        o1.m(m1Var4);
        m1Var4.I(new y(zVar, elapsedRealtime2));
    }

    public void m(com.google.android.gms.internal.measurement.w0 w0Var, Bundle bundle) {
        b3 b3Var;
        f3 f3Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((t2) this.s)).s).C;
        o1.l(f3Var);
        if (!((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).u.N() || bundle == null || (b3Var = (b3) f3Var.x.get(Integer.valueOf(w0Var.r))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", b3Var.c);
        bundle2.putString("name", b3Var.a);
        bundle2.putString("referrer_name", b3Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.r) {
            case 0:
                i(com.google.android.gms.internal.measurement.w0.j(activity), bundle);
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.s;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (arrayDeque.contains(string)) {
                                    break;
                                } else {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                m41.a aVar = (m41.a) k41.g.c().b(m41.a.class);
                                Log.isLoggable("FirebaseMessaging", 3);
                                if (aVar != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    m41.b bVar = (m41.b) aVar;
                                    if (!n41.a.c.contains("fcm")) {
                                        com.google.android.gms.internal.measurement.k1 k1Var = (com.google.android.gms.internal.measurement.k1) bVar.a.s;
                                        k1Var.a(new com.google.android.gms.internal.measurement.x0(k1Var, string2, 0));
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString("medium", "notification");
                                    bundle3.putString("campaign", string2);
                                    bVar.a("fcm", "_cmp", bundle3);
                                }
                            } else {
                                Log.isLoggable("FirebaseMessaging", 3);
                            }
                        }
                        sy.s.l("_no", bundle2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.r) {
            case 0:
                j(com.google.android.gms.internal.measurement.w0.j(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.r) {
            case 0:
                k(com.google.android.gms.internal.measurement.w0.j(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.r) {
            case 0:
                l(com.google.android.gms.internal.measurement.w0.j(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.r) {
            case 0:
                m(com.google.android.gms.internal.measurement.w0.j(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.r;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.r;
    }

    public p2() {
        this.r = 1;
        this.s = new ArrayDeque(10);
    }

    public Object s;
}
