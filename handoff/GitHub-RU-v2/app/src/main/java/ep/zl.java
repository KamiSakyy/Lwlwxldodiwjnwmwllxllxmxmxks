package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zl implements aaShadow.a {
    public static final zl a = new zl();
    public static final List b = sy.d0Shadow.n("removeStar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.wv wvVar = null;
        while (eVar.r0(b) == 0) {
            wvVar = (jo.wv) aa.c.b(aa.c.c(am.a, false)).a(eVar, wVar);
        }
        return new jo.vv(wvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.vv vvVar = (jo.vv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vvVar, "value");
        fVar.z0("removeStar");
        aa.c.b(aa.c.c(am.a, false)).b(fVar, wVar, vvVar.a);
    }
}
