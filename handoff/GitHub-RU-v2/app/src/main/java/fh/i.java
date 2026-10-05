package fh;

import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import d3.q;
import f1.q6;
import f1.ub;
import g3.g0;
import g3.h0;
import g3.q0;
import qg.p;
import s0.w0;
import s3.m;
import w1.o;
import w1.r;
import w2.g1;
import w61.a0;
import z.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class i implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    public /* synthetic */ i(int i, int i2, int i3, String str) {
        this.r = i3;
        this.s = str;
        this.t = i;
        this.u = i2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        Object obj4 = n.a;
        o oVar = o.a;
        a0 a0Var = a0.a;
        Object obj5 = this.s;
        switch (i) {
            case 0:
                String str = (String) obj5;
                m2 m2Var = (m2) obj;
                s sVar = (s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g(m2Var, "$this$SearchTopBarTitle");
                if ((intValue & 6) == 0) {
                    intValue |= sVar.f(m2Var) ? 4 : 2;
                }
                if (sVar.S(intValue & 1, (intValue & 19) != 18)) {
                    r a = m2Var.a(oVar, 1.0f, true);
                    Object N = sVar.N();
                    if (N == obj4) {
                        N = new q6(10);
                        sVar.n0(N);
                    }
                    ub.b(str, q.b(a, false, (j71.c) N), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, this.t, false, this.u, 0, (j71.c) null, (q0) null, sVar, 0, 0, 241660);
                } else {
                    sVar.V();
                }
                return a0Var;
            case 1:
                String str2 = (String) obj5;
                s sVar2 = (s) obj2;
                ((Integer) obj3).getClass();
                float f = p.a;
                k71.k.g((y) obj, "$this$AnimatedVisibility");
                if (str2 == null) {
                    sVar2.c0(-86127860);
                    sVar2.q(false);
                } else {
                    sVar2.c0(-86127859);
                    ub.b(str2, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, this.t, false, this.u, 0, (j71.c) null, ih.d.f(sVar2).x, sVar2, 0, 0, 110590);
                    sVar2.q(false);
                }
                return a0Var;
            case 2:
                String str3 = (String) obj5;
                s sVar3 = (s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((y) obj, "$this$AnimatedVisibility");
                if (str3 == null) {
                    sVar3.c0(2129490279);
                    sVar3.q(false);
                } else {
                    sVar3.c0(2129490280);
                    ub.b(str3, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, this.t, false, this.u, 0, (j71.c) null, ih.d.f(sVar3).x, sVar3, 0, 0, 110590);
                    sVar3.q(false);
                }
                return a0Var;
            default:
                q0 q0Var = (q0) obj5;
                s sVar4 = (s) obj2;
                ((Integer) obj3).getClass();
                sVar4.c0(408240218);
                int i2 = this.t;
                int i3 = this.u;
                s0.s.D(i2, i3);
                if (i2 == 1 && i3 == Integer.MAX_VALUE) {
                    sVar4.q(false);
                    return oVar;
                }
                s3.c cVar = (s3.c) sVar4.j(g1.h);
                k3.j jVar = (k3.h) sVar4.j(g1.k);
                m mVar = (m) sVar4.j(g1.n);
                boolean d = sVar4.d(mVar.ordinal()) | sVar4.f(q0Var);
                Object N2 = sVar4.N();
                if (d || N2 == obj4) {
                    N2 = g0.i(q0Var, mVar);
                    sVar4.n0(N2);
                }
                q0 q0Var2 = (q0) N2;
                boolean f2 = sVar4.f(jVar) | sVar4.f(q0Var2);
                Object N3 = sVar4.N();
                if (f2 || N3 == obj4) {
                    h0 h0Var = q0Var2.a;
                    k3.i iVar = h0Var.f;
                    k3.s sVar5 = h0Var.c;
                    if (sVar5 == null) {
                        sVar5 = k3.s.w;
                    }
                    k3.o oVar2 = h0Var.d;
                    int i4 = oVar2 != null ? oVar2.a : 0;
                    k3.p pVar = h0Var.e;
                    N3 = jVar.b(iVar, sVar5, i4, pVar != null ? pVar.a : 65535);
                    sVar4.n0(N3);
                }
                i3 i3Var = (i3) N3;
                boolean f3 = sVar4.f(i3Var.getValue()) | sVar4.f(cVar) | sVar4.f(jVar) | sVar4.f(q0Var) | sVar4.d(mVar.ordinal());
                Object N4 = sVar4.N();
                if (f3 || N4 == obj4) {
                    N4 = Integer.valueOf((int) (w0.a(q0Var2, cVar, jVar, w0.a, 1) & 4294967295L));
                    sVar4.n0(N4);
                }
                int intValue2 = ((Number) N4).intValue();
                boolean f4 = sVar4.f(i3Var.getValue()) | sVar4.f(cVar) | sVar4.f(jVar) | sVar4.f(q0Var) | sVar4.d(mVar.ordinal());
                Object N5 = sVar4.N();
                if (f4 || N5 == obj4) {
                    StringBuilder sb = new StringBuilder();
                    String str4 = w0.a;
                    sb.append(str4);
                    sb.append('\n');
                    sb.append(str4);
                    N5 = Integer.valueOf((int) (w0.a(q0Var2, cVar, jVar, sb.toString(), 2) & 4294967295L));
                    sVar4.n0(N5);
                }
                int intValue3 = ((Number) N5).intValue() - intValue2;
                Integer valueOf = i2 == 1 ? null : Integer.valueOf(((i2 - 1) * intValue3) + intValue2);
                Integer valueOf2 = i3 != Integer.MAX_VALUE ? Integer.valueOf(((i3 - 1) * intValue3) + intValue2) : null;
                r g = p2.g(oVar, valueOf != null ? cVar.E(valueOf.intValue()) : Float.NaN, valueOf2 != null ? cVar.E(valueOf2.intValue()) : Float.NaN);
                sVar4.q(false);
                return g;
        }
    }

    public /* synthetic */ i(int i, int i2, q0 q0Var) {
        this.r = 3;
        this.t = i;
        this.u = i2;
        this.s = q0Var;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }
}
