package ah0;

import aa.w;
import java.util.List;
import java.util.Set;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o(new String[]{"__typename", "locked"});

    public static e c(ea.e eVar, w wVar) {
        c cVar;
        b bVar;
        a aVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        Boolean bool = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
                bool = bool;
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            cVar = k.c(eVar, wVar);
        } else {
            cVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            bVar = j.c(eVar, wVar);
        } else {
            bVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            aVar = i.c(eVar, wVar);
        } else {
            aVar = null;
        }
        Boolean bool2 = bool;
        if (bool2 != null) {
            return new e(str, bool2.booleanValue(), cVar, bVar, aVar);
        }
        k41.b.B(eVar, "locked");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, e eVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, eVar.a);
        fVar.z0("locked");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(eVar.b));
        c cVar = eVar.c;
        if (cVar != null) {
            k.d(fVar, wVar, cVar);
        }
        b bVar = eVar.d;
        if (bVar != null) {
            j.d(fVar, wVar, bVar);
        }
        a aVar = eVar.e;
        if (aVar != null) {
            i.d(fVar, wVar, aVar);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, w wVar, Object obj) {
        d(fVar, wVar, (e) obj);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
