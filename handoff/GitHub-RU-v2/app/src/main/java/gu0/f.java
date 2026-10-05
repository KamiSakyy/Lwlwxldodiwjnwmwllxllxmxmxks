package gu0;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.o(new String[]{"__typename", "id", "viewerCanReact", "reactionGroups"});

    public static c c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Boolean bool = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.c(g.a, false))).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool != null) {
            return new c(str, str2, list, bool.booleanValue());
        }
        k41.b.B(eVar, "viewerCanReact");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("viewerCanReact");
        f4.C(cVar.c, aa.c.f, fVar, wVar, "reactionGroups");
        aa.c.b(aa.c.a(aa.c.c(g.a, false))).b(fVar, wVar, cVar.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, w wVar, Object obj) {
        d(fVar, wVar, (c) obj);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
