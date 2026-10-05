package y70;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;
import x70.i;
import x70.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.o("__typename", "id");

    public final Object a(ea.e eVar, w wVar) {
        j jVar;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            jVar = g.c(eVar, wVar);
        } else {
            jVar = null;
        }
        if (str2 != null) {
            return new i(str, str2, jVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        i iVar = (i) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(iVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, iVar.b);
        j jVar = iVar.c;
        if (jVar != null) {
            g.d(fVar, wVar, jVar);
        }
    }
}
