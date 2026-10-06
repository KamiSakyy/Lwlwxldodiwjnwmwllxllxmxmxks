package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class na implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "file"});

    public static jn0.rf c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.pf pfVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                pfVar = (jn0.pf) aa.c.b(aa.c.c(la.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new jn0.rf(str, pfVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.rf rfVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rfVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, rfVar.a);
        fVar.z0("file");
        aa.c.b(aa.c.c(la.a, false)).b(fVar, wVar, rfVar.b);
    }
}
