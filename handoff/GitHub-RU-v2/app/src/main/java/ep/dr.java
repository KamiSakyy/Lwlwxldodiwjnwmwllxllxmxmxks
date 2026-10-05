package ep;

import java.util.List;
import jo.x20;
import jo.z20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dr implements aa.a {
    public static final dr a = new dr();
    public static final List b = sy.d0.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z20 z20Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                z20Var = (z20) aa.c.b(aa.c.c(fr.a, false)).a(eVar, wVar);
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
            return new x20(z20Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x20 x20Var = (x20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x20Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(fr.a, false)).b(fVar, wVar, x20Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x20Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x20Var.c);
    }
}
