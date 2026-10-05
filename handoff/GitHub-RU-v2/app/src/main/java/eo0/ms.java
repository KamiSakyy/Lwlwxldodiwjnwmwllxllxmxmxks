package eo0;

import java.util.List;
import jn0.x40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ms implements aa.a {
    public static final ms a = new ms();
    public static final List b = sy.d0.o(new String[]{"__typename", "isArchived", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        uu0.z4 c = uu0.b5.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isArchived");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new x40(str, booleanValue, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x40 x40Var = (x40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x40Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x40Var.a);
        fVar.z0("isArchived");
        jo.f4.C(x40Var.b, aa.c.f, fVar, wVar, "id");
        bVar.b(fVar, wVar, x40Var.c);
        List list = uu0.b5.a;
        uu0.b5.d(fVar, wVar, x40Var.d);
    }
}
