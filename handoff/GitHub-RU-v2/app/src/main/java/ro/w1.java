package ro;

import java.util.List;
import qo.x2;
import qo.y2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w1 implements aa.a {
    public static final w1 a = new w1();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        y2 y2Var;
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
            y2Var = x1.c(eVar, wVar);
        } else {
            y2Var = null;
        }
        if (str2 != null) {
            return new x2(str, str2, y2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x2 x2Var = (x2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, x2Var.b);
        y2 y2Var = x2Var.c;
        if (y2Var != null) {
            x1.d(fVar, wVar, y2Var);
        }
    }
}
