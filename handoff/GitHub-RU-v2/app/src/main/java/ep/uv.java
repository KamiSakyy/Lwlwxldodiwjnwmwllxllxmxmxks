package ep;

import java.util.List;
import jo.k90;
import jo.l90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uv implements aa.a {
    public static final uv a = new uv();
    public static final List b = sy.d0.o("topRepositories", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k90 k90Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k90Var = (k90) aa.c.c(tv.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (k90Var == null) {
            k41.b.B(eVar, "topRepositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new l90(k90Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l90 l90Var = (l90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l90Var, "value");
        fVar.z0("topRepositories");
        aa.c.c(tv.a, false).b(fVar, wVar, l90Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l90Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l90Var.c);
    }
}
