package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 implements ServiceConnection {
    public final /* synthetic */ int r = 0;
    public Object s;
    public final /* synthetic */ Object t;

    public d1(e1 e1Var, String str) {
        Objects.requireNonNull(e1Var);
        this.t = e1Var;
        this.s = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.d dVar;
        int i = this.r;
        Object obj = this.t;
        switch (i) {
            case 0:
                e1 e1Var = (e1) obj;
                if (iBinder == null) {
                    s0 s0Var = e1Var.s.w;
                    o1.m(s0Var);
                    s0Var.A.a("Install Referrer connection returned with null binder");
                    return;
                }
                try {
                    int i2 = com.google.android.gms.internal.measurement.b0.f;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    com.google.android.gms.internal.measurement.c0 a0Var = queryLocalInterface instanceof com.google.android.gms.internal.measurement.c0 ? (com.google.android.gms.internal.measurement.c0) queryLocalInterface : new com.google.android.gms.internal.measurement.a0(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
                    o1 o1Var = e1Var.s;
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.F.a("Install Referrer Service connected");
                    m1 m1Var = o1Var.x;
                    o1.m(m1Var);
                    m1Var.I(new com.google.common.util.concurrent.b(this, a0Var, this));
                    return;
                } catch (RuntimeException e) {
                    s0 s0Var3 = e1Var.s.w;
                    o1.m(s0Var3);
                    s0Var3.A.b(e, "Exception occurred while calling Install Referrer API");
                    return;
                }
            default:
                if (((Context) this.s) == null) {
                    throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
                }
                int i3 = b.c.f;
                if (iBinder == null) {
                    dVar = null;
                } else {
                    b.d queryLocalInterface2 = iBinder.queryLocalInterface(b.d.b);
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b.d)) {
                        b.d bVar = new b.b();
                        ((b.b) bVar).f = iBinder;
                        dVar = bVar;
                    } else {
                        dVar = queryLocalInterface2;
                    }
                }
                u.e eVar = new u.e(dVar, componentName);
                p81.a.c("CustomTabsService is connected", new Object[0]);
                try {
                    ((b.b) dVar).f();
                } catch (RemoteException unused) {
                }
                w51.r rVar = (w51.r) obj;
                ((AtomicReference) rVar.t).set(eVar);
                ((CountDownLatch) rVar.u).countDown();
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.r) {
            case 0:
                s0 s0Var = ((e1) this.t).s.w;
                o1.m(s0Var);
                s0Var.F.a("Install Referrer Service disconnected");
                break;
            default:
                p81.a.c("CustomTabsService is disconnected", new Object[0]);
                w51.r rVar = (w51.r) this.t;
                ((AtomicReference) rVar.t).set(null);
                ((CountDownLatch) rVar.u).countDown();
                break;
        }
    }

    public d1(w51.r rVar) {
        this.t = rVar;
    }
}
