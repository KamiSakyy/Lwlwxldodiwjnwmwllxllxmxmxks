package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l2 implements Runnable {
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ long t;
    public final /* synthetic */ Bundle u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ t2 y;

    public l2(t2 t2Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.r = str;
        this.s = str2;
        this.t = j;
        this.u = bundle;
        this.v = z;
        this.w = z2;
        this.x = z3;
        this.y = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.y.I(this.r, this.s, this.t, this.u, this.v, this.w, this.x);
    }
}
