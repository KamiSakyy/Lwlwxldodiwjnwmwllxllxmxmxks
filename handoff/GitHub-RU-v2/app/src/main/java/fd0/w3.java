package fd0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w3 implements aaShadow.a {
    public static final w3 a = new w3();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.b6 b6Var;
        kc0.c6 c6Var;
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
            b6Var = y3.c(eVar, wVar);
        } else {
            b6Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            c6Var = z3.c(eVar, wVar);
        } else {
            c6Var = null;
        }
        eVar.s0();
        bl0.a c = bl0.b.c(eVar, wVar);
        if (str2 != null) {
            return new kc0.z5(str, str2, b6Var, c6Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.z5 z5Var = (kc0.z5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, z5Var.b);
        kc0.b6 b6Var = z5Var.c;
        if (b6Var != null) {
            y3.d(fVar, wVar, b6Var);
        }
        kc0.c6 c6Var = z5Var.d;
        if (c6Var != null) {
            z3.d(fVar, wVar, c6Var);
        }
        List list = bl0.b.a;
        bl0.b.d(fVar, wVar, z5Var.e);
    }
}
