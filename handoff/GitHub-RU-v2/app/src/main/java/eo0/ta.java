package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ta implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "history"});

    public static jn0.zf c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.xf xfVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                xfVar = (jn0.xf) aa.c.c(ra.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (xfVar != null) {
            return new jn0.zf(str, xfVar);
        }
        k41.b.B(eVar, "history");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.zf zfVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zfVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, zfVar.a);
        fVar.z0("history");
        aa.c.c(ra.a, false).b(fVar, wVar, zfVar.b);
    }
}
