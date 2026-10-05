package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class wn implements aa.a {
    public static final List a = sy.d0.n("stargazers");

    public static jo.ly c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ny nyVar = null;
        while (eVar.r0(a) == 0) {
            nyVar = (jo.ny) aa.c.c(yn.a, false).a(eVar, wVar);
        }
        if (nyVar != null) {
            return new jo.ly(nyVar);
        }
        k41.b.B(eVar, "stargazers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.ly lyVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lyVar, "value");
        fVar.z0("stargazers");
        aa.c.c(yn.a, false).b(fVar, wVar, lyVar.a);
    }
}
