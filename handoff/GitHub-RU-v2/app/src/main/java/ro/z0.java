package ro;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "creator", "workflowRun", "app"});

    public static qo.m1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        qo.j1 j1Var = null;
        qo.n1 n1Var = null;
        qo.h1 h1Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                j1Var = (qo.j1) aa.c.b(aa.c.c(w0.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                n1Var = (qo.n1) aa.c.b(aa.c.c(a1.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                h1Var = (qo.h1) aa.c.b(aa.c.c(v0.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        vo.v c = vo.b0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new qo.m1(str, str2, j1Var, n1Var, h1Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, qo.m1 m1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m1Var.b);
        fVar.z0("creator");
        aa.c.b(aa.c.c(w0.a, true)).b(fVar, wVar, m1Var.c);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(a1.a, true)).b(fVar, wVar, m1Var.d);
        fVar.z0("app");
        aa.c.b(aa.c.c(v0.a, false)).b(fVar, wVar, m1Var.e);
        List list = vo.b0.a;
        vo.b0.d(fVar, wVar, m1Var.f);
    }
}
