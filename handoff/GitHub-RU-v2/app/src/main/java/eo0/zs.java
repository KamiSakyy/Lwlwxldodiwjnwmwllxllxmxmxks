package eo0;

import java.util.List;
import jn0.q50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zs implements aaShadow.a {
    public static final zs a = new zs();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        uu0.v5 v5Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            uu0.a6 a6Var = uu0.a6.a;
            v5Var = uu0.a6.c(eVar, wVar);
        } else {
            v5Var = null;
        }
        if (str2 != null) {
            return new q50(str, str2, v5Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q50 q50Var = (q50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q50Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q50Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, q50Var.b);
        uu0.v5 v5Var = q50Var.c;
        if (v5Var != null) {
            uu0.a6 a6Var = uu0.a6.a;
            uu0.a6.d(fVar, wVar, v5Var);
        }
    }
}
