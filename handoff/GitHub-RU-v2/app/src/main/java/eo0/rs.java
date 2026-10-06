package eo0;

import java.util.List;
import jn0.e50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rs implements aaShadow.a {
    public static final rs a = new rs();
    public static final List b = sy.d0Shadow.o(new String[]{"name", "code"});

    public final Object a(ea.e eVar, aa.w wVar) {
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
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 != null) {
            return new e50(str, str2);
        }
        k41.b.B(eVar, "code");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e50 e50Var = (e50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e50Var, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e50Var.a);
        fVar.z0("code");
        bVar.b(fVar, wVar, e50Var.b);
    }
}
