package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ba implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "file"});

    public static jn0.ye c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.we weVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                weVar = (jn0.we) aa.c.b(aa.c.c(z9.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new jn0.ye(str, weVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.ye yeVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yeVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, yeVar.a);
        fVar.z0("file");
        aa.c.b(aa.c.c(z9.a, false)).b(fVar, wVar, yeVar.b);
    }
}
