package p20;

import java.util.List;
import u10.va0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yv implements aaShadow.a {
    public static final yv a = new yv();
    public static final List b = sy.d0Shadow.o("hasNextPage", "hasPreviousPage", "endCursor");

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
            return new va0(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        va0 va0Var = (va0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(va0Var, "value");
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(va0Var.a, bVar, fVar, wVar, "hasPreviousPage");
        jo.f4Shadow.C(va0Var.b, bVar, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, va0Var.c);
    }
}
