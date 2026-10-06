package fd0;

import java.util.List;
import kc0.k10;
import kc0.l10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class up implements aaShadow.a {
    public static final up a = new up();
    public static final List b = sy.d0Shadow.o(new String[]{"topRepositories", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k10 k10Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k10Var = (k10) aa.c.c(tp.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (k10Var == null) {
            k41.b.B(eVar, "topRepositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new l10(k10Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l10 l10Var = (l10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l10Var, "value");
        fVar.z0("topRepositories");
        aa.c.c(tp.a, false).b(fVar, wVar, l10Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l10Var.c);
    }
}
