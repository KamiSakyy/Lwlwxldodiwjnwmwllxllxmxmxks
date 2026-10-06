package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class rk implements aaShadow.a {
    public static final List a = sy.d0.n("stargazers");

    public static kc0.au c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.cu cuVar = null;
        while (eVar.r0(a) == 0) {
            cuVar = (kc0.cu) aa.c.c(tk.a, false).a(eVar, wVar);
        }
        if (cuVar != null) {
            return new kc0.au(cuVar);
        }
        k41.b.B(eVar, "stargazers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.au auVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(auVar, "value");
        fVar.z0("stargazers");
        aa.c.c(tk.a, false).b(fVar, wVar, auVar.a);
    }
}
