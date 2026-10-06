package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z9 implements aaShadow.a {
    public static final z9 a = new z9();
    public static final List b = sy.d0.o(new String[]{"extension", "fileType"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.xe xeVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.we(str, xeVar);
                }
                xeVar = (jn0.xe) aa.c.b(aa.c.c(aa.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.we weVar = (jn0.we) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(weVar, "value");
        fVar.z0("extension");
        aa.c.i.b(fVar, wVar, weVar.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(aa.a, true)).b(fVar, wVar, weVar.b);
    }
}
