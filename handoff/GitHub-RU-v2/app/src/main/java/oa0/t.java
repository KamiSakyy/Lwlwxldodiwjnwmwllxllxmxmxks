package oa0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aa.a {
    public static final t a = new t();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        na0.c0 c0Var;
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
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            c0Var = v.c(eVar, wVar);
        } else {
            c0Var = null;
        }
        if (str2 != null) {
            return new na0.a0(str, str2, c0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.a0 a0Var = (na0.a0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, a0Var.b);
        na0.c0 c0Var = a0Var.c;
        if (c0Var != null) {
            v.d(fVar, wVar, c0Var);
        }
    }
}
