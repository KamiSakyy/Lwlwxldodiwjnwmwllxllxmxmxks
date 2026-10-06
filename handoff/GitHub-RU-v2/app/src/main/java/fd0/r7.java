package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r7 implements aaShadow.a {
    public static final r7 a = new r7();
    public static final List b = sy.d0.o(new String[]{"repository", "search"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.rb rbVar = null;
        kc0.sb sbVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                rbVar = (kc0.rb) aa.c.b(aa.c.c(u7.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                sbVar = (kc0.sb) aa.c.c(v7.a, false).a(eVar, wVar);
            }
        }
        if (sbVar != null) {
            return new kc0.ob(rbVar, sbVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ob obVar = (kc0.ob) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(obVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(u7.a, false)).b(fVar, wVar, obVar.a);
        fVar.z0("search");
        aa.c.c(v7.a, false).b(fVar, wVar, obVar.b);
    }
}
