package ep;

import java.util.List;
import jo.zg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t00 implements aaShadow.a {
    public static final t00 a = new t00();
    public static final List b = sy.d0Shadow.n("navLinks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(s00.a, false))).a(eVar, wVar);
        }
        return new zg0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zg0 zg0Var = (zg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zg0Var, "value");
        fVar.z0("navLinks");
        aa.c.b(aa.c.a(aa.c.c(s00.a, false))).b(fVar, wVar, zg0Var.a);
    }
}
