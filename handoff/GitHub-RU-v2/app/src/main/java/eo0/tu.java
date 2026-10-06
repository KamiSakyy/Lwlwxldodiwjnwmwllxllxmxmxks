package eo0;

import java.util.List;
import jn0.g80;
import jn0.l80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tu implements aaShadow.a {
    public static final tu a = new tu();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "replyTo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        l80 l80Var = null;
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
                l80Var = (l80) aa.c.b(aa.c.c(xu.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        er0.i c = er0.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new g80(str, str2, l80Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g80 g80Var = (g80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g80Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g80Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, g80Var.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(xu.a, false)).b(fVar, wVar, g80Var.c);
        List list = er0.l.a;
        er0.l.d(fVar, wVar, g80Var.d);
    }
}
