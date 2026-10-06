package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class xb implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"following", "followers"});

    public static jo.oh c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.kh khVar = null;
        jo.jh jhVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                khVar = (jo.kh) aa.c.c(tb.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                jhVar = (jo.jh) aa.c.c(sb.a, false).a(eVar, wVar);
            }
        }
        if (khVar == null) {
            k41.b.B(eVar, "following");
            throw null;
        }
        if (jhVar != null) {
            return new jo.oh(khVar, jhVar);
        }
        k41.b.B(eVar, "followers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.oh ohVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ohVar, "value");
        fVar.z0("following");
        aa.c.c(tb.a, false).b(fVar, wVar, ohVar.a);
        fVar.z0("followers");
        aa.c.c(sb.a, false).b(fVar, wVar, ohVar.b);
    }
}
