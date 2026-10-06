package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ma implements aaShadow.a {
    public static final ma a = new ma();
    public static final List b = sy.d0.o("endCursor", "hasNextPage", "hasPreviousPage");

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
            return new jo.pf(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.pf pfVar = (jo.pf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pfVar, "value");
        fVar.z0("endCursor");
        aa.c.i.b(fVar, wVar, pfVar.a);
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4.C(pfVar.b, bVar, fVar, wVar, "hasPreviousPage");
        bVar.b(fVar, wVar, Boolean.valueOf(pfVar.c));
    }
}
