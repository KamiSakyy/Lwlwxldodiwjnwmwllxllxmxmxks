package cw;

import aa.w;
import bw.f;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.o("repositoryOwner", "id", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        f fVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fVar = (f) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
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
            return new bw.b(fVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        bw.b bVar = (bw.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("repositoryOwner");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, bVar.a);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, bVar.c);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
