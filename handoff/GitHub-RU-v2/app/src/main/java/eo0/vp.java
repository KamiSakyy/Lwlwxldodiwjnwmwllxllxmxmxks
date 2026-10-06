package eo0;

import java.util.List;
import jn0.c10;
import jn0.e10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vp implements aaShadow.a {
    public static final vp a = new vp();
    public static final List b = sy.d0.o(new String[]{"repository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e10 e10Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                e10Var = (e10) aa.c.b(aa.c.c(xp.a, false)).a(eVar, wVar);
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
            return new c10(e10Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c10 c10Var = (c10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c10Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(xp.a, false)).b(fVar, wVar, c10Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c10Var.c);
    }
}
