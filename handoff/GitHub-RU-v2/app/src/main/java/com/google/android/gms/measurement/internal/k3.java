package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k3 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ v4 s;
    public final /* synthetic */ p3 t;

    public /* synthetic */ k3(p3 p3Var, v4 v4Var, int i) {
        this.r = i;
        this.s = v4Var;
        this.t = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                p3 p3Var = this.t;
                f0 f0Var = p3Var.v;
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s;
                if (f0Var != null) {
                    try {
                        f0Var.n(this.s);
                    } catch (RemoteException e) {
                        s0 s0Var = o1Var.w;
                        o1.m(s0Var);
                        s0Var.x.b(e, "Failed to reset data on the service: remote exception");
                    }
                    p3Var.M();
                    break;
                } else {
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.x.a("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                p3 p3Var2 = this.t;
                f0 f0Var2 = p3Var2.v;
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s;
                if (f0Var2 == null) {
                    s0 s0Var3 = o1Var2.w;
                    o1.m(s0Var3);
                    s0Var3.x.a("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        v4 v4Var = this.s;
                        h hVar = o1Var2.u;
                        b0 b0Var = c0.b1;
                        if (hVar.J(null, b0Var)) {
                            p3Var2.R(f0Var2, null, v4Var);
                        }
                        f0Var2.A(v4Var);
                        o1Var2.o().E();
                        o1Var2.u.J(null, b0Var);
                        p3Var2.R(f0Var2, null, v4Var);
                        p3Var2.M();
                        break;
                    } catch (RemoteException e2) {
                        s0 s0Var4 = o1Var2.w;
                        o1.m(s0Var4);
                        s0Var4.x.b(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                p3 p3Var3 = this.t;
                f0 f0Var3 = p3Var3.v;
                o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var3).s;
                if (f0Var3 == null) {
                    s0 s0Var5 = o1Var3.w;
                    o1.m(s0Var5);
                    s0Var5.A.a("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        f0Var3.D(this.s);
                        p3Var3.M();
                        break;
                    } catch (RemoteException e3) {
                        s0 s0Var6 = o1Var3.w;
                        o1.m(s0Var6);
                        s0Var6.x.b(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case 3:
                p3 p3Var4 = this.t;
                f0 f0Var4 = p3Var4.v;
                o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var4).s;
                if (f0Var4 == null) {
                    s0 s0Var7 = o1Var4.w;
                    o1.m(s0Var7);
                    s0Var7.x.a("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        f0Var4.s(this.s);
                        p3Var4.M();
                        break;
                    } catch (RemoteException e4) {
                        s0 s0Var8 = o1Var4.w;
                        o1.m(s0Var8);
                        s0Var8.x.b(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                p3 p3Var5 = this.t;
                f0 f0Var5 = p3Var5.v;
                o1 o1Var5 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var5).s;
                if (f0Var5 == null) {
                    s0 s0Var9 = o1Var5.w;
                    o1.m(s0Var9);
                    s0Var9.x.a("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        f0Var5.J(this.s);
                        p3Var5.M();
                        break;
                    } catch (RemoteException e5) {
                        s0 s0Var10 = o1Var5.w;
                        o1.m(s0Var10);
                        s0Var10.x.b(e5, "Failed to send consent settings to the service");
                    }
                }
        }
    }

    public k3(p3 p3Var, v4 v4Var) {
        this.r = 4;
        this.s = v4Var;
        Objects.requireNonNull(p3Var);
        this.t = p3Var;
    }







}
