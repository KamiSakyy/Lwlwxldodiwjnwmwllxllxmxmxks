package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o3 implements ServiceConnection, c21.b, c21.c {
    public volatile boolean r;
    public volatile o0 s;
    public final /* synthetic */ p3 t;

    public o3(p3 p3Var) {
        this.t = p3Var;
    }

    @Override // c21.b
    public final void e(int i) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s;
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        m1Var.E();
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        s0Var.E.a("Service connection suspended");
        m1 m1Var2 = o1Var.x;
        o1.m(m1Var2);
        m1Var2.I(new androidx.fragment.app.o(8, this));
    }

    @Override // c21.b
    public final void f() {
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).x;
        o1.m(m1Var);
        m1Var.E();
        synchronized (this) {
            try {
                c21.uShadow.g(this.s);
                f0 f0Var = (f0) this.s.u();
                m1 m1Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).x;
                o1.m(m1Var2);
                m1Var2.I(new m3(this, f0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.s = null;
                this.r = false;
            }
        }
    }

    @Override // c21.c
    public final void g(z11.b bVar) {
        p3 p3Var = this.t;
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).x;
        o1.m(m1Var);
        m1Var.E();
        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).w;
        if (s0Var == null || !s0Var.t) {
            s0Var = null;
        }
        if (s0Var != null) {
            s0Var.F.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.r = false;
            this.s = null;
        }
        m1 m1Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).x;
        o1.m(m1Var2);
        m1Var2.I(new com.google.common.util.concurrent.b(this, bVar, false, 15));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).x;
        o1.m(m1Var);
        m1Var.E();
        synchronized (this) {
            if (iBinder == null) {
                this.r = false;
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).w;
                o1.m(s0Var);
                s0Var.x.a("Service connected with null binder");
                return;
            }
            f0 f0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    f0Var = queryLocalInterface instanceof f0 ? (f0) queryLocalInterface : new d0(iBinder);
                    s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).w;
                    o1.m(s0Var2);
                    s0Var2.F.a("Bound to IMeasurementService interface");
                } else {
                    s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).w;
                    o1.m(s0Var3);
                    s0Var3.x.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                s0 s0Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).w;
                o1.m(s0Var4);
                s0Var4.x.a("Service connect failed to get IMeasurementService");
            }
            if (f0Var == null) {
                this.r = false;
                try {
                    f21.a b = f21.a.b();
                    p3 p3Var = this.t;
                    b.c(((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).r, p3Var.u);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                m1 m1Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).x;
                o1.m(m1Var2);
                m1Var2.I(new m3(this, f0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s;
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        m1Var.E();
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        s0Var.E.a("Service disconnected");
        m1 m1Var2 = o1Var.x;
        o1.m(m1Var2);
        m1Var2.I(new com.google.common.util.concurrent.b(this, componentName, false, 14));
    }
}
