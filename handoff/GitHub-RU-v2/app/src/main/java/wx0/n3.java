package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"labels", "field"});

    public static f1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c0 c0Var = null;
        v vVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                c0Var = (c0) aa.c.b(aa.c.c(k2.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                vVar = (v) aa.c.c(d2.a, true).a(eVar, wVar);
            }
        }
        if (vVar != null) {
            return new f1Shadow(c0Var, vVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, f1Shadow f1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("labels");
        aa.c.b(aa.c.c(k2.a, false)).b(fVar, wVar, f1Var.a);
        fVar.z0("field");
        aa.c.c(d2.a, true).b(fVar, wVar, f1Var.b);
    }
}
