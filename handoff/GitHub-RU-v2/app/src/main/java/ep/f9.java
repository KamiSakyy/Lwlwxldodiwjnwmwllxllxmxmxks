package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f9 implements aaShadow.a {
    public static final f9 a = new f9();
    public static final List b = sy.d0Shadow.n("enablePullRequestAutoMerge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ud udVar = null;
        while (eVar.r0(b) == 0) {
            udVar = (jo.ud) aa.c.b(aa.c.c(g9.a, false)).a(eVar, wVar);
        }
        return new jo.td(udVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.td tdVar = (jo.td) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tdVar, "value");
        fVar.z0("enablePullRequestAutoMerge");
        aa.c.b(aa.c.c(g9.a, false)).b(fVar, wVar, tdVar.a);
    }
}
