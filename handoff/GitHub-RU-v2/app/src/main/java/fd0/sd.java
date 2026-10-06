package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sd implements aaShadow.a {
    public static final sd a = new sd();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.pk pkVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
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
            pkVar = td.c(eVar, wVar);
        } else {
            pkVar = null;
        }
        if (str2 != null) {
            return new kc0.ok(str, str2, pkVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ok okVar = (kc0.ok) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(okVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, okVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, okVar.b);
        kc0.pk pkVar = okVar.c;
        if (pkVar != null) {
            td.d(fVar, wVar, pkVar);
        }
    }
}
