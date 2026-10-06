package e00;

import f00.g0;
import f00.i0;
import f00.m0;
import f00.o0;
import java.util.List;
import java.util.Set;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        g0 g0Var;
        m0 m0Var;
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
            g0Var = i0.c(eVar, wVar);
        } else {
            g0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            m0Var = o0.c(eVar, wVar);
        } else {
            m0Var = null;
        }
        if (str2 != null) {
            return new d00.n(str, str2, g0Var, m0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d00.n nVar = (d00.n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, nVar.b);
        g0 g0Var = nVar.c;
        if (g0Var != null) {
            i0.d(fVar, wVar, g0Var);
        }
        m0 m0Var = nVar.d;
        if (m0Var != null) {
            o0.d(fVar, wVar, m0Var);
        }
    }
}
