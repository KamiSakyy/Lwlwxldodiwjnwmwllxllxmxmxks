package hy0;

import iy0.e0;
import iy0.g0;
import iy0.k0;
import iy0.m0;
import java.util.List;
import java.util.Set;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        e0 e0Var;
        k0 k0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
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
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            e0Var = g0.c(eVar, wVar);
        } else {
            e0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            k0Var = m0.c(eVar, wVar);
        } else {
            k0Var = null;
        }
        if (str2 != null) {
            return new gy0.n(str, str2, e0Var, k0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        gy0.n nVar = (gy0.n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, nVar.b);
        e0 e0Var = nVar.c;
        if (e0Var != null) {
            g0.d(fVar, wVar, e0Var);
        }
        k0 k0Var = nVar.d;
        if (k0Var != null) {
            m0.d(fVar, wVar, k0Var);
        }
    }
}
