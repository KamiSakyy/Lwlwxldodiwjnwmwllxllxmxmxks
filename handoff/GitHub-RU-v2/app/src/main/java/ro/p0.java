package ro;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 implements aa.a {
    public static final p0 a = new p0();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        qo.b1 b1Var;
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
            b1Var = q0.c(eVar, wVar);
        } else {
            b1Var = null;
        }
        if (str2 != null) {
            return new qo.a1(str, str2, b1Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qo.a1 a1Var = (qo.a1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, a1Var.b);
        qo.b1 b1Var = a1Var.c;
        if (b1Var != null) {
            q0.d(fVar, wVar, b1Var);
        }
    }
}
