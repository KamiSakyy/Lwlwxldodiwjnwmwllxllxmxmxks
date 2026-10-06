package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yb implements aaShadow.a {
    public static final yb a = new yb();
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
            return new jo.ph(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ph phVar = (jo.ph) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(phVar, "value");
        fVar.z0("hasNextPage");
        jo.f4.C(phVar.a, aa.c.f, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, phVar.b);
    }
}
