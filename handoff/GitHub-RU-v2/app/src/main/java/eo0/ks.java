package eo0;

import java.util.List;
import jn0.o40;
import jn0.t40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ks implements aaShadow.a {
    public static final ks a = new ks();
    public static final List b = sy.d0Shadow.o(new String[]{"dashboard", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        o40 o40Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                o40Var = (o40) aa.c.b(aa.c.c(fs.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new t40(o40Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t40 t40Var = (t40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t40Var, "value");
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(fs.a, false)).b(fVar, wVar, t40Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t40Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t40Var.c);
    }
}
