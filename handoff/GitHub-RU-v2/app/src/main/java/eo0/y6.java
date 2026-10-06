package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y6 implements aaShadow.a {
    public static final y6 a = new y6();
    public static final List b = sy.d0.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.fa faVar = null;
        jn0.ka kaVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                faVar = (jn0.fa) aa.c.b(aa.c.c(v6.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.ja(faVar, kaVar);
                }
                kaVar = (jn0.ka) aa.c.b(aa.c.c(z6.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ja jaVar = (jn0.ja) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jaVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(v6.a, true)).b(fVar, wVar, jaVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(z6.a, false)).b(fVar, wVar, jaVar.b);
    }
}
