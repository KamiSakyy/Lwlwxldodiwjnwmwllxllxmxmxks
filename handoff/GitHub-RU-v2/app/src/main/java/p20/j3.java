package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j3 implements aaShadow.a {
    public static final j3 a = new j3();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
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
        eVar.s0();
        g40.l1 c = g40.n1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.j5(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.j5 j5Var = (u10.j5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, j5Var.b);
        List list = g40.n1.a;
        g40.n1.d(fVar, wVar, j5Var.c);
    }
}
