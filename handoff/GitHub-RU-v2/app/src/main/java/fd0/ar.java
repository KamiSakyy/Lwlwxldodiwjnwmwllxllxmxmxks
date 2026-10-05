package fd0;

import java.util.List;
import kc0.d30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ar implements aa.a {
    public static final ar a = new ar();
    public static final List b = sy.d0.o(new String[]{"hasNextPage", "endCursor", "hasPreviousPage"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasNextPage");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new d30(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d30 d30Var = (d30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d30Var, "value");
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4.C(d30Var.a, bVar, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, d30Var.b);
        fVar.z0("hasPreviousPage");
        bVar.b(fVar, wVar, Boolean.valueOf(d30Var.c));
    }
}
