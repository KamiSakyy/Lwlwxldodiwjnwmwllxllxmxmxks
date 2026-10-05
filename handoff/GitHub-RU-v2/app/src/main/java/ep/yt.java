package ep;

import java.util.List;
import jo.x60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yt implements aa.a {
    public static final yt a = new yt();
    public static final List b = sy.d0.o("__typename", "isArchived", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
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
        if (bool == null) {
            k41.b.B(eVar, "isArchived");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new x60(str, booleanValue, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x60 x60Var = (x60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x60Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x60Var.a);
        fVar.z0("isArchived");
        jo.f4.C(x60Var.b, aa.c.f, fVar, wVar, "id");
        bVar.b(fVar, wVar, x60Var.c);
        List list = dw.v5.a;
        dw.v5.d(fVar, wVar, x60Var.d);
    }
}
