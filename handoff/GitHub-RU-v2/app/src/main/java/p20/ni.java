package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ni implements aaShadow.a {
    public static final ni a = new ni();
    public static final List b = sy.d0.n("reopenIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.dr drVar = null;
        while (eVar.r0(b) == 0) {
            drVar = (u10.dr) aa.c.b(aa.c.c(pi.a, false)).a(eVar, wVar);
        }
        return new u10.br(drVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.br brVar = (u10.br) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(brVar, "value");
        fVar.z0("reopenIssue");
        aa.c.b(aa.c.c(pi.a, false)).b(fVar, wVar, brVar.a);
    }
}
