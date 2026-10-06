package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aaShadow.a {
    public static final h a = new h();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.m mVar = null;
        while (eVar.r0(b) == 0) {
            mVar = (jo.m) aa.c.b(aa.c.c(i.a, true)).a(eVar, wVar);
        }
        return new jo.l(mVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.l lVar = (jo.l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(i.a, true)).b(fVar, wVar, lVar.a);
    }
}
