package com.github.rudroid.uitoolkit;

import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class r1 implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ String t;
    public final /* synthetic */ j71.a u;

    public /* synthetic */ r1(j71.a aVar, String str, boolean z) {
        this.s = z;
        this.t = str;
        this.u = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0 == androidx.compose.runtime.n.a) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        long j;
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    d3.k kVar = new d3.k(0);
                    j71.a aVar = this.u;
                    boolean f = sVar.f(aVar);
                    Object N = sVar.N();
                    if (!f) {
                        obj3 = N;
                        break;
                    }
                    com.github.rudroid.actions.checkdetail.ui.m mVar = new com.github.rudroid.actions.checkdetail.ui.m(25, aVar);
                    sVar.n0(mVar);
                    obj3 = mVar;
                    w1.o oVar = w1.o.a;
                    boolean z = this.s;
                    w1.r o = androidx.compose.foundation.layout.p2.o(androidx.compose.foundation.layout.b.x(f0.o.m(oVar, z, this.t, kVar, (j71.a) obj3, 8), ih.a.k), 24);
                    i2.b C = z3.C(2131231450, 0, sVar);
                    if (z) {
                        sVar.c0(1258200033);
                        j = ih.d.a(sVar).k0;
                        sVar.q(false);
                    } else {
                        if (z) {
                            throw f1.e.r(1258198190, sVar, false);
                        }
                        sVar.c0(1258201722);
                        j = ih.d.a(sVar).j;
                        sVar.q(false);
                    }
                    p5.a(C, i4.p0(2131953815, sVar), o, j, sVar, 8, 0);
                } else {
                    sVar.V();
                }
                return w61.a0.a;
            default:
                ((Integer) obj2).getClass();
                rh.k.b(this.s, this.t, this.u, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return w61.a0.a;
        }
    }

    public /* synthetic */ r1(boolean z, String str, j71.a aVar, int i) {
        this.s = z;
        this.t = str;
        this.u = aVar;
    }
}
