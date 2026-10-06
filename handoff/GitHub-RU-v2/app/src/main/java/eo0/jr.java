package eo0;

import java.util.List;
import jn0.g30;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class jr implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static g30 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        fw0.c1 c = fw0.d1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new g30(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g30 g30Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g30Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g30Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, g30Var.b);
        List list = fw0.d1.a;
        fw0.d1.d(fVar, wVar, g30Var.c);
    }
}
