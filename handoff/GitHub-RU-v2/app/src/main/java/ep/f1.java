package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 implements aa.a {
    public static final f1 a = new f1();
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
        dw.w6 w6Var = dw.w6.a;
        dw.r6 c = dw.w6.c(eVar, wVar);
        eVar.s0();
        dw.c7 c7Var = dw.c7.a;
        dw.z6 c2 = dw.c7.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jo.e2(str, str2, str3, c, c2);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.e2 e2Var = (jo.e2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e2Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, e2Var.c);
        dw.w6 w6Var = dw.w6.a;
        dw.w6.d(fVar, wVar, e2Var.d);
        dw.c7 c7Var = dw.c7.a;
        dw.c7.d(fVar, wVar, e2Var.e);
    }
}
