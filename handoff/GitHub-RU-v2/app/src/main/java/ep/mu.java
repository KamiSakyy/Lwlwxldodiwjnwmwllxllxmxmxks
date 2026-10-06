package ep;

import java.util.List;
import jo.r70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mu implements aaShadow.a {
    public static final mu a = new mu();
    public static final List b = sy.d0Shadow.o("__typename", "id");

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
        dw.m3 c = dw.t3.c(eVar, wVar);
        eVar.s0();
        dw.o c2 = dw.t.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new r70(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r70 r70Var = (r70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r70Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r70Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, r70Var.b);
        List list = dw.t3.a;
        dw.t3.d(fVar, wVar, r70Var.c);
        List list2 = dw.t.a;
        dw.t.d(fVar, wVar, r70Var.d);
    }
}
