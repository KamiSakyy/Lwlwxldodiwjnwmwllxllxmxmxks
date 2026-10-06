package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dm implements aaShadow.a {
    public static final dm a = new dm();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "entriesCount", "entries", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.zv zvVar = null;
        jn0.yv yvVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                zvVar = (jn0.zv) aa.c.b(aa.c.c(cm.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                yvVar = (jn0.yv) aa.c.b(aa.c.c(bm.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new jn0.aw(str, zvVar, yvVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.aw awVar = (jn0.aw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(awVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, awVar.a);
        fVar.z0("entriesCount");
        aa.c.b(aa.c.c(cm.a, false)).b(fVar, wVar, awVar.b);
        fVar.z0("entries");
        aa.c.b(aa.c.c(bm.a, false)).b(fVar, wVar, awVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, awVar.d);
    }
}
