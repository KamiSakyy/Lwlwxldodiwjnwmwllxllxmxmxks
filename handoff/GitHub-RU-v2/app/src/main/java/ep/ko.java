package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ko implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"repositories", "id"});

    public static jo.cz c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.gz gzVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                gzVar = (jo.gz) aa.c.c(oo.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (gzVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str != null) {
            return new jo.cz(gzVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.cz czVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(czVar, "value");
        fVar.z0("repositories");
        aa.c.c(oo.a, false).b(fVar, wVar, czVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, czVar.b);
    }
}
