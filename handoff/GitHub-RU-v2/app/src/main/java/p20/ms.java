package p20;

import java.util.List;
import u10.r50;
import u10.w50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ms implements aaShadow.a {
    public static final ms a = new ms();
    public static final List b = sy.d0Shadow.o("id", "refUpdateRule", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        w50 w50Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                w50Var = (w50) aa.c.b(aa.c.c(rs.a, false)).a(eVar, wVar);
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
            return new r50(str, w50Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r50 r50Var = (r50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r50Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r50Var.a);
        fVar.z0("refUpdateRule");
        aa.c.b(aa.c.c(rs.a, false)).b(fVar, wVar, r50Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r50Var.c);
    }
}
