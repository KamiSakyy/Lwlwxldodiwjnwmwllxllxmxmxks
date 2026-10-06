package e00;

import d00.f0;
import d00.g0;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.a {
    public static final y a = new y();
    public static final List b = d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        g0 g0Var;
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
            g0Var = z.c(eVar, wVar);
        } else {
            g0Var = null;
        }
        if (str2 != null) {
            return new f0(str, str2, g0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f0 f0Var = (f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, f0Var.b);
        g0 g0Var = f0Var.c;
        if (g0Var != null) {
            z.d(fVar, wVar, g0Var);
        }
    }
}
