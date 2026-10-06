package ep;

import java.util.List;
import jo.b50;
import jo.x40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ns implements aaShadow.a {
    public static final ns a = new ns();
    public static final List b = sy.d0Shadow.o("search", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b50 b50Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                b50Var = (b50) aa.c.c(rs.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (b50Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new x40(b50Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x40 x40Var = (x40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x40Var, "value");
        fVar.z0("search");
        aa.c.c(rs.a, false).b(fVar, wVar, x40Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x40Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x40Var.c);
    }
}
