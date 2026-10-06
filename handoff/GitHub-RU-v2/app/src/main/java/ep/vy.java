package ep;

import java.util.List;
import jo.he0;
import jo.oe0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vy implements aaShadow.a {
    public static final vy a = new vy();
    public static final List b = sy.d0Shadow.o("id", "refUpdateRule", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        oe0 oe0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                oe0Var = (oe0) aa.c.b(aa.c.c(cz.a, false)).a(eVar, wVar);
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
            return new he0(str, oe0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        he0 he0Var = (he0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(he0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, he0Var.a);
        fVar.z0("refUpdateRule");
        aa.c.b(aa.c.c(cz.a, false)).b(fVar, wVar, he0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, he0Var.c);
    }
}
