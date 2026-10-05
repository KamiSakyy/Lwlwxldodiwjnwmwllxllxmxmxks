package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o9 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "history"});

    public static kc0.he c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.fe feVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                feVar = (kc0.fe) aa.c.c(m9.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (feVar != null) {
            return new kc0.he(str, feVar);
        }
        k41.b.B(eVar, "history");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.he heVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(heVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, heVar.a);
        fVar.z0("history");
        aa.c.c(m9.a, false).b(fVar, wVar, heVar.b);
    }
}
