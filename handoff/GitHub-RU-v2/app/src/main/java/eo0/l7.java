package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l7 implements aaShadow.a {
    public static final l7 a = new l7();
    public static final List b = sy.d0.o(new String[]{"id", "discussion", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.ab abVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                abVar = (jn0.ab) aa.c.b(aa.c.c(j7.a, false)).a(eVar, wVar);
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
            return new jn0.cb(str, abVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.cb cbVar = (jn0.cb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cbVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cbVar.a);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(j7.a, false)).b(fVar, wVar, cbVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cbVar.c);
    }
}
