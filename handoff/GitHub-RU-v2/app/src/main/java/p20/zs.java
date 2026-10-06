package p20;

import java.util.List;
import u10.c60;
import u10.g60;
import u10.h60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zs implements aaShadow.a {
    public static final zs a = new zs();
    public static final List b = sy.d0Shadow.o("column", "project", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c60 c60Var = null;
        h60 h60Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                c60Var = (c60) aa.c.b(aa.c.c(ws.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                h60Var = (h60) aa.c.c(at.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (h60Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new g60(c60Var, h60Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g60 g60Var = (g60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g60Var, "value");
        fVar.z0("column");
        aa.c.b(aa.c.c(ws.a, false)).b(fVar, wVar, g60Var.a);
        fVar.z0("project");
        aa.c.c(at.a, false).b(fVar, wVar, g60Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g60Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, g60Var.d);
    }
}
