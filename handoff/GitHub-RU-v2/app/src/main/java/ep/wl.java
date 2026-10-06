package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wl implements aaShadow.a {
    public static final wl a = new wl();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        pv.f fVar = pv.f.a;
        pv.c c = pv.f.c(eVar, wVar);
        if (str != null) {
            return new jo.ov(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ov ovVar = (jo.ov) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ovVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, ovVar.a);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, ovVar.b);
    }
}
