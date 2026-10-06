package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h7 implements aa.a {
    public static final h7 a = new h7();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public static e7 c(ea.e eVar, aa.w wVar) {
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
        c7 c7Var = c7.a;
        z6 c = c7.c(eVar, wVar);
        eVar.s0();
        s0 c2 = w0.c(eVar, wVar);
        eVar.s0();
        w6 w6Var = w6.a;
        r6 c3 = w6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new e7(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e7 e7Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e7Var.b);
        c7 c7Var = c7.a;
        c7.d(fVar, wVar, e7Var.c);
        List list = w0.a;
        w0.d(fVar, wVar, e7Var.d);
        w6 w6Var = w6.a;
        w6.d(fVar, wVar, e7Var.e);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (e7) obj);
    }
}
