package eo0;

import java.util.List;
import jn0.j60;
import jn0.r60;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class nt implements aa.a {
    public static final List a = x61.l.r(new String[]{"timelineItem", "id"});

    public static j60 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r60 r60Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                r60Var = (r60) aa.c.b(aa.c.c(vt.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new j60(r60Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j60 j60Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j60Var, "value");
        fVar.z0("timelineItem");
        aa.c.b(aa.c.c(vt.a, true)).b(fVar, wVar, j60Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, j60Var.b);
    }
}
