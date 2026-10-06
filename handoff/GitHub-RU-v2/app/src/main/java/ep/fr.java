package ep;

import java.util.List;
import jo.y20;
import jo.z20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fr implements aaShadow.a {
    public static final fr a = new fr();
    public static final List b = sy.d0Shadow.o("id", "mergeQueue", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        y20 y20Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                y20Var = (y20) aa.c.b(aa.c.c(erShadow.a, false)).a(eVar, wVar);
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
            return new z20(str, y20Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z20 z20Var = (z20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z20Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z20Var.a);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(erShadow.a, false)).b(fVar, wVar, z20Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z20Var.c);
    }
}
