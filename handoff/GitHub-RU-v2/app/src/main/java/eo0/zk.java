package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zk implements aa.a {
    public static final zk a = new zk();
    public static final List b = sy.d0.o(new String[]{"id", "parent", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.fu fuVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                fuVar = (jn0.fu) aa.c.b(aa.c.c(wk.a, false)).a(eVar, wVar);
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
            return new jn0.iu(str, fuVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.iu iuVar = (jn0.iu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iuVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iuVar.a);
        fVar.z0("parent");
        aa.c.b(aa.c.c(wk.a, false)).b(fVar, wVar, iuVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, iuVar.c);
    }
}
