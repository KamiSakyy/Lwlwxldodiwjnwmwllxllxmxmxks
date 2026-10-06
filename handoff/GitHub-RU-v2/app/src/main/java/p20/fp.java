package p20;

import java.util.List;
import u10.a10;
import u10.s00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class fp implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"timelineItem", "id"});

    public static s00 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a10 a10Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                a10Var = (a10) aa.c.b(aa.c.c(np.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new s00(a10Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, s00 s00Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s00Var, "value");
        fVar.z0("timelineItem");
        aa.c.b(aa.c.c(np.a, true)).b(fVar, wVar, s00Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, s00Var.b);
    }
}
