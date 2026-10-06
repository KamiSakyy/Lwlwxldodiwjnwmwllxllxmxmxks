package p20;

import java.util.List;
import u10.wa0;
import u10.xa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aw implements aaShadow.a {
    public static final aw a = new aw();
    public static final List b = sy.d0Shadow.o("repositories", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wa0 wa0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wa0Var = (wa0) aa.c.c(zv.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (wa0Var == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new xa0(wa0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xa0 xa0Var = (xa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xa0Var, "value");
        fVar.z0("repositories");
        aa.c.c(zv.a, false).b(fVar, wVar, xa0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xa0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xa0Var.c);
    }
}
