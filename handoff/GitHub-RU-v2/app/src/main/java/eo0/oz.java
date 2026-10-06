package eo0;

import java.util.List;
import jn0.lf0;
import jn0.mf0;
import jn0.nf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oz implements aaShadow.a {
    public static final oz a = new oz();
    public static final List b = sy.d0.o(new String[]{"user", "organization", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        nf0 nf0Var = null;
        mf0 mf0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                nf0Var = (nf0) aa.c.b(aa.c.c(qz.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                mf0Var = (mf0) aa.c.b(aa.c.c(pz.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new lf0(nf0Var, mf0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        lf0 lf0Var = (lf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lf0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(qz.a, true)).b(fVar, wVar, lf0Var.a);
        fVar.z0("organization");
        aa.c.b(aa.c.c(pz.a, true)).b(fVar, wVar, lf0Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lf0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lf0Var.d);
    }
}
