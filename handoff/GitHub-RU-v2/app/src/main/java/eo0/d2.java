package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 implements aaShadow.a {
    public static final d2 a = new d2();
    public static final List b = sy.d0Shadow.o(new String[]{"hasNextPage", "hasPreviousPage", "endCursor"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasNextPage");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new jn0.q3(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.q3 q3Var = (jn0.q3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q3Var, "value");
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(q3Var.a, bVar, fVar, wVar, "hasPreviousPage");
        jo.f4Shadow.C(q3Var.b, bVar, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, q3Var.c);
    }
}
