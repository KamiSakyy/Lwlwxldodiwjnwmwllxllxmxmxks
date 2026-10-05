package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w5 implements aa.a {
    public static final w5 a = new w5();
    public static final List b = sy.d0.o("shortcuts", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.a9 a9Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                a9Var = (jo.a9) aa.c.c(a6.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (a9Var == null) {
            k41.b.B(eVar, "shortcuts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.w8(a9Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.w8 w8Var = (jo.w8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w8Var, "value");
        fVar.z0("shortcuts");
        aa.c.c(a6.a, false).b(fVar, wVar, w8Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w8Var.c);
    }
}
