package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n7 implements aaShadow.a {
    public static final n7 a = new n7();
    public static final List b = sy.d0Shadow.n("disablePullRequestAutoMerge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.gb gbVar = null;
        while (eVar.r0(b) == 0) {
            gbVar = (jo.gb) aa.c.b(aa.c.c(o7.a, false)).a(eVar, wVar);
        }
        return new jo.fb(gbVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fb fbVar = (jo.fb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fbVar, "value");
        fVar.z0("disablePullRequestAutoMerge");
        aa.c.b(aa.c.c(o7.a, false)).b(fVar, wVar, fbVar.a);
    }
}
