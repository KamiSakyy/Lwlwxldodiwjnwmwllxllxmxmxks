package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class fa implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static u10.cf c(ea.e eVar, aa.w wVar) {
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
        k70.q c = k70.r.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.cf(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.cf cfVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cfVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cfVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cfVar.b);
        List list = k70.r.a;
        k70.r.d(fVar, wVar, cfVar.c);
    }
}
