package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c6 implements aa.a {
    public static final c6 a = new c6();
    public static final List b = sy.d0Shadow.o("column", "project", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e4 e4Var = null;
        z4 z4Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                e4Var = (e4) aa.c.b(aa.c.c(r5.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                z4Var = (z4) aa.c.c(m6.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (z4Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new p4(e4Var, z4Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p4 p4Var = (p4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p4Var, "value");
        fVar.z0("column");
        aa.c.b(aa.c.c(r5.a, false)).b(fVar, wVar, p4Var.a);
        fVar.z0("project");
        aa.c.c(m6.a, false).b(fVar, wVar, p4Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p4Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p4Var.d);
    }
}
