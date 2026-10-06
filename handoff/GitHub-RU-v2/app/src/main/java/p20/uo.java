package p20;

import java.util.List;
import u10.d00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uo implements aaShadow.a {
    public static final uo a = new uo();
    public static final List b = sy.d0.o("__typename", "id");

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
        z70.k3 k3Var = z70.k3.a;
        z70.i3 c = z70.k3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new d00(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d00 d00Var = (d00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d00Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d00Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, d00Var.b);
        z70.k3 k3Var = z70.k3.a;
        z70.k3.d(fVar, wVar, d00Var.c);
    }
}
