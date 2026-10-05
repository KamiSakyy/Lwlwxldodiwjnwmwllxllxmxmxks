package ro;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "workflowRun", "app"});

    public static qo.l0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        qo.n0 n0Var = null;
        qo.h0 h0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                n0Var = (qo.n0) aa.c.b(aa.c.c(g0.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                h0Var = (qo.h0) aa.c.b(aa.c.c(b0.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        vo.v c = vo.b0.c(eVar, wVar);
        if (str != null) {
            return new qo.l0(str, n0Var, h0Var, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, qo.l0 l0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l0Var.a);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(g0.a, false)).b(fVar, wVar, l0Var.b);
        fVar.z0("app");
        aa.c.b(aa.c.c(b0.a, false)).b(fVar, wVar, l0Var.c);
        List list = vo.b0.a;
        vo.b0.d(fVar, wVar, l0Var.d);
    }
}
