package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.t5;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o1 implements x1 {
    public static volatile o1 V;
    public n0 A;
    public g21.a B;
    public f3 C;
    public t2 D;
    public z E;
    public x2 F;
    public String G;
    public m0 H;
    public p3 I;
    public r J;
    public k0 K;
    public y2 L;
    public Boolean N;
    public long O;
    public volatile Boolean P;
    public volatile boolean Q;
    public int R;
    public int S;
    public long U;
    public Context r;
    public boolean s;
    public w80.w3 t;
    public h u;
    public c1 v;
    public s0 w;
    public m1 x;
    public y3 y;
    public t4 z;
    public boolean M = false;
    public final AtomicInteger T = new AtomicInteger(0);

    public o1(e2 e2Var) {
        j41.d dVar;
        Context context;
        Context context2 = e2Var.a;
        w80.w3 w3Var = new w80.w3(2);
        this.t = w3Var;
        c2.k = w3Var;
        this.r = context2;
        this.s = e2Var.e;
        this.P = e2Var.b;
        this.G = e2Var.g;
        this.Q = true;
        if (com.google.android.gms.internal.measurement.m4.h == null && context2 != null) {
            Object obj = com.google.android.gms.internal.measurement.m4.g;
            synchronized (obj) {
                try {
                    if (com.google.android.gms.internal.measurement.m4.h == null) {
                        synchronized (obj) {
                            com.google.android.gms.internal.measurement.c4 c4Var = com.google.android.gms.internal.measurement.m4.h;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (c4Var != null) {
                                if (c4Var.a != applicationContext) {
                                }
                            }
                            if (c4Var != null) {
                                com.google.android.gms.internal.measurement.e4.c();
                                com.google.android.gms.internal.measurement.p4.a();
                                synchronized (com.google.android.gms.internal.measurement.h4.class) {
                                    try {
                                        com.google.android.gms.internal.measurement.h4 h4Var = com.google.android.gms.internal.measurement.h4.d;
                                        if (h4Var != null && (context = (Context) h4Var.b) != null && ((com.google.android.gms.internal.measurement.g4) h4Var.c) != null && h4Var.a) {
                                            context.getContentResolver().unregisterContentObserver((com.google.android.gms.internal.measurement.g4) com.google.android.gms.internal.measurement.h4.d.c);
                                        }
                                        com.google.android.gms.internal.measurement.h4.d = null;
                                    } finally {
                                    }
                                }
                            }
                            t5 t5Var = new t5(applicationContext);
                            if (t5Var instanceof Serializable) {
                                dVar = new j41.e(t5Var);
                            } else {
                                j41.f fVar = new j41.f();
                                fVar.r = t5Var;
                                dVar = fVar;
                            }
                            com.google.android.gms.internal.measurement.m4.h = new com.google.android.gms.internal.measurement.c4(applicationContext, dVar);
                            com.google.android.gms.internal.measurement.m4.i.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.B = g21.a.a;
        Long l = e2Var.f;
        this.U = l != null ? l.longValue() : System.currentTimeMillis();
        h hVar = new h(this);
        hVar.v = y60.b.s;
        this.u = hVar;
        c1 c1Var = new c1(this);
        c1Var.C();
        this.v = c1Var;
        s0 s0Var = new s0(this);
        s0Var.C();
        this.w = s0Var;
        t4 t4Var = new t4(this);
        t4Var.C();
        this.z = t4Var;
        this.A = new n0(new e1(e2Var, this));
        this.E = new z(this);
        f3 f3Var = new f3(this);
        f3Var.B();
        this.C = f3Var;
        t2 t2Var = new t2(this);
        t2Var.B();
        this.D = t2Var;
        y3 y3Var = new y3(this);
        y3Var.B();
        this.y = y3Var;
        x2 x2Var = new x2(this);
        x2Var.C();
        this.F = x2Var;
        m1 m1Var = new m1(this);
        m1Var.C();
        this.x = m1Var;
        com.google.android.gms.internal.measurement.u0 u0Var = e2Var.d;
        boolean z = u0Var == null || u0Var.s == 0;
        if (context2.getApplicationContext() instanceof Application) {
            l(t2Var);
            if (((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).r.getApplicationContext() instanceof Application) {
                Application application = (Application) ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).r.getApplicationContext();
                if (t2Var.u == null) {
                    t2Var.u = new p2(t2Var);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(t2Var.u);
                    application.registerActivityLifecycleCallbacks(t2Var.u);
                    s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).w;
                    m(s0Var2);
                    s0Var2.F.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(s0Var);
            s0Var.A.a("Application context is not an Application");
        }
        m1Var.I(new com.google.common.util.concurrent.b(this, e2Var, false, 6));
    }

    public static final void j(a0 a0Var) {
        if (a0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(androidx.compose.foundation.lazy.layout.s0 s0Var) {
        if (s0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void l(e0 e0Var) {
        if (e0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!e0Var.t) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(e0Var.getClass())));
        }
    }

    public static final void m(w1 w1Var) {
        if (w1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!w1Var.t) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(w1Var.getClass())));
        }
    }

    public static o1 s(Context context, com.google.android.gms.internal.measurement.u0 u0Var, Long l) {
        Bundle bundle;
        if (u0Var != null) {
            Bundle bundle2 = u0Var.u;
            u0Var = new com.google.android.gms.internal.measurement.u0(u0Var.r, u0Var.s, u0Var.t, bundle2, null);
        }
        c21.u.g(context);
        c21.u.g(context.getApplicationContext());
        if (V == null) {
            synchronized (o1.class) {
                try {
                    if (V == null) {
                        V = new o1(new e2(context, u0Var, l));
                    }
                } finally {
                }
            }
        } else if (u0Var != null && (bundle = u0Var.u) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            c21.u.g(V);
            V.P = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        c21.u.g(V);
        return V;
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final s0 a() {
        s0 s0Var = this.w;
        m(s0Var);
        return s0Var;
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final m1 b() {
        m1 m1Var = this.x;
        m(m1Var);
        return m1Var;
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final w80.w3 c() {
        return this.t;
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final Context d() {
        return this.r;
    }

    public final boolean e() {
        return g() == 0;
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final g21.a f() {
        return this.B;
    }

    public final int g() {
        m1 m1Var = this.x;
        m(m1Var);
        m1Var.z();
        h hVar = this.u;
        if (hVar.M()) {
            return 1;
        }
        m(m1Var);
        m1Var.z();
        if (!this.Q) {
            return 8;
        }
        c1 c1Var = this.v;
        k(c1Var);
        c1Var.z();
        Boolean valueOf = c1Var.D().contains("measurement_enabled") ? Boolean.valueOf(c1Var.D().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        w80.w3 w3Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) hVar).s).t;
        Boolean L = hVar.L("firebase_analytics_collection_enabled");
        return L != null ? L.booleanValue() ? 0 : 4 : (this.P == null || this.P.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.O) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        if (!this.M) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        m1 m1Var = this.x;
        m(m1Var);
        m1Var.z();
        Boolean bool = this.N;
        g21.a aVar = this.B;
        if (bool != null && this.O != 0) {
            if (!bool.booleanValue()) {
                aVar.getClass();
            }
            return this.N.booleanValue();
        }
        aVar.getClass();
        this.O = SystemClock.elapsedRealtime();
        t4 t4Var = this.z;
        k(t4Var);
        boolean z = false;
        if (t4Var.X("android.permission.INTERNET") && t4Var.X("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.r;
            if (i21.b.a(context).h() || this.u.C() || (t4.q0(context) && t4.S(context))) {
                z = true;
            }
        }
        this.N = Boolean.valueOf(z);
        if (z) {
            this.N = Boolean.valueOf(t4Var.D(r().G()));
        }
        return this.N.booleanValue();
    }

    public final void i(int i, Throwable th, byte[] bArr) {
        s0 s0Var;
        s0 s0Var2;
        int i2 = i;
        s0 s0Var3 = this.w;
        if (i2 != 200 && i2 != 204) {
            if (i2 == 304) {
                i2 = 304;
            }
            m(s0Var3);
            s0Var3.A.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
        }
        if (th == null) {
            c1 c1Var = this.v;
            k(c1Var);
            c1Var.L.c(true);
            if (bArr == null || bArr.length == 0) {
                m(s0Var3);
                s0Var3.E.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    m(s0Var3);
                    s0Var3.E.a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                t4 t4Var = this.z;
                k(t4Var);
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s;
                if (TextUtils.isEmpty(optString)) {
                    s0Var2 = s0Var3;
                } else {
                    Context context = o1Var.r;
                    s0Var2 = s0Var3;
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle.putString("gad_source", optString4);
                            }
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            this.D.G("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = o1Var.r;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e) {
                                s0 s0Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s).w;
                                m(s0Var4);
                                s0Var4.x.b(e, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        s0Var = s0Var2;
                        m(s0Var);
                        s0Var.x.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                m(s0Var2);
                s0Var = s0Var2;
                try {
                    s0Var.A.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    m(s0Var);
                    s0Var.x.b(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e4) {
                e = e4;
                s0Var = s0Var3;
            }
        }
        m(s0Var3);
        s0Var3.A.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    public final n0 n() {
        return this.A;
    }

    public final m0 o() {
        l(this.H);
        return this.H;
    }

    public final p3 p() {
        l(this.I);
        return this.I;
    }

    public final r q() {
        m(this.J);
        return this.J;
    }

    public final k0 r() {
        l(this.K);
        return this.K;
    }

    public o1(Object... a) {
    }
    public Object n(Object p1, Object p2) { return null; }
    public Object o(Object p1) { return null; }
    public Object n(Object, Object) { return null; }
    public Object n(Object, Object) { return null; }
    public Object o(Object) { return null; }
    public Object o(Object) { return null; }
}
