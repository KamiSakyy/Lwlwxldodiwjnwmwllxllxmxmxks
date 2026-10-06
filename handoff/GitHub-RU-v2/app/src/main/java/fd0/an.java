package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class an implements aaShadow.a {
    public static final an a = new an();
    public static final List b = sy.d0.o(new String[]{"id", "mergeQueue", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.ix ixVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ixVar = (kc0.ix) aa.c.b(aa.c.c(zm.a, false)).a(eVar, wVar);
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
            return new kc0.jx(str, ixVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.jx jxVar = (kc0.jx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jxVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jxVar.a);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(zm.a, false)).b(fVar, wVar, jxVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, jxVar.c);
    }
}
