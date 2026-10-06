package eo0;

import java.util.List;
import jn0.i50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ts implements aaShadow.a {
    public static final ts a = new ts();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        uu0.k3 c = uu0.r3.c(eVar, wVar);
        eVar.s0();
        uu0.o c2 = uu0.t.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new i50(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i50 i50Var = (i50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i50Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i50Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, i50Var.b);
        List list = uu0.r3.a;
        uu0.r3.d(fVar, wVar, i50Var.c);
        List list2 = uu0.t.a;
        uu0.t.d(fVar, wVar, i50Var.d);
    }
}
