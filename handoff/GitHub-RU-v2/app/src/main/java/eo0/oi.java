package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oi implements aaShadow.a {
    public static final oi a = new oi();
    public static final List b = sy.d0Shadow.o(new String[]{"user", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.jr jrVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                jrVar = (jn0.jr) aa.c.b(aa.c.c(ti.a, true)).a(eVar, wVar);
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
            return new jn0.er(jrVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.er erVar = (jn0.er) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(erVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(ti.a, true)).b(fVar, wVar, erVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, erVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, erVar.c);
    }
}
