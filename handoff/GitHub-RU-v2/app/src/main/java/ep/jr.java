package ep;

import java.util.List;
import jo.h30;
import jo.l30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jr implements aaShadow.a {
    public static final jr a = new jr();
    public static final List b = sy.d0.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l30 l30Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l30Var = (l30) aa.c.b(aa.c.c(nr.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new h30(l30Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h30 h30Var = (h30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h30Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(nr.a, false)).b(fVar, wVar, h30Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h30Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h30Var.c);
    }
}
