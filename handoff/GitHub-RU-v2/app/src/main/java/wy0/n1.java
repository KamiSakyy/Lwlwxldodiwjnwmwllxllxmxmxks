package wy0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 implements j71.c {
    public final /* synthetic */ int r;
    public static final n1 s = new n1(0);
    public static final n1 t = new n1(1);
    public static final n1 u = new n1(2);
    public static final n1 v = new n1(3);
    public static final n1 w = new n1(4);
    public static final n1 x = new n1(5);
    public static final n1 y = new n1(6);
    public static final n1 z = new n1(7);
    public static final n1 A = new n1(8);
    public static final n1 B = new n1(9);
    public static final n1 C = new n1(10);
    public static final n1 D = new n1(11);

    public /* synthetic */ n1(int i) {
        this.r = i;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        lo0.d dVar;
        lo0.e eVar;
        ow0.g0 g0Var;
        ow0.xShadow xVar;
        List list;
        ow0.c0 c0Var;
        ow0.w wVar;
        switch (this.r) {
            case 0:
                lo0.g gVar = (lo0.g) obj;
                k71.k.g(gVar, "$this$mapOrApiFailure");
                String str = gVar.a;
                String str2 = gVar.c;
                String str3 = gVar.b;
                lo0.b bVar = gVar.e;
                com.github.service.models.response.a e = k41.b.e(bVar != null ? bVar.b : null);
                ZonedDateTime zonedDateTime = gVar.d;
                List list2 = gVar.f.a;
                if (list2 == null || (dVar = (lo0.d) x61.m.W(list2)) == null) {
                    throw new IllegalStateException("Can not fetch project with fields for draft issue");
                }
                l01.t0 m = m71.a.m(dVar.c);
                List list3 = gVar.g.a;
                if (list3 == null || (eVar = (lo0.e) x61.m.W(list3)) == null) {
                    throw new IllegalStateException("Can not fetch project view item for draft issue");
                }
                return new c01.b(str, m71.a.l(eVar.c), m, e, str2, str3, zonedDateTime);
            case 1:
                ux0.d dVar2 = (ux0.d) obj;
                k71.k.g(dVar2, "$this$mapOrApiFailure");
                return m71.a.k(dVar2.c);
            case 2:
                ux0.e1 e1Var = (ux0.e1) obj;
                k71.k.g(e1Var, "$this$mapOrApiFailure");
                return m71.a.l(e1Var.c);
            case 3:
                ux0.e1 e1Var2 = (ux0.e1) obj;
                k71.k.g(e1Var2, "$this$mapOrApiFailure");
                return m71.a.l(e1Var2.c);
            case 4:
                ux0.i iVar = (ux0.i) obj;
                k71.k.g(iVar, "$this$mapOrApiFailure");
                return m71.a.l(iVar.c);
            case 5:
                ux0.i iVar2 = (ux0.i) obj;
                k71.k.g(iVar2, "$this$mapOrApiFailure");
                return m71.a.l(iVar2.c);
            case 6:
                ux0.r rVar = (ux0.r) obj;
                k71.k.g(rVar, "$this$mapOrApiFailure");
                return m71.a.g0(rVar.b);
            case 7:
                ux0.s1 s1Var = (ux0.s1) obj;
                k71.k.g(s1Var, "$this$mapOrApiFailure");
                return m71.a.g0(s1Var.b);
            case 8:
                ux0.o0 o0Var = (ux0.o0) obj;
                k71.k.g(o0Var, "$this$mapOrApiFailure");
                return m71.a.g0(o0Var.b);
            case 9:
                ux0.w wVar2 = (ux0.w) obj;
                k71.k.g(wVar2, "$this$mapOrApiFailure");
                return m71.a.g0(wVar2.b);
            case 10:
                ux0.t0 t0Var = (ux0.t0) obj;
                k71.k.g(t0Var, "$this$mapOrApiFailure");
                return m71.a.g0(t0Var.b);
            default:
                ow0.a0Shadow a0Var = (ow0.a0Shadow) obj;
                k71.k.g(a0Var, "data");
                ow0.e0 e0Var = a0Var.a;
                return Boolean.valueOf(((e0Var == null || (g0Var = e0Var.c) == null || (xVar = g0Var.d) == null || (list = xVar.c) == null || (c0Var = (ow0.c0) x61.m.W(list)) == null || (wVar = c0Var.b) == null) ? null : wVar.c) != null);
        }
    }
}
