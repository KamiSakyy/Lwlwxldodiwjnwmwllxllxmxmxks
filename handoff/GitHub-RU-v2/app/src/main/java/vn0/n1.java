package vn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 implements aa.a {
    public static final n1 a = new n1();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "repository", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        l1 l1Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                l1Var = (l1) aa.c.c(q1.a, false).a(eVar, wVar);
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
        if (l1Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str2 != null) {
            return new i1(str, l1Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i1 i1Var = (i1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i1Var.a);
        fVar.z0("repository");
        aa.c.c(q1.a, false).b(fVar, wVar, i1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i1Var.c);
    }
}
