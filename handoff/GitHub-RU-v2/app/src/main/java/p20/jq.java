package p20;

import java.util.List;
import u10.l20;
import u10.q20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jq implements aaShadow.a {
    public static final jq a = new jq();
    public static final List b = sy.d0.o("__typename", "id", "replyTo");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        q20 q20Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                q20Var = (q20) aa.c.b(aa.c.c(nq.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        i50.h c = i50.k.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new l20(str, str2, q20Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l20 l20Var = (l20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l20Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l20Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, l20Var.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(nq.a, false)).b(fVar, wVar, l20Var.c);
        List list = i50.k.a;
        i50.k.d(fVar, wVar, l20Var.d);
    }
}
