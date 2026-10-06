package ep;

import java.util.List;
import jo.z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class su implements aaShadow.a {
    public static final su a = new su();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        dw.r6 r6Var;
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
            dw.w6 w6Var = dw.w6.a;
            r6Var = dw.w6.c(eVar, wVar);
        } else {
            r6Var = null;
        }
        if (str2 != null) {
            return new z70(str, str2, r6Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z70 z70Var = (z70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z70Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z70Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, z70Var.b);
        dw.r6 r6Var = z70Var.c;
        if (r6Var != null) {
            dw.w6 w6Var = dw.w6.a;
            dw.w6.d(fVar, wVar, r6Var);
        }
    }
}
