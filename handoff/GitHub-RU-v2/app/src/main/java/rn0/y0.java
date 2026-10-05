package rn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 implements aa.a {
    public static final y0 a = new y0();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        qn0.m1 m1Var;
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
            m1Var = z0.c(eVar, wVar);
        } else {
            m1Var = null;
        }
        if (str2 != null) {
            return new qn0.l1(str, str2, m1Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qn0.l1 l1Var = (qn0.l1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, l1Var.b);
        qn0.m1 m1Var = l1Var.c;
        if (m1Var != null) {
            z0.d(fVar, wVar, m1Var);
        }
    }
}
