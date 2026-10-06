package com.github.rudroid.uitoolkit.utils;

import f0.z1;
import h0.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a0 implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ x2 w;

    public /* synthetic */ a0(x2 x2Var, int i, boolean z, int i2, int i3, int i4) {
        this.r = i4;
        this.w = x2Var;
        this.s = i;
        this.t = z;
        this.u = i2;
        this.v = i3;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                z1 z1Var = this.w;
                int y = z1Var.a.y();
                int i = this.s;
                if (y <= 0) {
                    if (this.t) {
                        i = this.u;
                    } else {
                        int y2 = z1Var.a.y();
                        i = m71.a.W(i * (Integer.min(r1, y2) / this.v));
                    }
                }
                return Integer.valueOf(i);
            default:
                m0.s sVar = this.w;
                int y3 = sVar.e.b.y();
                int i2 = this.s;
                if (y3 <= 0) {
                    if (this.t) {
                        i2 = this.u;
                    } else {
                        int y4 = sVar.e.c.y();
                        i2 = m71.a.W(i2 * (Integer.min(r1, y4) / this.v));
                    }
                }
                return Integer.valueOf(i2);
        }
    }
    public Object c(Object p1) { return null; }
}
