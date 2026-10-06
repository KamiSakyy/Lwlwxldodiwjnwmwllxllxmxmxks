package eo0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 implements aaShadow.a {
    public static final a4 a = new a4();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.h6 h6Var;
        jn0.i6 i6Var;
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
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            h6Var = c4.c(eVar, wVar);
        } else {
            h6Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            i6Var = d4.c(eVar, wVar);
        } else {
            i6Var = null;
        }
        eVar.s0();
        kw0.a c = kw0.b.c(eVar, wVar);
        if (str2 != null) {
            return new jn0.f6(str, str2, h6Var, i6Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.f6 f6Var = (jn0.f6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f6Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f6Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, f6Var.b);
        jn0.h6 h6Var = f6Var.c;
        if (h6Var != null) {
            c4.d(fVar, wVar, h6Var);
        }
        jn0.i6 i6Var = f6Var.d;
        if (i6Var != null) {
            d4.d(fVar, wVar, i6Var);
        }
        List list = kw0.b.a;
        kw0.b.d(fVar, wVar, f6Var.e);
    }
}
