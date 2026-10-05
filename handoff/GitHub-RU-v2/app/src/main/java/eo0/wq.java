package eo0;

import java.util.List;
import jn0.p20;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class wq implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static p20 c(ea.e eVar, aa.w wVar) {
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
        ur0.u uVar = ur0.u.a;
        ur0.o c = ur0.u.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new p20(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, p20 p20Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p20Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p20Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p20Var.b);
        ur0.u uVar = ur0.u.a;
        ur0.u.d(fVar, wVar, p20Var.c);
    }
}
