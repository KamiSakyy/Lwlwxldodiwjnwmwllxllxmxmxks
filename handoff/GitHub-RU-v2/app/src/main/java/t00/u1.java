package t00;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u1 implements j71.c {
    public final /* synthetic */ int r;
    public static final u1 s = new u1(0);
    public static final u1 t = new u1(1);
    public static final u1 u = new u1(2);
    public static final u1 v = new u1(3);
    public static final u1 w = new u1(4);
    public static final u1 x = new u1(5);
    public static final u1 y = new u1(6);
    public static final u1 z = new u1(7);
    public static final u1 A = new u1(8);
    public static final u1 B = new u1(9);
    public static final u1 C = new u1(10);
    public static final u1 D = new u1(11);

    public /* synthetic */ u1(int i) {
        this.r = i;
    }

    public final Object k(Object obj) {
        qp.d dVar;
        tz.u4 u4Var;
        qp.e eVar;
        f00.g1 g1Var;
        zx.v0 v0Var;
        zx.m0 m0Var;
        List list;
        zx.r0 r0Var;
        zx.l0 l0Var;
        switch (this.r) {
            case 0:
                qp.g gVar = (qp.g) obj;
                k71.k.g(gVar, "$this$mapOrApiFailure");
                String str = gVar.a;
                String str2 = gVar.c;
                String str3 = gVar.b;
                qp.b bVar = gVar.e;
                com.github.service.models.response.a e = v8.l0.e(bVar != null ? bVar.b : null);
                ZonedDateTime zonedDateTime = gVar.d;
                List list2 = gVar.f.a;
                if (list2 == null || (dVar = (qp.d) x61.m.W(list2)) == null || (u4Var = dVar.c) == null) {
                    throw new IllegalStateException("Can not fetch project with fields for draft issue");
                }
                l01.t0 j = com.google.common.util.concurrent.a.j(u4Var);
                List list3 = gVar.g.a;
                if (list3 == null || (eVar = (qp.e) x61.m.W(list3)) == null || (g1Var = eVar.c) == null) {
                    throw new IllegalStateException("Can not fetch project view item for draft issue");
                }
                return new c01.b(str, com.google.common.util.concurrent.a.i(g1Var), j, e, str2, str3, zonedDateTime);
            case 1:
                rz.d dVar2 = (rz.d) obj;
                k71.k.g(dVar2, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.h(dVar2.c);
            case 2:
                rz.e1 e1Var = (rz.e1) obj;
                k71.k.g(e1Var, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.i(e1Var.c);
            case 3:
                rz.e1 e1Var2 = (rz.e1) obj;
                k71.k.g(e1Var2, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.i(e1Var2.c);
            case 4:
                rz.i iVar = (rz.i) obj;
                k71.k.g(iVar, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.i(iVar.c);
            case 5:
                rz.i iVar2 = (rz.i) obj;
                k71.k.g(iVar2, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.i(iVar2.c);
            case 6:
                rz.r rVar = (rz.r) obj;
                k71.k.g(rVar, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.S(rVar.b);
            case 7:
                rz.s1 s1Var = (rz.s1) obj;
                k71.k.g(s1Var, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.S(s1Var.b);
            case 8:
                rz.o0 o0Var = (rz.o0) obj;
                k71.k.g(o0Var, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.S(o0Var.b);
            case 9:
                rz.w wVar = (rz.w) obj;
                k71.k.g(wVar, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.S(wVar.b);
            case 10:
                rz.t0 t0Var = (rz.t0) obj;
                k71.k.g(t0Var, "$this$mapOrApiFailure");
                return com.google.common.util.concurrent.a.S(t0Var.b);
            default:
                zx.p0 p0Var = (zx.p0) obj;
                k71.k.g(p0Var, "data");
                zx.t0 t0Var2 = p0Var.a;
                return Boolean.valueOf(((t0Var2 == null || (v0Var = t0Var2.c) == null || (m0Var = v0Var.d) == null || (list = m0Var.c) == null || (r0Var = (zx.r0) x61.m.W(list)) == null || (l0Var = r0Var.b) == null) ? null : l0Var.c) != null);
        }
    }
}
