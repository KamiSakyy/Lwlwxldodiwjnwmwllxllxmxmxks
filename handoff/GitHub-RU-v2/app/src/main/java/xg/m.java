package xg;

import a0.n1;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.v1;
import com.github.rudroid.uitoolkit.text.y;
import com.github.rudroid.uitoolkit.utils.x;
import com.github.rudroid.utilities.k1;
import f0.v;
import f1.e8;
import f1.gb;
import f1.y0;
import g3.g0;
import g3.q0;
import s0.m0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class m implements j71.f {
    public final /* synthetic */ j71.f A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ j71.a D;
    public final /* synthetic */ j71.a E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ j71.e H;
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.f s;
    public final /* synthetic */ String t;
    public final /* synthetic */ m0 u;
    public final /* synthetic */ j71.c v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ gb z;

    public /* synthetic */ m(j71.f fVar, String str, m0 m0Var, j71.c cVar, boolean z, String str2, String str3, gb gbVar, j71.f fVar2, boolean z2, boolean z3, j71.a aVar, j71.a aVar2, int i, int i2, j71.e eVar, int i3) {
        this.r = i3;
        this.s = fVar;
        this.t = str;
        this.u = m0Var;
        this.v = cVar;
        this.w = z;
        this.x = str2;
        this.y = str3;
        this.z = gbVar;
        this.A = fVar2;
        this.B = z2;
        this.C = z3;
        this.D = aVar;
        this.E = aVar2;
        this.F = i;
        this.G = i2;
        this.H = eVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g((f0) obj, "$this$PrimaryDialog");
                if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
                    e8.e(196608, 24, sVar, ih.d.e(sVar).c, (v) null, e8.t(ih.d.b(sVar).g, 0L, 0L, 0L, sVar, 14), (y0) null, r1.i.d(618116531, new m(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, 1), sVar), x.b(w1.o.a));
                } else {
                    sVar.V();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g((f0) obj, "$this$Card");
                if (sVar2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
                    int hashCode = Long.hashCode(sVar2.T);
                    v1 l = sVar2.l();
                    w1.o oVar = w1.o.a;
                    w1.r c = w1.a.c(sVar2, oVar);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar2.g0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.q0();
                    }
                    androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar2, v2.g.h);
                    androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                    j71.f fVar2 = this.s;
                    f0 f0Var = f0.a;
                    fVar2.f(f0Var, sVar2, 6);
                    w1.r z = androidx.compose.foundation.layout.b.z(p2.e(oVar, 1.0f), ih.a.m, 0.0f, 2);
                    r0.d dVar = ih.d.e(sVar2).c;
                    q0 q0Var = ih.d.f(sVar2).d;
                    String str = this.t;
                    long b = g0.b(0, str.length());
                    j71.c cVar = this.v;
                    boolean f = sVar2.f(cVar);
                    Object N = sVar2.N();
                    if (f || N == androidx.compose.runtime.n.a) {
                        N = new n1(26, cVar);
                        sVar2.n0(N);
                    }
                    y.b(z, str, this.u, null, (j71.c) N, this.w, dVar, this.x, this.y, false, q0Var, b, this.z, 0, r1.i.d(-1433442548, new k1(4, this.H), sVar2), false, sVar2, 6, 24576, 41480);
                    this.A.f(f0Var, sVar2, 6);
                    p.b(null, this.B, this.C, this.D, this.E, this.F, this.G, sVar2, 0);
                    sVar2.q(true);
                } else {
                    sVar2.V();
                }
                break;
        }
        return a0.a;
    }
}
