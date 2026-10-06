package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r6 implements aa.a {
    public static final r6 a = new r6();
    public static final List b = sy.d0Shadow.o(new String[]{"column", "project", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p4 p4Var = null;
        m5 m5Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                p4Var = (p4) aa.c.b(aa.c.c(e6.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                m5Var = (m5) aa.c.c(b7.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (m5Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new c5(p4Var, m5Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c5 c5Var = (c5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c5Var, "value");
        fVar.z0("column");
        aa.c.b(aa.c.c(e6.a, false)).b(fVar, wVar, c5Var.a);
        fVar.z0("project");
        aa.c.c(b7.a, false).b(fVar, wVar, c5Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c5Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c5Var.d);
    }
}
