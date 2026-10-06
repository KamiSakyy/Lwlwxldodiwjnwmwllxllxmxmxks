package ep;

import java.util.List;
import jo.e90;
import jo.w80;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class hv implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"timelineItem", "id"});

    public static w80 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e90 e90Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                e90Var = (e90) aa.c.b(aa.c.c(pvShadow.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new w80(e90Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, w80 w80Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w80Var, "value");
        fVar.z0("timelineItem");
        aa.c.b(aa.c.c(pvShadow.a, true)).b(fVar, wVar, w80Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, w80Var.b);
    }
}
