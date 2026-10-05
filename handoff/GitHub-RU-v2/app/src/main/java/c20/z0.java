package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "creator", "workflowRun", "app"});

    public static b20.m1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        b20.j1 j1Var = null;
        b20.n1 n1Var = null;
        b20.h1 h1Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                j1Var = (b20.j1) aa.c.b(aa.c.c(w0.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                n1Var = (b20.n1) aa.c.b(aa.c.c(a1.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                h1Var = (b20.h1) aa.c.b(aa.c.c(v0.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        g20.v c = g20.b0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new b20.m1(str, str2, j1Var, n1Var, h1Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, b20.m1 m1Var) {
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
        List list = g20.b0.a;
        g20.b0.d(fVar, wVar, m1Var.f);
    }
}
