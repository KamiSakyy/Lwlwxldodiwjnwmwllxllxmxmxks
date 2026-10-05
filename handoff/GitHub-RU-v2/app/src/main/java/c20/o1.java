package c20;

import b20.j2;
import b20.k2;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 implements aa.a {
    public static final o1 a = new o1();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k2 k2Var;
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
            k2Var = p1.c(eVar, wVar);
        } else {
            k2Var = null;
        }
        if (str2 != null) {
            return new j2(str, str2, k2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j2 j2Var = (j2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, j2Var.b);
        k2 k2Var = j2Var.c;
        if (k2Var != null) {
            p1.d(fVar, wVar, k2Var);
        }
    }
}
