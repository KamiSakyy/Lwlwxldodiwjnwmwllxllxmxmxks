package ep;

import java.util.List;
import jo.j70;
import jo.k70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gu implements aaShadow.a {
    public static final gu a = new gu();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k70 k70Var;
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
        if (m71.a.v(m71.a.O(new String[]{"Organization", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            k70Var = hu.c(eVar, wVar);
        } else {
            k70Var = null;
        }
        if (str2 != null) {
            return new j70(str, str2, k70Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j70 j70Var = (j70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j70Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j70Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, j70Var.b);
        k70 k70Var = j70Var.c;
        if (k70Var != null) {
            hu.d(fVar, wVar, k70Var);
        }
    }
}
