package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o3 implements aaShadow.a {
    public static final o3 a = new o3();
    public static final List b = sy.d0.o("id", "commit", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.j5 j5Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                j5Var = (u10.j5) aa.c.c(j3.a, true).a(eVar, wVar);
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
        if (j5Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str2 != null) {
            return new u10.p5(str, j5Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.p5 p5Var = (u10.p5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p5Var.a);
        fVar.z0("commit");
        aa.c.c(j3.a, true).b(fVar, wVar, p5Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p5Var.c);
    }
}
