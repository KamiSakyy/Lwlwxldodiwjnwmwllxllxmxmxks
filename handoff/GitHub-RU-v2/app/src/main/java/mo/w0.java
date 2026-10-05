package mo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"url", "nameWithOwner", "id"});

    public static o c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "nameWithOwner");
            throw null;
        }
        if (str3 != null) {
            return new o(str, str2, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("url");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.a);
        fVar.z0("nameWithOwner");
        bVar.b(fVar, wVar, oVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, oVar.c);
    }
}
