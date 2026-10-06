package p20;

import java.util.List;
import u10.nw;
import u10.pw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gm implements aaShadow.a {
    public static final gm a = new gm();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pw pwVar = null;
        while (eVar.r0(b) == 0) {
            pwVar = (pw) aa.c.b(aa.c.c(im.a, false)).a(eVar, wVar);
        }
        return new nw(pwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        nw nwVar = (nw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nwVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(im.a, false)).b(fVar, wVar, nwVar.a);
    }
}
