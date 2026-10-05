package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class bj implements aa.a {
    public static final List a = x61.l.r(new String[]{"entries", "id"});

    public static u10.vr c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(zi.a, false))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new u10.vr(list, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.vr vrVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vrVar, "value");
        fVar.z0("entries");
        aa.c.b(aa.c.a(aa.c.c(zi.a, false))).b(fVar, wVar, vrVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, vrVar.b);
    }
}
