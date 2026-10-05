package e00;

import cq.u2;
import cq.v2;
import java.util.List;
import java.util.Set;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        d00.t tVar;
        u2 u2Var;
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
        if (m71.a.v(m71.a.O(new String[]{"Issue", "Organization", "PullRequest", "User"}), set2, str, set)) {
            eVar.s0();
            tVar = o.c(eVar, wVar);
        } else {
            tVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            u2Var = v2.c(eVar, wVar);
        } else {
            u2Var = null;
        }
        if (str2 != null) {
            return new d00.v(str, str2, tVar, u2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d00.v vVar = (d00.v) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, vVar.b);
        d00.t tVar = vVar.c;
        if (tVar != null) {
            o.d(fVar, wVar, tVar);
        }
        u2 u2Var = vVar.d;
        if (u2Var != null) {
            v2.d(fVar, wVar, u2Var);
        }
    }
}
