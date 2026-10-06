package p20;

import java.util.List;
import u10.p80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pu implements aaShadow.a {
    public static final pu a = new pu();
    public static final List b = sy.d0Shadow.o("__typename", "name", "id");

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
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        e30.a c = e30.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str3 != null) {
            return new p80(str, str2, str3, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p80 p80Var = (p80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p80Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p80Var.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, p80Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, p80Var.c);
        List list = e30.b.a;
        e30.b.d(fVar, wVar, p80Var.d);
    }
}
