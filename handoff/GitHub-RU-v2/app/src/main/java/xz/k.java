package xz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k implements aa.a {
    public static final List a = x61.l.r(new String[]{"viewGroupId", "title", "field", "value", "__typename"});

    public static f c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        e eVar2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(g.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                eVar2 = (e) aa.c.b(aa.c.c(l.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str3 != null) {
            return new f(str, str2, aVar, eVar2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, f fVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("viewGroupId");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, fVar2.a);
        fVar.z0("title");
        o0Var.b(fVar, wVar, fVar2.b);
        fVar.z0("field");
        aa.c.b(aa.c.c(g.a, true)).b(fVar, wVar, fVar2.c);
        fVar.z0("value");
        aa.c.b(aa.c.c(l.a, true)).b(fVar, wVar, fVar2.d);
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, fVar2.e);
    }
}
