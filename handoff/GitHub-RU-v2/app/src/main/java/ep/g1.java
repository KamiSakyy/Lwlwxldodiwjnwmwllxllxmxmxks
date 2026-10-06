package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aaShadow.a {
    public static final g1 a = new g1();
    public static final List b = sy.d0.o("__typename", "id", "url");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        dw.s0 c = dw.w0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jo.f2(str, str2, str3, c);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.f2 f2Var = (jo.f2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, f2Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, f2Var.c);
        List list = dw.w0.a;
        dw.w0.d(fVar, wVar, f2Var.d);
    }
}
