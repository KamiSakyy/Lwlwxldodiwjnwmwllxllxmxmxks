package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class am implements aaShadow.a {
    public static final am a = new am();
    public static final List b = sy.d0.n("starrable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.xv xvVar = null;
        while (eVar.r0(b) == 0) {
            xvVar = (jo.xv) aa.c.b(aa.c.c(bm.a, true)).a(eVar, wVar);
        }
        return new jo.wv(xvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.wv wvVar = (jo.wv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wvVar, "value");
        fVar.z0("starrable");
        aa.c.b(aa.c.c(bm.a, true)).b(fVar, wVar, wvVar.a);
    }
}
