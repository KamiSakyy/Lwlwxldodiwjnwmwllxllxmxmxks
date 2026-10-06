package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w9 implements aaShadow.a {
    public static final w9 a = new w9();
    public static final List b = sy.d0.o(new String[]{"endCursor", "hasNextPage", "hasPreviousPage"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
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
            return new jn0.re(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.re reVar = (jn0.re) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(reVar, "value");
        fVar.z0("endCursor");
        aa.c.i.b(fVar, wVar, reVar.a);
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4.C(reVar.b, bVar, fVar, wVar, "hasPreviousPage");
        bVar.b(fVar, wVar, Boolean.valueOf(reVar.c));
    }
}
