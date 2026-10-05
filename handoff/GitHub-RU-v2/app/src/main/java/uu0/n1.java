package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 implements aa.a {
    public static final n1 a = new n1();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        g1 g1Var;
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
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            g1Var = k1.c(eVar, wVar);
        } else {
            g1Var = null;
        }
        if (str2 != null) {
            return new i1(str, str2, g1Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i1 i1Var = (i1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, i1Var.b);
        g1 g1Var = i1Var.c;
        if (g1Var != null) {
            k1.d(fVar, wVar, g1Var);
        }
    }
}
