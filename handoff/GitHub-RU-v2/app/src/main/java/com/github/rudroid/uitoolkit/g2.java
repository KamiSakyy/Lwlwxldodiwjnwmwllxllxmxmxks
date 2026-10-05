package com.github.rudroid.uitoolkit;

import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g2 extends k71.l implements j71.e {
    public final /* synthetic */ androidx.compose.runtime.f1 s;
    public final /* synthetic */ y3.k t;
    public final /* synthetic */ String u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ z1 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(androidx.compose.runtime.f1 f1Var, y3.k kVar, j71.a aVar, String str, boolean z, boolean z2, z1 z1Var, String str2, String str3) {
        super(2);
        this.s = f1Var;
        this.t = kVar;
        this.u = str;
        this.v = z;
        this.w = z2;
        this.x = z1Var;
        this.y = str2;
        this.z = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x013b, code lost:
    
        if (r5 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        w61.a0 a0Var = w61.a0.a;
        if (intValue == 2 && sVar.C()) {
            sVar.V();
            return a0Var;
        }
        this.s.setValue(a0Var);
        y3.k kVar = this.t;
        kVar.getClass();
        kVar.d();
        sVar.c0(-1405284435);
        y3.k kVar2 = (y3.k) kVar.c().s;
        y3.d b = kVar2.b();
        y3.d b2 = kVar2.b();
        y3.d b3 = kVar2.b();
        y3.d b4 = kVar2.b();
        float f = ih.a.x;
        w1.o oVar = w1.o.a;
        w1.r o = androidx.compose.foundation.layout.p2.o(oVar, f);
        boolean f2 = sVar.f(b2);
        Object N = sVar.N();
        Object obj4 = androidx.compose.runtime.n.a;
        if (f2 || N == obj4) {
            N = new h2(b2);
            sVar.n0(N);
        }
        f3.a(y3.k.a(o, b, (j71.c) N), this.u, this.v, null, true, null, null, null, sVar, 24576, 232);
        boolean f3 = sVar.f(b3) | sVar.f(b);
        boolean z = this.w;
        boolean g = f3 | sVar.g(z) | sVar.f(b4);
        Object N2 = sVar.N();
        if (g || N2 == obj4) {
            N2 = new i2(b3, b, z, b4);
            sVar.n0(N2);
        }
        w1.r a = y3.k.a(oVar, b2, (j71.c) N2);
        g3.q0 q0Var = ih.d.f(sVar).x;
        z1 z1Var = this.x;
        ub.b(this.y, a, z1Var.a, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var, sVar, 0, 0, 131064);
        boolean f4 = sVar.f(b2) | sVar.f(b) | sVar.g(z) | sVar.f(b4);
        Object N3 = sVar.N();
        if (f4) {
            obj3 = obj4;
        } else {
            obj3 = obj4;
        }
        N3 = new j2(b2, b, z, b4);
        sVar.n0(N3);
        w1.r a2 = y3.k.a(oVar, b3, (j71.c) N3);
        g3.q0 q0Var2 = ih.d.f(sVar).n;
        Object obj5 = obj3;
        ub.b(this.z, a2, z1Var.b, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var2, sVar, 0, 0, 131064);
        if (z) {
            sVar.c0(-1403373317);
            Object N4 = sVar.N();
            if (N4 == obj5) {
                N4 = k2.r;
                sVar.n0(N4);
            }
            p5.a(z3.C(2131231159, 0, sVar), i4.p0(2131953825, sVar), y3.k.a(oVar, b4, (j71.c) N4), ih.d.b(sVar).F, sVar, 8, 0);
        } else {
            sVar.c0(-1406464296);
        }
        sVar.q(false);
        sVar.q(false);
        return a0Var;
    }
}
