package fd0;

import java.util.List;
import kc0.j40;
import kc0.o40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tr implements aaShadow.a {
    public static final tr a = new tr();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "replyTo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        o40 o40Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                o40Var = (o40) aa.c.b(aa.c.c(xr.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        yf0.i c = yf0.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new j40(str, str2, o40Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j40 j40Var = (j40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j40Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j40Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, j40Var.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(xr.a, false)).b(fVar, wVar, j40Var.c);
        List list = yf0.l.a;
        yf0.l.d(fVar, wVar, j40Var.d);
    }
}
