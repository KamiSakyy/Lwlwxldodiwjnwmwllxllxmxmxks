package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g3 implements aaShadow.a {
    public static final g3 a = new g3();
    public static final List b = sy.d0.o("id", "gitObject", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.c5 c5Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                c5Var = (u10.c5) aa.c.b(aa.c.c(f3.a, true)).a(eVar, wVar);
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
        if (str2 != null) {
            return new u10.d5(str, c5Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.d5 d5Var = (u10.d5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d5Var.a);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(f3.a, true)).b(fVar, wVar, d5Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d5Var.c);
    }
}
