package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "checkRuns"});

    public static b20.v c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b20.q qVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                qVar = (b20.q) aa.c.b(aa.c.c(o.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new b20.v(str, qVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, b20.v vVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, vVar.a);
        fVar.z0("checkRuns");
        aa.c.b(aa.c.c(o.a, false)).b(fVar, wVar, vVar.b);
    }
}
