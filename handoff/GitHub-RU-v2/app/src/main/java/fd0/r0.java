package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements aaShadow.a {
    public static final r0 a = new r0();
    public static final List b = sy.d0.o(new String[]{"id", "comments", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.f1 f1Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                f1Var = (kc0.f1) aa.c.c(n0.a, false).a(eVar, wVar);
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
        if (f1Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new kc0.k1(str, f1Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.k1 k1Var = (kc0.k1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k1Var.a);
        fVar.z0("comments");
        aa.c.c(n0.a, false).b(fVar, wVar, k1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k1Var.c);
    }
}
