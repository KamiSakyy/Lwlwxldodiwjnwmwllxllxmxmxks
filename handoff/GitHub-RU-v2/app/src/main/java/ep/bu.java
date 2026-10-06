package ep;

import java.util.List;
import jo.a70;
import jo.z60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class buShadow implements aaShadow.a {
    public static final buShadow a = new buShadow();
    public static final List b = sy.d0Shadow.o("topRepositories", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z60 z60Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                z60Var = (z60) aa.c.c(au.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (z60Var == null) {
            k41.b.B(eVar, "topRepositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new a70(z60Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a70 a70Var = (a70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a70Var, "value");
        fVar.z0("topRepositories");
        aa.c.c(au.a, false).b(fVar, wVar, a70Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a70Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, a70Var.c);
    }
}
