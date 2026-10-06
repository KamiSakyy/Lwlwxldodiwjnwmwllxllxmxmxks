package eo0;

import java.util.List;
import jn0.ia0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cw implements aaShadow.a {
    public static final cw a = new cw();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "url"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        yp0.c c = yp0.e.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new ia0(str, str2, str3, c);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ia0 ia0Var = (ia0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ia0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ia0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ia0Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, ia0Var.c);
        List list = yp0.e.a;
        yp0.e.d(fVar, wVar, ia0Var.d);
    }
}
