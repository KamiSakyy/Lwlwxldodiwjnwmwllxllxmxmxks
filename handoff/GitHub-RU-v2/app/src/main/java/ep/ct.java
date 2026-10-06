package ep;

import java.util.List;
import jo.s50;
import jo.w50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ctShadow implements aaShadow.a {
    public static final ctShadow a = new ctShadow();
    public static final List b = sy.d0.o("search", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w50 w50Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                w50Var = (w50) aa.c.c(gtShadow.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (w50Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new s50(w50Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s50 s50Var = (s50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s50Var, "value");
        fVar.z0("search");
        aa.c.c(gtShadow.a, false).b(fVar, wVar, s50Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s50Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, s50Var.c);
    }
}
