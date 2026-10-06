package ep;

import java.util.List;
import jo.n50;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class zs implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static n50 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        dw.m3 c = dw.t3.c(eVar, wVar);
        eVar.s0();
        dw.o c2 = dw.t.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new n50(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n50 n50Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n50Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n50Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, n50Var.b);
        List list = dw.t3.a;
        dw.t3.d(fVar, wVar, n50Var.c);
        List list2 = dw.t.a;
        dw.t.d(fVar, wVar, n50Var.d);
    }
}
