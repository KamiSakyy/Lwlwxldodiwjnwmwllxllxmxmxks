package eo0;

import java.util.List;
import jn0.ue0;
import jn0.we0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fz implements aaShadow.a {
    public static final fz a = new fz();
    public static final List b = sy.d0.o(new String[]{"contributionsCollection", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ue0 ue0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ue0Var = (ue0) aa.c.c(dz.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (ue0Var == null) {
            k41.b.B(eVar, "contributionsCollection");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new we0(ue0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        we0 we0Var = (we0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(we0Var, "value");
        fVar.z0("contributionsCollection");
        aa.c.c(dz.a, false).b(fVar, wVar, we0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, we0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, we0Var.c);
    }
}
