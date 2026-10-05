package eo0;

import java.util.List;
import jn0.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wv implements aa.a {
    public static final wv a = new wv();
    public static final List b = sy.d0.o(new String[]{"id", "title", "__typename"});

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
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (str3 != null) {
            return new y90(str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y90 y90Var = (y90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y90Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y90Var.a);
        fVar.z0("title");
        bVar.b(fVar, wVar, y90Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y90Var.c);
    }
}
