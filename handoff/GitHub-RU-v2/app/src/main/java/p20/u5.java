package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u5 implements aa.a {
    public static final u5 a = new u5();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.w8 w8Var;
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
            w8Var = v5.c(eVar, wVar);
        } else {
            w8Var = null;
        }
        if (str2 != null) {
            return new u10.v8(str, str2, w8Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.v8 v8Var = (u10.v8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v8Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v8Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v8Var.b);
        u10.w8 w8Var = v8Var.c;
        if (w8Var != null) {
            v5.d(fVar, wVar, w8Var);
        }
    }
}
