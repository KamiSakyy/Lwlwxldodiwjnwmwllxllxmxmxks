package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "checkSuite", "steps"});

    public static b20.c0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b20.xShadow xVar = null;
        b20.d0 d0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                xVar = (b20.xShadow) aa.c.c(t.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                d0Var = (b20.d0) aa.c.b(aa.c.c(y.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        g20.s1 c = g20.t1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (xVar != null) {
            return new b20.c0(str, xVar, d0Var, c);
        }
        k41.b.B(eVar, "checkSuite");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, b20.c0 c0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, c0Var.a);
        fVar.z0("checkSuite");
        aa.c.c(t.a, false).b(fVar, wVar, c0Var.b);
        fVar.z0("steps");
        aa.c.b(aa.c.c(y.a, false)).b(fVar, wVar, c0Var.c);
        List list = g20.t1.a;
        g20.t1.d(fVar, wVar, c0Var.d);
    }
}
