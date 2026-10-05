package sc0;

import java.util.List;
import rc0.x1;
import rc0.y1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g1 implements aa.a {
    public static final g1 a = new g1();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        y1 y1Var;
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
            y1Var = h1.c(eVar, wVar);
        } else {
            y1Var = null;
        }
        if (str2 != null) {
            return new x1(str, str2, y1Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x1 x1Var = (x1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, x1Var.b);
        y1 y1Var = x1Var.c;
        if (y1Var != null) {
            h1.d(fVar, wVar, y1Var);
        }
    }
}
