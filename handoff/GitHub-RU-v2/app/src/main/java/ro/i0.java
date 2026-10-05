package ro;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements aa.a {
    public static final i0 a = new i0();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        qo.s0 s0Var;
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
            s0Var = j0.c(eVar, wVar);
        } else {
            s0Var = null;
        }
        if (str2 != null) {
            return new qo.r0(str, str2, s0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qo.r0 r0Var = (qo.r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, r0Var.b);
        qo.s0 s0Var = r0Var.c;
        if (s0Var != null) {
            j0.d(fVar, wVar, s0Var);
        }
    }
}
