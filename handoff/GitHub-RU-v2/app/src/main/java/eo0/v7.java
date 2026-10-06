package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v7 implements aaShadow.a {
    public static final v7 a = new v7();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "discussion", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.pb pbVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                pbVar = (jn0.pb) aa.c.b(aa.c.c(u7.a, true)).a(eVar, wVar);
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
            return new jn0.qb(str, pbVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qb qbVar = (jn0.qb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qbVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qbVar.a);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(u7.a, true)).b(fVar, wVar, qbVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qbVar.c);
    }
}
