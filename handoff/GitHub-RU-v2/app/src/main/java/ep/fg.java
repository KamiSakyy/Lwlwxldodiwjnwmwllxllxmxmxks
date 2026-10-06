package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class fg implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "mergeRequirements"});

    public static jo.zn c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jo.xn xnVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                xnVar = (jo.xn) aa.c.c(dg.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (xnVar != null) {
            return new jo.zn(str, str2, xnVar);
        }
        k41.b.B(eVar, "mergeRequirements");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.zn znVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(znVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, znVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, znVar.b);
        fVar.z0("mergeRequirements");
        aa.c.c(dg.a, false).b(fVar, wVar, znVar.c);
    }
}
