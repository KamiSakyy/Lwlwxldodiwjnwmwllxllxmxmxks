package tz;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f5 implements aa.a {
    public static final f5 a = new f5();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        y4 y4Var;
        x4 x4Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
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
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            y4Var = e5.c(eVar, wVar);
        } else {
            y4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            x4Var = d5.c(eVar, wVar);
        } else {
            x4Var = null;
        }
        if (str2 != null) {
            return new z4(str, str2, y4Var, x4Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z4 z4Var = (z4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, z4Var.b);
        y4 y4Var = z4Var.c;
        if (y4Var != null) {
            e5.d(fVar, wVar, y4Var);
        }
        x4 x4Var = z4Var.d;
        if (x4Var != null) {
            d5.d(fVar, wVar, x4Var);
        }
    }
}
