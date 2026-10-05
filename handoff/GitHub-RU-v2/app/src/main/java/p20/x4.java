package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x4 implements aa.a {
    public static final x4 a = new x4();
    public static final List b = sy.d0.o("__typename", "comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.i7 i7Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                i7Var = (u10.i7) aa.c.b(aa.c.c(u4.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new u10.m7(str, i7Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.m7 m7Var = (u10.m7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m7Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, m7Var.a);
        fVar.z0("comment");
        aa.c.b(aa.c.c(u4.a, false)).b(fVar, wVar, m7Var.b);
    }
}
