package eo0;

import java.util.List;
import jn0.h50;
import jn0.l50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ss implements aaShadow.a {
    public static final ss a = new ss();
    public static final List b = sy.d0.o(new String[]{"repositoryOwner", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l50 l50Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l50Var = (l50) aa.c.b(aa.c.c(ws.a, true)).a(eVar, wVar);
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
            return new h50(l50Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h50 h50Var = (h50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h50Var, "value");
        fVar.z0("repositoryOwner");
        aa.c.b(aa.c.c(ws.a, true)).b(fVar, wVar, h50Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h50Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h50Var.c);
    }
}
