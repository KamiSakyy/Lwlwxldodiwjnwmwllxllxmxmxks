package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o8 implements aa.a {
    public static final o8 a = new o8();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.wc wcVar = null;
        while (eVar.r0(b) == 0) {
            wcVar = (u10.wc) aa.c.b(aa.c.c(p8.a, true)).a(eVar, wVar);
        }
        return new u10.vc(wcVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.vc vcVar = (u10.vc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vcVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(p8.a, true)).b(fVar, wVar, vcVar.a);
    }
}
