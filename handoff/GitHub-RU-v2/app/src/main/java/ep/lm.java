package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lm implements aaShadow.a {
    public static final lm a = new lm();
    public static final List b = sy.d0.n("reopenIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.pw pwVar = null;
        while (eVar.r0(b) == 0) {
            pwVar = (jo.pw) aa.c.b(aa.c.c(nm.a, false)).a(eVar, wVar);
        }
        return new jo.nw(pwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.nw nwVar = (jo.nw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nwVar, "value");
        fVar.z0("reopenIssue");
        aa.c.b(aa.c.c(nm.a, false)).b(fVar, wVar, nwVar.a);
    }
}
