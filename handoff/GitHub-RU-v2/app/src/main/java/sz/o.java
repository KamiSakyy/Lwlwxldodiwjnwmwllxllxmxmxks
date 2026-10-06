package sz;

import cq.u2;
import cq.v2;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements aa.a {
    public static final o a = new o();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        rz.v vVar;
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
            vVar = m.c(eVar, wVar);
        } else {
            vVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            u2Var = v2.c(eVar, wVar);
        } else {
            u2Var = null;
        }
        if (str2 != null) {
            return new rz.xShadow(str, str2, vVar, u2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.xShadow xVar = (rz.xShadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, xVar.b);
        rz.v vVar = xVar.c;
        if (vVar != null) {
            m.d(fVar, wVar, vVar);
        }
        u2 u2Var = xVar.d;
        if (u2Var != null) {
            v2.d(fVar, wVar, u2Var);
        }
    }
}
