package eo0;

import java.util.List;
import jn0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class or implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static n30 c(ea.e eVar, aa.w wVar) {
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
        uu0.k3 c = uu0.r3.c(eVar, wVar);
        eVar.s0();
        uu0.o c2 = uu0.t.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new n30(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n30 n30Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n30Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n30Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, n30Var.b);
        List list = uu0.r3.a;
        uu0.r3.d(fVar, wVar, n30Var.c);
        List list2 = uu0.t.a;
        uu0.t.d(fVar, wVar, n30Var.d);
    }
}
