package uc0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import tc0.p;
import tc0.q;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, w wVar) {
        q qVar;
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
            qVar = j.c(eVar, wVar);
        } else {
            qVar = null;
        }
        if (str2 != null) {
            return new p(str, str2, qVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        p pVar = (p) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(pVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, pVar.b);
        q qVar = pVar.c;
        if (qVar != null) {
            j.d(fVar, wVar, qVar);
        }
    }
}
