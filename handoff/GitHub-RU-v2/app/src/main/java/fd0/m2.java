package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 implements aaShadow.a {
    public static final m2 a = new m2();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.d4 d4Var;
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
            d4Var = o2.c(eVar, wVar);
        } else {
            d4Var = null;
        }
        if (str2 != null) {
            return new kc0.b4(str, str2, d4Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.b4 b4Var = (kc0.b4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, b4Var.b);
        kc0.d4 d4Var = b4Var.c;
        if (d4Var != null) {
            o2.d(fVar, wVar, d4Var);
        }
    }
}
