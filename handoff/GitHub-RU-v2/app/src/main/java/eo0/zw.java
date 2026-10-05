package eo0;

import java.util.List;
import jn0.ac0;
import jn0.tb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zw implements aa.a {
    public static final zw a = new zw();
    public static final List b = sy.d0.o(new String[]{"id", "refUpdateRule", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ac0 ac0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ac0Var = (ac0) aa.c.b(aa.c.c(gx.a, false)).a(eVar, wVar);
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
            return new tb0(str, ac0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        tb0 tb0Var = (tb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tb0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tb0Var.a);
        fVar.z0("refUpdateRule");
        aa.c.b(aa.c.c(gx.a, false)).b(fVar, wVar, tb0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tb0Var.c);
    }
}
