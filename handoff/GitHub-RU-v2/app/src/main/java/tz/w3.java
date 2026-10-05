package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"actors", "field"});

    public static o1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q qVar = null;
        y yVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                qVar = (q) aa.c.b(aa.c.c(y1.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                yVar = (y) aa.c.c(g2.a, true).a(eVar, wVar);
            }
        }
        if (yVar != null) {
            return new o1(qVar, yVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o1 o1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o1Var, "value");
        fVar.z0("actors");
        aa.c.b(aa.c.c(y1.a, false)).b(fVar, wVar, o1Var.a);
        fVar.z0("field");
        aa.c.c(g2.a, true).b(fVar, wVar, o1Var.b);
    }
}
