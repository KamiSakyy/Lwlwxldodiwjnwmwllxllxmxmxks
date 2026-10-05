package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b9 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "history"});

    public static u10.od c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.md mdVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                mdVar = (u10.md) aa.c.c(z8.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (mdVar != null) {
            return new u10.od(str, mdVar);
        }
        k41.b.B(eVar, "history");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.od odVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(odVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, odVar.a);
        fVar.z0("history");
        aa.c.c(z8.a, false).b(fVar, wVar, odVar.b);
    }
}
