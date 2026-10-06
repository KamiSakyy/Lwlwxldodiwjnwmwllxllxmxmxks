package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a6 implements aaShadow.a {
    public static final a6 a = new a6();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.e9 e9Var;
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
        if (m71.a.v(m71.a.O(new String[]{"CheckSuite"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            e9Var = b6.c(eVar, wVar);
        } else {
            e9Var = null;
        }
        if (str2 != null) {
            return new kc0.d9(str, str2, e9Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.d9 d9Var = (kc0.d9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d9Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d9Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, d9Var.b);
        kc0.e9 e9Var = d9Var.c;
        if (e9Var != null) {
            b6.d(fVar, wVar, e9Var);
        }
    }
}
