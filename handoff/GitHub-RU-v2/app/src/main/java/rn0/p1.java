package rn0;

import java.util.List;
import qn0.m2;
import qn0.n2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p1 implements aa.a {
    public static final p1 a = new p1();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        n2 n2Var;
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
        if (m71.a.v(m71.a.O(new String[]{"Workflow"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            n2Var = q1.c(eVar, wVar);
        } else {
            n2Var = null;
        }
        if (str2 != null) {
            return new m2(str, str2, n2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m2 m2Var = (m2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m2Var.b);
        n2 n2Var = m2Var.c;
        if (n2Var != null) {
            q1.d(fVar, wVar, n2Var);
        }
    }
}
