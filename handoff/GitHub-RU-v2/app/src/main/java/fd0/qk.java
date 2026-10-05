package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qk implements aa.a {
    public static final qk a = new qk();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.au auVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            auVar = rk.c(eVar, wVar);
        } else {
            auVar = null;
        }
        if (str2 != null) {
            return new kc0.zt(str, str2, auVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.zt ztVar = (kc0.zt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ztVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ztVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ztVar.b);
        kc0.au auVar = ztVar.c;
        if (auVar != null) {
            rk.d(fVar, wVar, auVar);
        }
    }
}
