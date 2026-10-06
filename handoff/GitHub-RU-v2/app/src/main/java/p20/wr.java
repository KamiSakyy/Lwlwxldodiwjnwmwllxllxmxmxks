package p20;

import java.util.List;
import u10.m40;
import u10.r40;
import u10.s40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wr implements aaShadow.a {
    public static final wr a = new wr();
    public static final List b = sy.d0Shadow.o("column", "project", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m40 m40Var = null;
        s40 s40Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                m40Var = (m40) aa.c.b(aa.c.c(sr.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                s40Var = (s40) aa.c.c(xr.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (s40Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new r40(m40Var, s40Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r40 r40Var = (r40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r40Var, "value");
        fVar.z0("column");
        aa.c.b(aa.c.c(sr.a, false)).b(fVar, wVar, r40Var.a);
        fVar.z0("project");
        aa.c.c(xr.a, false).b(fVar, wVar, r40Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r40Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r40Var.d);
    }
}
