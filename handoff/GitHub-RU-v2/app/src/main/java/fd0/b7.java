package fd0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b7 implements aa.a {
    public static final b7 a = new b7();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.pa paVar;
        yf0.d0 d0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
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
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            paVar = c7.c(eVar, wVar);
        } else {
            paVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            d0Var = yf0.e0.c(eVar, wVar);
        } else {
            d0Var = null;
        }
        if (str2 != null) {
            return new kc0.oa(str, str2, paVar, d0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.oa oaVar = (kc0.oa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oaVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oaVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, oaVar.b);
        kc0.pa paVar = oaVar.c;
        if (paVar != null) {
            c7.d(fVar, wVar, paVar);
        }
        yf0.d0 d0Var = oaVar.d;
        if (d0Var != null) {
            yf0.e0.d(fVar, wVar, d0Var);
        }
    }
}
