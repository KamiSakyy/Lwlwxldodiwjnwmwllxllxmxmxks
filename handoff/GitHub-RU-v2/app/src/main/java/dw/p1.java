package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p1 implements aa.a {
    public static final p1 a = new p1();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        i1 i1Var;
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
            i1Var = m1.c(eVar, wVar);
        } else {
            i1Var = null;
        }
        if (str2 != null) {
            return new k1(str, str2, i1Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k1 k1Var = (k1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, k1Var.b);
        i1 i1Var = k1Var.c;
        if (i1Var != null) {
            m1.d(fVar, wVar, i1Var);
        }
    }
}
