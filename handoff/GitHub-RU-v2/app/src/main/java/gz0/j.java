package gz0;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "checkSuite"});

    public static fz0.k c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        fz0.a aVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                aVar = (fz0.a) aa.c.c(a.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (aVar != null) {
            return new fz0.k(str, aVar);
        }
        k41.b.B(eVar, "checkSuite");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, fz0.k kVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, kVar.a);
        fVar.z0("checkSuite");
        aa.c.c(a.a, false).b(fVar, wVar, kVar.b);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
