package ep;

import java.util.List;
import jo.ai0;
import jo.bi0;
import jo.zh0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j10 implements aa.a {
    public static final j10 a = new j10();
    public static final List b = sy.d0.o("user", "organization", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bi0 bi0Var = null;
        ai0 ai0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bi0Var = (bi0) aa.c.b(aa.c.c(l10.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                ai0Var = (ai0) aa.c.b(aa.c.c(k10.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new zh0(bi0Var, ai0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zh0 zh0Var = (zh0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zh0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(l10.a, true)).b(fVar, wVar, zh0Var.a);
        fVar.z0("organization");
        aa.c.b(aa.c.c(k10.a, true)).b(fVar, wVar, zh0Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zh0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, zh0Var.d);
    }
}
