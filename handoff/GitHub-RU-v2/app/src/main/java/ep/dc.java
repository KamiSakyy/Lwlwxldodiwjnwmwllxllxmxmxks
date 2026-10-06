package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dc implements aaShadow.a {
    public static final dc a = new dc();
    public static final List b = sy.d0.n("followUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.zh zhVar = null;
        while (eVar.r0(b) == 0) {
            zhVar = (jo.zh) aa.c.b(aa.c.c(ec.a, false)).a(eVar, wVar);
        }
        return new jo.yh(zhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.yh yhVar = (jo.yh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yhVar, "value");
        fVar.z0("followUser");
        aa.c.b(aa.c.c(ec.a, false)).b(fVar, wVar, yhVar.a);
    }
}
