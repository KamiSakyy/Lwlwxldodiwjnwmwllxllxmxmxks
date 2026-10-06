package ep;

import java.util.List;
import jo.a50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qs implements aaShadow.a {
    public static final qs a = new qs();
    public static final List b = sy.d0.o("hasNextPage", "endCursor");

    public final Object a(ea.e eVar, aa.w wVar) {
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
            return new a50(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a50 a50Var = (a50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a50Var, "value");
        fVar.z0("hasNextPage");
        jo.f4.C(a50Var.a, aa.c.f, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, a50Var.b);
    }
}
