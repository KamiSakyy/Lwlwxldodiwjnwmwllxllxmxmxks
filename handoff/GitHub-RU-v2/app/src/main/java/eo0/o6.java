package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o6 implements aaShadow.a {
    public static final o6 a = new o6();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.y9 y9Var;
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
        if (m71.a.v(m71.a.O(new String[]{"CheckSuite"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            y9Var = p6.c(eVar, wVar);
        } else {
            y9Var = null;
        }
        if (str2 != null) {
            return new jn0.x9(str, str2, y9Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.x9 x9Var = (jn0.x9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x9Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x9Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, x9Var.b);
        jn0.y9 y9Var = x9Var.c;
        if (y9Var != null) {
            p6.d(fVar, wVar, y9Var);
        }
    }
}
