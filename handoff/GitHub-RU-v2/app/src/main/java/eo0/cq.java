package eo0;

import java.util.List;
import jn0.i10;
import jn0.l10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cq implements aaShadow.a {
    public static final cq a = new cq();
    public static final List b = sy.d0.o(new String[]{"milestones", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i10 i10Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i10Var = (i10) aa.c.b(aa.c.c(zp.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new l10(i10Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l10 l10Var = (l10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l10Var, "value");
        fVar.z0("milestones");
        aa.c.b(aa.c.c(zp.a, false)).b(fVar, wVar, l10Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l10Var.c);
    }
}
