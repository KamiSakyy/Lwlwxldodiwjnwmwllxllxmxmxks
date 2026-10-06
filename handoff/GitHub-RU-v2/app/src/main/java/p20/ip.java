package p20;

import java.util.List;
import u10.v00;
import u10.z00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ip implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "timelineItem"});

    public static v00 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        z00 z00Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                z00Var = (z00) aa.c.b(aa.c.c(mp.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new v00(str, z00Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v00 v00Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v00Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, v00Var.a);
        fVar.z0("timelineItem");
        aa.c.b(aa.c.c(mp.a, true)).b(fVar, wVar, v00Var.b);
    }
}
