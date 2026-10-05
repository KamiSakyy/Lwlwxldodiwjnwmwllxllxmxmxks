package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 implements aa.a {
    public static final j1 a = new j1();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

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
        a6 c = b6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new f1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f1 f1Var = (f1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, f1Var.b);
        List list = b6.a;
        a6 a6Var = f1Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a6Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, a6Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, a6Var.b);
        fVar.z0("login");
        bVar2.b(fVar, wVar, a6Var.c);
        fVar.z0("url");
        bVar2.b(fVar, wVar, a6Var.d);
        List list2 = cp0.h.a;
        cp0.h.d(fVar, wVar, a6Var.e);
    }
}
