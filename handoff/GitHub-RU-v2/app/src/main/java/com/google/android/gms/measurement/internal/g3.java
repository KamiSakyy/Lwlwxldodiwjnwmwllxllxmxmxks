package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g3 implements Runnable {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ v4 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ p3 w;
    public final /* synthetic */ Object x;

    public g3(p3 p3Var, String str, String str2, v4 v4Var, boolean z, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.s = str;
        this.t = str2;
        this.u = v4Var;
        this.v = z;
        this.x = n0Var;
        this.w = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object th = null;
        Object e = null;
        t4 t4Var;
        f0 f0Var;
        o1 o1Var;
        AtomicReference atomicReference;
        p3 p3Var;
        f0 f0Var2;
        switch (this.r) {
            case 0:
                String str = this.t;
                String str2 = this.s;
                com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) this.x;
                p3 p3Var2 = this.w;
                Bundle bundle = new Bundle();
                try {
                    try {
                        f0Var = p3Var2.v;
                        o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s;
                    } catch (RemoteException e) {
                        e = e;
                    }
                    if (f0Var == null) {
                        s0 s0Var = o1Var.w;
                        o1.m(s0Var);
                        s0Var.x.c("Failed to get user properties; not connected to service", str2, str);
                        t4Var = o1Var.z;
                        o1.k(t4Var);
                        t4Var.n0(n0Var, bundle);
                        return;
                    }
                    List<q4> F = f0Var.F(str2, str, this.v, this.u);
                    Bundle bundle2 = new Bundle();
                    if (F != null) {
                        for (q4 q4Var : F) {
                            String str3 = q4Var.v;
                            String str4 = q4Var.s;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = q4Var.u;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d = q4Var.x;
                                    if (d != null) {
                                        bundle2.putDouble(str4, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        p3Var2.M();
                        t4 t4Var2 = o1Var.z;
                        o1.k(t4Var2);
                        t4Var2.n0(n0Var, bundle2);
                        return;
                    } catch (RemoteException e2) {
                        e = e2;
                        bundle = bundle2;
                        s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).w;
                        o1.m(s0Var2);
                        s0Var2.x.c("Failed to get user properties; remote exception", str2, e);
                        t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).z;
                        o1.k(t4Var);
                        t4Var.n0(n0Var, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        t4 t4Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).z;
                        o1.k(t4Var3);
                        t4Var3.n0(n0Var, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.x;
                synchronized (atomicReference2) {
                    try {
                        try {
                            p3Var = this.w;
                            f0Var2 = p3Var.v;
                        } catch (RemoteException e3) {
                            s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.w).s).w;
                            o1.m(s0Var3);
                            s0Var3.x.d("(legacy) Failed to get user properties; remote exception", null, this.s, e3);
                            ((AtomicReference) this.x).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.x;
                        }
                        if (f0Var2 == null) {
                            s0 s0Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).w;
                            o1.m(s0Var4);
                            s0Var4.x.d("(legacy) Failed to get user properties; not connected to service", null, this.s, this.t);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(f0Var2.F(this.s, this.t, this.v, this.u));
                        } else {
                            atomicReference2.set(f0Var2.i(null, this.s, this.t, this.v));
                        }
                        p3Var.M();
                        atomicReference = (AtomicReference) this.x;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.x).notify();
                        throw th3;
                    }
                }
        }
    }

    public g3(p3 p3Var, AtomicReference atomicReference, String str, String str2, v4 v4Var, boolean z) {
        this.x = atomicReference;
        this.s = str;
        this.t = str2;
        this.u = v4Var;
        this.v = z;
        this.w = p3Var;
    }
}
