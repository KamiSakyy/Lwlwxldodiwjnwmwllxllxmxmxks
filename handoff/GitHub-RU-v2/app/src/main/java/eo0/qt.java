package eo0;

import java.util.List;
import jn0.m60;
import jn0.q60;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class qt implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "timelineItem"});

    public static m60 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        q60 q60Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                q60Var = (q60) aa.c.b(aa.c.c(ut.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new m60(str, q60Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m60 m60Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m60Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, m60Var.a);
        fVar.z0("timelineItem");
        aa.c.b(aa.c.c(ut.a, true)).b(fVar, wVar, m60Var.b);
    }
}
