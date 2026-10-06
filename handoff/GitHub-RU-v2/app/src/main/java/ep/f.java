package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aaShadow.a {
    public static final f a = new f();
    public static final List b = sy.d0.n("addComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.f fVar = null;
        while (eVar.r0(b) == 0) {
            fVar = (jo.f) aa.c.b(aa.c.c(d.a, false)).a(eVar, wVar);
        }
        return new jo.i(fVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.i iVar = (jo.i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("addComment");
        aa.c.b(aa.c.c(d.a, false)).b(fVar, wVar, iVar.a);
    }
}
