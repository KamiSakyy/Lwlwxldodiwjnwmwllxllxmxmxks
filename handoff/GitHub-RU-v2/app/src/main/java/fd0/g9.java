package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g9 implements aa.a {
    public static final g9 a = new g9();
    public static final List b = sy.d0.n("name");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new kc0.xd(str);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.xd xdVar = (kc0.xd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xdVar, "value");
        fVar.z0("name");
        aa.c.a.b(fVar, wVar, xdVar.a);
    }
}
