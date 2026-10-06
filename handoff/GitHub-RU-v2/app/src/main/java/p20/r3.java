package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r3 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"history", "id"});

    public static u10.s5 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.o5 o5Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                o5Var = (u10.o5) aa.c.c(n3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (o5Var == null) {
            k41.b.B(eVar, "history");
            throw null;
        }
        if (str != null) {
            return new u10.s5(o5Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.s5 s5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s5Var, "value");
        fVar.z0("history");
        aa.c.c(n3.a, false).b(fVar, wVar, s5Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, s5Var.b);
    }
}
