package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t8 implements aa.a {
    public static final t8 a = new t8();
    public static final List b = sy.d0.o(new String[]{"id", "comments", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        m8 m8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m8Var = (m8) aa.c.c(s8.a, false).a(eVar, wVar);
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
        if (m8Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new n8(str, m8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n8 n8Var = (n8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n8Var.a);
        fVar.z0("comments");
        aa.c.c(s8.a, false).b(fVar, wVar, n8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n8Var.c);
    }
}
