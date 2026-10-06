package ep;

import java.util.List;
import jo.u50;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class etShadow implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static u50 c(ea.e eVar, aa.w wVar) {
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
        dw.t5 c = dw.v5.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u50(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u50 u50Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u50Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u50Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, u50Var.b);
        List list = dw.v5.a;
        dw.v5.d(fVar, wVar, u50Var.c);
    }
}
