package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n7 implements aaShadow.a {
    public static final n7 a = new n7();
    public static final List b = sy.d0Shadow.o(new String[]{"node", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ib ibVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ibVar = (jn0.ib) aa.c.b(aa.c.c(p7.a, true)).a(eVar, wVar);
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
            return new jn0.gb(ibVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.gb gbVar = (jn0.gb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gbVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(p7.a, true)).b(fVar, wVar, gbVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gbVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gbVar.c);
    }
}
