package rn0;

import java.util.List;
import qn0.d2;
import qn0.e2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 implements aa.a {
    public static final k1 a = new k1();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        e2 e2Var;
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
            e2Var = l1.c(eVar, wVar);
        } else {
            e2Var = null;
        }
        if (str2 != null) {
            return new d2(str, str2, e2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d2 d2Var = (d2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, d2Var.b);
        e2 e2Var = d2Var.c;
        if (e2Var != null) {
            l1.d(fVar, wVar, e2Var);
        }
    }
}
