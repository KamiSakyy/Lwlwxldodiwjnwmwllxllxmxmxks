package eo0;

import java.util.List;
import jn0.w60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yt implements aaShadow.a {
    public static final yt a = new yt();
    public static final List b = sy.d0Shadow.o(new String[]{"hasNextPage", "endCursor", "hasPreviousPage"});

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
            return new w60(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w60 w60Var = (w60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w60Var, "value");
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(w60Var.a, bVar, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, w60Var.b);
        fVar.z0("hasPreviousPage");
        bVar.b(fVar, wVar, Boolean.valueOf(w60Var.c));
    }
}
