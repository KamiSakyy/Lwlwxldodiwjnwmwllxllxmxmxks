package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.a {
    public static final z a = new z();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        rz.m0 m0Var;
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
        if (m71.a.v(m71.a.O(new String[]{"Issue", "Organization", "PullRequest", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            m0Var = y.c(eVar, wVar);
        } else {
            m0Var = null;
        }
        if (str2 != null) {
            return new rz.n0(str, str2, m0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.n0 n0Var = (rz.n0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, n0Var.b);
        rz.m0 m0Var = n0Var.c;
        if (m0Var != null) {
            y.d(fVar, wVar, m0Var);
        }
    }
}
