package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements aa.a {
    public static final u a = new u();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        rz.h0 h0Var;
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
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2View"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            h0Var = v.c(eVar, wVar);
        } else {
            h0Var = null;
        }
        if (str2 != null) {
            return new rz.g0(str, str2, h0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.g0 g0Var = (rz.g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, g0Var.b);
        rz.h0 h0Var = g0Var.c;
        if (h0Var != null) {
            v.d(fVar, wVar, h0Var);
        }
    }
}
