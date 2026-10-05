package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class de implements aa.a {
    public static final de a = new de();
    public static final List b = sy.d0.n("markNotificationAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.tk tkVar = null;
        while (eVar.r0(b) == 0) {
            tkVar = (jo.tk) aa.c.b(aa.c.c(ee.a, false)).a(eVar, wVar);
        }
        return new jo.sk(tkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.sk skVar = (jo.sk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(skVar, "value");
        fVar.z0("markNotificationAsDone");
        aa.c.b(aa.c.c(ee.a, false)).b(fVar, wVar, skVar.a);
    }
}
