package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ha implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static u10.ef c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        w80.a2 c = w80.h2.c(eVar, wVar);
        eVar.s0();
        w80.h c2 = w80.m.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.ef(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ef efVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(efVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, efVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, efVar.b);
        List list = w80.h2.a;
        w80.h2.d(fVar, wVar, efVar.c);
        List list2 = w80.m.a;
        w80.m.d(fVar, wVar, efVar.d);
    }
}
