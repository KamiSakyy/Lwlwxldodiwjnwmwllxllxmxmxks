package rn0;

import java.util.List;
import qn0.r2;
import qn0.s2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s1 implements aa.a {
    public static final s1 a = new s1();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        s2 s2Var;
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
            s2Var = t1.c(eVar, wVar);
        } else {
            s2Var = null;
        }
        if (str2 != null) {
            return new r2(str, str2, s2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r2 r2Var = (r2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, r2Var.b);
        s2 s2Var = r2Var.c;
        if (s2Var != null) {
            t1.d(fVar, wVar, s2Var);
        }
    }
}
