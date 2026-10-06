package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ak implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"repositories", "id"});

    public static u10.ct c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.gt gtVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                gtVar = (u10.gt) aa.c.c(ek.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (gtVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str != null) {
            return new u10.ct(gtVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ct ctVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ctVar, "value");
        fVar.z0("repositories");
        aa.c.c(ek.a, false).b(fVar, wVar, ctVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, ctVar.b);
    }
}
