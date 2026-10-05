package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ p3 s;

    public /* synthetic */ n3(p3 p3Var, int i) {
        this.r = i;
        this.s = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                this.s.F();
                break;
            case 1:
                p3 p3Var = this.s;
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s;
                f0 f0Var = p3Var.v;
                if (f0Var == null) {
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.x.a("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        f0Var.t(p3Var.P(false));
                        p3Var.M();
                        break;
                    } catch (RemoteException e) {
                        s0 s0Var2 = o1Var.w;
                        o1.m(s0Var2);
                        s0Var2.x.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                p3 p3Var2 = this.s;
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s;
                f0 f0Var2 = p3Var2.v;
                if (f0Var2 == null) {
                    s0 s0Var3 = o1Var2.w;
                    o1.m(s0Var3);
                    s0Var3.x.a("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        f0Var2.p(p3Var2.P(false));
                        p3Var2.M();
                        break;
                    } catch (RemoteException e2) {
                        s0 s0Var4 = o1Var2.w;
                        o1.m(s0Var4);
                        s0Var4.x.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
