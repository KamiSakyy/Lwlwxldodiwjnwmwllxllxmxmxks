package fd0;

import java.util.List;
import kc0.p70;
import kc0.w70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xt implements aaShadow.a {
    public static final xt a = new xt();
    public static final List b = sy.d0.o(new String[]{"id", "refUpdateRule", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        w70 w70Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                w70Var = (w70) aa.c.b(aa.c.c(eu.a, false)).a(eVar, wVar);
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
            return new p70(str, w70Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p70 p70Var = (p70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p70Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p70Var.a);
        fVar.z0("refUpdateRule");
        aa.c.b(aa.c.c(eu.a, false)).b(fVar, wVar, p70Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p70Var.c);
    }
}
