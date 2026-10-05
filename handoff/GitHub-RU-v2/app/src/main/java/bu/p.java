package bu;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "entries", "configuration", "nextEntryEstimatedTimeToMerge", "__typename"});

    public static m c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        l lVar = null;
        k kVar = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                lVar = (l) aa.c.b(aa.c.c(o.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                kVar = (k) aa.c.b(aa.c.c(n.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                num = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
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
            return new m(str, lVar, kVar, num, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, m mVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("entries");
        aa.c.b(aa.c.c(o.a, false)).b(fVar, wVar, mVar.b);
        fVar.z0("configuration");
        aa.c.b(aa.c.c(n.a, false)).b(fVar, wVar, mVar.c);
        fVar.z0("nextEntryEstimatedTimeToMerge");
        aa.c.b(tp.a.a).b(fVar, wVar, mVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, mVar.e);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
