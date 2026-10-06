package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u2 implements aaShadow.a {
    public static final u2 a = new u2();
    public static final List b = sy.d0.o("workflow", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.i4 i4Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i4Var = (u10.i4) aa.c.c(t2.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (i4Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.j4(i4Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.j4 j4Var = (u10.j4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j4Var, "value");
        fVar.z0("workflow");
        aa.c.c(t2.a, false).b(fVar, wVar, j4Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j4Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j4Var.c);
    }
}
