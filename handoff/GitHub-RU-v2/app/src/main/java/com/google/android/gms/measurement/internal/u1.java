package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int r = 2;
    public final /* synthetic */ String s;
    public final /* synthetic */ v4 t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ u1(v1 v1Var, v4 v4Var, Bundle bundle, h0 h0Var, String str) {
        this.u = v1Var;
        this.t = v4Var;
        this.v = bundle;
        this.w = h0Var;
        this.s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p3 p3Var;
        f0 f0Var;
        t4 t4Var;
        f0 f0Var2;
        switch (this.r) {
            case 0:
                v1 v1Var = (v1) this.u;
                v4 v4Var = this.t;
                Bundle bundle = (Bundle) this.v;
                h0 h0Var = (h0) this.w;
                String str = this.s;
                o4 o4Var = v1Var.f;
                o4Var.B();
                try {
                    h0Var.E(o4Var.d0(bundle, v4Var));
                    return;
                } catch (RemoteException e) {
                    o4Var.a().x.c("Failed to return trigger URIs for app", str, e);
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.u;
                synchronized (atomicReference2) {
                    try {
                        try {
                            p3Var = (p3) this.w;
                            f0Var = p3Var.v;
                        } catch (RemoteException e2) {
                            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((p3) this.w)).s).w;
                            o1.m(s0Var);
                            s0Var.x.d("(legacy) Failed to get conditional properties; remote exception", null, this.s, e2);
                            ((AtomicReference) this.u).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.u;
                        }
                        if (f0Var == null) {
                            s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).w;
                            o1.m(s0Var2);
                            s0Var2.x.d("(legacy) Failed to get conditional properties; not connected to service", null, this.s, (String) this.v);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(f0Var.H(this.s, (String) this.v, this.t));
                        } else {
                            atomicReference2.set(f0Var.o(null, this.s, (String) this.v));
                        }
                        p3Var.M();
                        atomicReference = (AtomicReference) this.u;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.u).notify();
                        throw th;
                    }
                }
            default:
                com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) this.v;
                String str2 = (String) this.u;
                String str3 = this.s;
                p3 p3Var2 = (p3) this.w;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        f0Var2 = p3Var2.v;
                    } catch (Throwable th2) {
                        t4 t4Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).z;
                        o1.k(t4Var2);
                        t4Var2.o0(n0Var, arrayList);
                        throw th2;
                    }
                } catch (RemoteException e3) {
                    s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).w;
                    o1.m(s0Var3);
                    s0Var3.x.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                }
                if (f0Var2 != null) {
                    arrayList = t4.p0(f0Var2.H(str3, str2, this.t));
                    p3Var2.M();
                    t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).z;
                    o1.k(t4Var);
                    t4Var.o0(n0Var, arrayList);
                    return;
                }
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s;
                s0 s0Var4 = o1Var.w;
                o1.m(s0Var4);
                s0Var4.x.c("Failed to get conditional properties; not connected to service", str3, str2);
                t4Var = o1Var.z;
                o1.k(t4Var);
                t4Var.o0(n0Var, arrayList);
                return;
        }
    }

    public u1(p3 p3Var, String str, String str2, v4 v4Var, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.s = str;
        this.u = str2;
        this.t = v4Var;
        this.v = n0Var;
        this.w = p3Var;
    }

    public u1(p3 p3Var, AtomicReference atomicReference, String str, String str2, v4 v4Var) {
        this.u = atomicReference;
        this.s = str;
        this.v = str2;
        this.t = v4Var;
        this.w = p3Var;
    }
}
