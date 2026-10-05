package ep;

import java.util.List;
import jo.uj0;
import jo.yj0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l20 implements aa.a {
    public static final l20 a = new l20();
    public static final List b = sy.d0.o("viewer", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        yj0 yj0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                yj0Var = (yj0) aa.c.c(p20.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (yj0Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new uj0(yj0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        uj0 uj0Var = (uj0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uj0Var, "value");
        fVar.z0("viewer");
        aa.c.c(p20.a, false).b(fVar, wVar, uj0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uj0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, uj0Var.c);
    }
}
