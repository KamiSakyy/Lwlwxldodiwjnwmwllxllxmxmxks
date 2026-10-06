package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ia implements aaShadow.a {
    public static final ia a = new ia();
    public static final List b = sy.d0.o(new String[]{"repository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.lf lfVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                lfVar = (jn0.lf) aa.c.b(aa.c.c(ja.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.kf(lfVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.kf kfVar = (jn0.kf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kfVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ja.a, true)).b(fVar, wVar, kfVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kfVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, kfVar.c);
    }
}
