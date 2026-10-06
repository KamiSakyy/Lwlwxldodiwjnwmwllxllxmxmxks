package p20;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v6 implements aaShadow.a {
    public static final v6 a = new v6();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.ha haVar;
        i50.c0 c0Var;
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
            haVar = w6.c(eVar, wVar);
        } else {
            haVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            c0Var = i50.d0.c(eVar, wVar);
        } else {
            c0Var = null;
        }
        if (str2 != null) {
            return new u10.ga(str, str2, haVar, c0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ga gaVar = (u10.ga) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gaVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gaVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, gaVar.b);
        u10.ha haVar = gaVar.c;
        if (haVar != null) {
            w6.d(fVar, wVar, haVar);
        }
        i50.c0 c0Var = gaVar.d;
        if (c0Var != null) {
            i50.d0.d(fVar, wVar, c0Var);
        }
    }
}
