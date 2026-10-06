package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

@DynamiteApi
/* loaded from: /home/user/work/p/classes4.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.k0 {
    public o1 f;
    public x.e g;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f = null;
        this.g = new x.e(0);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void beginAdUnitExposure(String str, long j) {
        f();
        z zVar = this.f.E;
        o1.j(zVar);
        zVar.A(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.N(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearMeasurementEnabled(long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.A();
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).x;
        o1.m(m1Var);
        m1Var.I(new com.google.common.util.concurrent.b(t2Var, null, false, 9));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void endAdUnitExposure(String str, long j) {
        f();
        z zVar = this.f.E;
        o1.j(zVar);
        zVar.B(str, j);
    }

    public final void f() {
        if (this.f == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void g(String str, com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        t4 t4Var = this.f.z;
        o1.k(t4Var);
        t4Var.i0(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void generateEventId(com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        t4 t4Var = this.f.z;
        o1.k(t4Var);
        long w0 = t4Var.w0();
        f();
        t4 t4Var2 = this.f.z;
        o1.k(t4Var2);
        t4Var2.j0(n0Var, w0);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getAppInstanceId(com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        m1 m1Var = this.f.x;
        o1.m(m1Var);
        m1Var.I(new n1(this, n0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        g((String) t2Var.y.get(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        m1 m1Var = this.f.x;
        o1.m(m1Var);
        m1Var.I(new a5.q1(this, n0Var, str, str2, 5, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        f3 f3Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).C;
        o1.l(f3Var);
        b3 b3Var = f3Var.u;
        g(b3Var != null ? b3Var.b : null, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        f3 f3Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).C;
        o1.l(f3Var);
        b3 b3Var = f3Var.u;
        g(b3Var != null ? b3Var.a : null, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getGmpAppId(com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        g(t2Var.O(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        c21.u.d(str);
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).getClass();
        f();
        t4 t4Var = this.f.z;
        o1.k(t4Var);
        t4Var.k0(n0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getSessionId(com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).x;
        o1.m(m1Var);
        m1Var.I(new com.google.common.util.concurrent.b(t2Var, n0Var));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getTestFlag(com.google.android.gms.internal.measurement.n0 n0Var, int i) {
        f();
        if (i == 0) {
            t4 t4Var = this.f.z;
            o1.k(t4Var);
            t2 t2Var = this.f.D;
            o1.l(t2Var);
            AtomicReference atomicReference = new AtomicReference();
            m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).x;
            o1.m(m1Var);
            t4Var.i0((String) m1Var.J(atomicReference, 15000L, "String test flag value", new m2(t2Var, atomicReference, 1)), n0Var);
            return;
        }
        if (i == 1) {
            t4 t4Var2 = this.f.z;
            o1.k(t4Var2);
            t2 t2Var2 = this.f.D;
            o1.l(t2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            m1 m1Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var2).s).x;
            o1.m(m1Var2);
            t4Var2.j0(n0Var, ((Long) m1Var2.J(atomicReference2, 15000L, "long test flag value", new m2(t2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            t4 t4Var3 = this.f.z;
            o1.k(t4Var3);
            t2 t2Var3 = this.f.D;
            o1.l(t2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            m1 m1Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var3).s).x;
            o1.m(m1Var3);
            double doubleValue = ((Double) m1Var3.J(atomicReference3, 15000L, "double test flag value", new m2(t2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                n0Var.c(bundle);
                return;
            } catch (RemoteException e) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var3).s).w;
                o1.m(s0Var);
                s0Var.A.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            t4 t4Var4 = this.f.z;
            o1.k(t4Var4);
            t2 t2Var4 = this.f.D;
            o1.l(t2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            m1 m1Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var4).s).x;
            o1.m(m1Var4);
            t4Var4.k0(n0Var, ((Integer) m1Var4.J(atomicReference4, 15000L, "int test flag value", new m2(t2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        t4 t4Var5 = this.f.z;
        o1.k(t4Var5);
        t2 t2Var5 = this.f.D;
        o1.l(t2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        m1 m1Var5 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var5).s).x;
        o1.m(m1Var5);
        t4Var5.m0(n0Var, ((Boolean) m1Var5.J(atomicReference5, 15000L, "boolean test flag value", new m2(t2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        m1 m1Var = this.f.x;
        o1.m(m1Var);
        m1Var.I(new j2(this, n0Var, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initForTests(Map map) {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initialize(j21.a aVar, com.google.android.gms.internal.measurement.u0 u0Var, long j) {
        o1 o1Var = this.f;
        if (o1Var == null) {
            Context context = (Context) j21.b.N(aVar);
            c21.u.g(context);
            this.f = o1.s(context, u0Var, Long.valueOf(j));
        } else {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.A.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.n0 n0Var) {
        f();
        m1 m1Var = this.f.x;
        o1.m(m1Var);
        m1Var.I(new n1(this, n0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.E(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.n0 n0Var, long j) {
        f();
        c21.u.d(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        w wVar = new w(str2, new v(bundle), "app", j);
        m1 m1Var = this.f.x;
        o1.m(m1Var);
        m1Var.I(new a5.q1(this, n0Var, wVar, str, 2, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logHealthData(int i, String str, j21.a aVar, j21.a aVar2, j21.a aVar3) {
        f();
        Object N = aVar == null ? null : j21.b.N(aVar);
        Object N2 = aVar2 == null ? null : j21.b.N(aVar2);
        Object N3 = aVar3 != null ? j21.b.N(aVar3) : null;
        s0 s0Var = this.f.w;
        o1.m(s0Var);
        s0Var.I(i, true, false, str, N, N2, N3);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreated(j21.a aVar, Bundle bundle, long j) {
        f();
        Activity activity = (Activity) j21.b.N(aVar);
        c21.u.g(activity);
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.j(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, Bundle bundle, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        p2 p2Var = t2Var.u;
        if (p2Var != null) {
            t2 t2Var2 = this.f.D;
            o1.l(t2Var2);
            t2Var2.S();
            p2Var.i(w0Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyed(j21.a aVar, long j) {
        f();
        Activity activity = (Activity) j21.b.N(aVar);
        c21.u.g(activity);
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.j(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        p2 p2Var = t2Var.u;
        if (p2Var != null) {
            t2 t2Var2 = this.f.D;
            o1.l(t2Var2);
            t2Var2.S();
            p2Var.j(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPaused(j21.a aVar, long j) {
        f();
        Activity activity = (Activity) j21.b.N(aVar);
        c21.u.g(activity);
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.j(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        p2 p2Var = t2Var.u;
        if (p2Var != null) {
            t2 t2Var2 = this.f.D;
            o1.l(t2Var2);
            t2Var2.S();
            p2Var.k(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumed(j21.a aVar, long j) {
        f();
        Activity activity = (Activity) j21.b.N(aVar);
        c21.u.g(activity);
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.j(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        p2 p2Var = t2Var.u;
        if (p2Var != null) {
            t2 t2Var2 = this.f.D;
            o1.l(t2Var2);
            t2Var2.S();
            p2Var.l(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceState(j21.a aVar, com.google.android.gms.internal.measurement.n0 n0Var, long j) {
        f();
        Activity activity = (Activity) j21.b.N(aVar);
        c21.u.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.w0.j(activity), n0Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, com.google.android.gms.internal.measurement.n0 n0Var, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        p2 p2Var = t2Var.u;
        Bundle bundle = new Bundle();
        if (p2Var != null) {
            t2 t2Var2 = this.f.D;
            o1.l(t2Var2);
            t2Var2.S();
            p2Var.m(w0Var, bundle);
        }
        try {
            n0Var.c(bundle);
        } catch (RemoteException e) {
            s0 s0Var = this.f.w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStarted(j21.a aVar, long j) {
        f();
        Activity activity = (Activity) j21.b.N(aVar);
        c21.u.g(activity);
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.j(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        if (t2Var.u != null) {
            t2 t2Var2 = this.f.D;
            o1.l(t2Var2);
            t2Var2.S();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStopped(j21.a aVar, long j) {
        f();
        Activity activity = (Activity) j21.b.N(aVar);
        c21.u.g(activity);
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.j(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        if (t2Var.u != null) {
            t2 t2Var2 = this.f.D;
            o1.l(t2Var2);
            t2Var2.S();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.n0 n0Var, long j) {
        f();
        n0Var.c(null);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.r0 r0Var) {
        Object obj;
        f();
        x.e eVar = this.g;
        synchronized (eVar) {
            try {
                obj = (d2) eVar.get(Integer.valueOf(r0Var.b()));
                if (obj == null) {
                    obj = new u4(this, r0Var);
                    eVar.put(Integer.valueOf(r0Var.b()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.A();
        if (t2Var.w.add(obj)) {
            return;
        }
        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).w;
        o1.m(s0Var);
        s0Var.A.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void resetAnalyticsData(long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.y.set(null);
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).x;
        o1.m(m1Var);
        m1Var.I(new k2(t2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.p0 p0Var) {
        z2 z2Var;
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.A();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        if (m1Var.F()) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        m1 m1Var2 = o1Var.x;
        o1.m(m1Var2);
        if (Thread.currentThread() == m1Var2.v) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (w80.w3.e()) {
            s0 s0Var3 = o1Var.w;
            o1.m(s0Var3);
            s0Var3.x.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        s0 s0Var4 = o1Var.w;
        o1.m(s0Var4);
        s0Var4.F.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (!z) {
            s0 s0Var5 = o1Var.w;
            o1.m(s0Var5);
            s0Var5.F.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            m1 m1Var3 = o1Var.x;
            o1.m(m1Var3);
            m1Var3.J(atomicReference, 10000L, "[sgtm] Getting upload batches", new m2(t2Var, atomicReference, 6, false));
            h4 h4Var = (h4) atomicReference.get();
            if (h4Var == null) {
                break;
            }
            List list = h4Var.r;
            if (list.isEmpty()) {
                break;
            }
            s0 s0Var6 = o1Var.w;
            o1.m(s0Var6);
            s0Var6.F.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            i += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                f4 f4Var = (f4) it.next();
                try {
                    URL url = new URI(f4Var.t).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    k0 r = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).r();
                    r.A();
                    c21.u.g(r.y);
                    String str = r.y;
                    o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                    s0 s0Var7 = o1Var2.w;
                    o1.m(s0Var7);
                    q0 q0Var = s0Var7.F;
                    Long valueOf = Long.valueOf(f4Var.r);
                    q0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, f4Var.t, Integer.valueOf(f4Var.s.length));
                    if (!TextUtils.isEmpty(f4Var.x)) {
                        s0 s0Var8 = o1Var2.w;
                        o1.m(s0Var8);
                        s0Var8.F.c("[sgtm] Uploading data from app. row_id", valueOf, f4Var.x);
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = f4Var.u;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    x2 x2Var = o1Var2.F;
                    o1.m(x2Var);
                    byte[] bArr = f4Var.s;
                    a5.s sVar = new a5.s(t2Var, atomicReference2, f4Var, 13);
                    x2Var.B();
                    c21.u.g(url);
                    c21.u.g(bArr);
                    m1 m1Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) x2Var).s).x;
                    o1.m(m1Var4);
                    m1Var4.L(new v0(x2Var, str, url, bArr, hashMap, (v2) sVar));
                    try {
                        t4 t4Var = o1Var2.z;
                        o1.k(t4Var);
                        o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s;
                        o1Var3.B.getClass();
                        long currentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j);
                                    o1Var3.B.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        s0 s0Var9 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).w;
                        o1.m(s0Var9);
                        s0Var9.A.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    z2Var = atomicReference2.get() == null ? z2.s : (z2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    s0 s0Var10 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).w;
                    o1.m(s0Var10);
                    s0Var10.x.d("[sgtm] Bad upload url for row_id", f4Var.t, Long.valueOf(f4Var.r), e);
                    z2Var = z2.u;
                }
                if (z2Var != z2.t) {
                    if (z2Var == z2.v) {
                        z = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
        }
        s0 s0Var11 = o1Var.w;
        o1.m(s0Var11);
        s0Var11.F.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i), Integer.valueOf(i2));
        try {
            p0Var.a();
        } catch (RemoteException e2) {
            o1 o1Var4 = this.f;
            c21.u.g(o1Var4);
            s0 s0Var12 = o1Var4.w;
            o1.m(s0Var12);
            s0Var12.A.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConditionalUserProperty(Bundle bundle, long j) {
        f();
        if (bundle == null) {
            s0 s0Var = this.f.w;
            o1.m(s0Var);
            s0Var.x.a("Conditional user property must not be null");
        } else {
            t2 t2Var = this.f.D;
            o1.l(t2Var);
            t2Var.M(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsent(Bundle bundle, long j) {
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsentThirdParty(Bundle bundle, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.T(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setCurrentScreen(j21.a aVar, String str, String str2, long j) {
        f();
        Activity activity = (Activity) j21.b.N(aVar);
        c21.u.g(activity);
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.w0.j(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, String str, String str2, long j) {
        f();
        f3 f3Var = this.f.C;
        o1.l(f3Var);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s;
        if (!o1Var.u.N()) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.C.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        b3 b3Var = f3Var.u;
        if (b3Var == null) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.C.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = f3Var.x;
        Integer valueOf = Integer.valueOf(w0Var.r);
        if (concurrentHashMap.get(valueOf) == null) {
            s0 s0Var3 = o1Var.w;
            o1.m(s0Var3);
            s0Var3.C.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = f3Var.G(w0Var.s);
        }
        String str3 = b3Var.b;
        String str4 = b3Var.a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            s0 s0Var4 = o1Var.w;
            o1.m(s0Var4);
            s0Var4.C.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                o1Var.u.getClass();
            }
            s0 s0Var5 = o1Var.w;
            o1.m(s0Var5);
            s0Var5.C.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                o1Var.u.getClass();
            }
            s0 s0Var6 = o1Var.w;
            o1.m(s0Var6);
            s0Var6.C.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        s0 s0Var7 = o1Var.w;
        o1.m(s0Var7);
        s0Var7.F.c("Setting current screen to name, class", str == null ? "null" : str, str2);
        t4 t4Var = o1Var.z;
        o1.k(t4Var);
        b3 b3Var2 = new b3(t4Var.w0(), str, str2);
        concurrentHashMap.put(valueOf, b3Var2);
        f3Var.I(w0Var.s, b3Var2, true);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDataCollectionEnabled(boolean z) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.A();
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).x;
        o1.m(m1Var);
        m1Var.I(new i2(t2Var, z));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDefaultEventParameters(Bundle bundle) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).x;
        o1.m(m1Var);
        m1Var.I(new n2(t2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.r0 r0Var) {
        f();
        b1.m mVar = new b1.m(this, r0Var, false, 24);
        m1 m1Var = this.f.x;
        o1.m(m1Var);
        if (!m1Var.F()) {
            m1 m1Var2 = this.f.x;
            o1.m(m1Var2);
            m1Var2.I(new com.google.common.util.concurrent.b(this, mVar, false, 11));
            return;
        }
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.z();
        t2Var.A();
        b1.m mVar2 = t2Var.v;
        if (mVar != mVar2) {
            c21.u.i("EventInterceptor already set.", mVar2 == null);
        }
        t2Var.v = mVar;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.t0 t0Var) {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMeasurementEnabled(boolean z, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        Boolean valueOf = Boolean.valueOf(z);
        t2Var.A();
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).x;
        o1.m(m1Var);
        m1Var.I(new com.google.common.util.concurrent.b(t2Var, valueOf, false, 9));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMinimumSessionDuration(long j) {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSessionTimeoutDuration(long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).x;
        o1.m(m1Var);
        m1Var.I(new k2(t2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSgtmDebugInfo(Intent intent) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
        Uri data = intent.getData();
        if (data == null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.D.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.D.a("[sgtm] Preview Mode was not enabled.");
            o1Var.u.u = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        s0 s0Var3 = o1Var.w;
        o1.m(s0Var3);
        s0Var3.D.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        o1Var.u.u = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserId(String str, long j) {
        f();
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
        if (str != null && TextUtils.isEmpty(str)) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.A.a("User ID must be non-empty or null");
        } else {
            m1 m1Var = o1Var.x;
            o1.m(m1Var);
            m1Var.I(new com.google.common.util.concurrent.b(12, t2Var, str));
            t2Var.J(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserProperty(String str, String str2, j21.a aVar, boolean z, long j) {
        f();
        Object N = j21.b.N(aVar);
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.J(str, str2, N, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.r0 r0Var) {
        Object obj;
        f();
        x.e eVar = this.g;
        synchronized (eVar) {
            obj = (d2) eVar.remove(Integer.valueOf(r0Var.b()));
        }
        if (obj == null) {
            obj = new u4(this, r0Var);
        }
        t2 t2Var = this.f.D;
        o1.l(t2Var);
        t2Var.A();
        if (t2Var.w.remove(obj)) {
            return;
        }
        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).w;
        o1.m(s0Var);
        s0Var.A.a("OnEventListener had not been registered");
    }
}
