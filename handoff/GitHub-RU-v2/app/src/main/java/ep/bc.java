package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bc implements aaShadow.a {
    public static final bc a = new bc();
    public static final List b = sy.d0Shadow.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.vh vhVar = null;
        while (eVar.r0(b) == 0) {
            vhVar = (jo.vh) aa.c.b(aa.c.c(cc.a, true)).a(eVar, wVar);
        }
        return new jo.uh(vhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.uh uhVar = (jo.uh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uhVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(cc.a, true)).b(fVar, wVar, uhVar.a);
    }
}
