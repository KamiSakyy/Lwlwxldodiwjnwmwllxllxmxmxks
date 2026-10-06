package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i9 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "file"});

    public static kc0.zd c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.xd xdVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                xdVar = (kc0.xd) aa.c.b(aa.c.c(g9.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new kc0.zd(str, xdVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.zd zdVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zdVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, zdVar.a);
        fVar.z0("file");
        aa.c.b(aa.c.c(g9.a, false)).b(fVar, wVar, zdVar.b);
    }
}
