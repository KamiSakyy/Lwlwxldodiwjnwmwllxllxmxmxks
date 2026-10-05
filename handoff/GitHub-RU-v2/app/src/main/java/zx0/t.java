package zx0;

import aa.w;
import java.util.List;
import jo.f4;
import sy.d0;
import yx0.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements aa.a {
    public static final t a = new t();
    public static final List b = d0.o(new String[]{"hasNextPage", "endCursor"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool != null) {
            return new a0(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        a0 a0Var = (a0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("hasNextPage");
        f4.C(a0Var.a, aa.c.f, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, a0Var.b);
    }
}
