package ay;

import java.util.List;
import zx.p1;
import zx.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 implements aa.a {
    public static final w0 a = new w0();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        q1 q1Var;
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
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            q1Var = x0.c(eVar, wVar);
        } else {
            q1Var = null;
        }
        if (str2 != null) {
            return new p1(str, str2, q1Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p1 p1Var = (p1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p1Var.b);
        q1 q1Var = p1Var.c;
        if (q1Var != null) {
            x0.d(fVar, wVar, q1Var);
        }
    }
}
