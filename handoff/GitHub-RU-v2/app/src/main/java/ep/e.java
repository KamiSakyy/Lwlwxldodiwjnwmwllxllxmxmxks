package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements aaShadow.a {
    public static final e a = new e();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.j jVar = null;
        while (eVar.r0(b) == 0) {
            jVar = (jo.j) aa.c.b(aa.c.c(g.a, true)).a(eVar, wVar);
        }
        return new jo.g(jVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.g gVar = (jo.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(g.a, true)).b(fVar, wVar, gVar.a);
    }
    public static final Object r = null;
}
