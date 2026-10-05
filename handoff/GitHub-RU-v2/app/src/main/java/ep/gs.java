package ep;

import java.util.List;
import jo.l40;
import jo.o40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gs implements aa.a {
    public static final gs a = new gs();
    public static final List b = sy.d0.o("issue", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l40 l40Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l40Var = (l40) aa.c.c(ds.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (l40Var == null) {
            k41.b.B(eVar, "issue");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new o40(l40Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o40 o40Var = (o40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o40Var, "value");
        fVar.z0("issue");
        aa.c.c(ds.a, true).b(fVar, wVar, o40Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o40Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, o40Var.c);
    }
}
