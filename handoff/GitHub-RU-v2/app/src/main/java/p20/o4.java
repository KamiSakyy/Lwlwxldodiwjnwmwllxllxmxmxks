package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o4 implements aaShadow.a {
    public static final o4 a = new o4();
    public static final List b = sy.d0.o("shortcuts", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.f7 f7Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                f7Var = (u10.f7) aa.c.c(s4.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (f7Var == null) {
            k41.b.B(eVar, "shortcuts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.b7(f7Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.b7 b7Var = (u10.b7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b7Var, "value");
        fVar.z0("shortcuts");
        aa.c.c(s4.a, false).b(fVar, wVar, b7Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b7Var.c);
    }
}
