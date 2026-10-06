package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class te implements aaShadow.a {
    public static final te a = new te();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "discussion", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.zl zlVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                zlVar = (kc0.zl) aa.c.b(aa.c.c(re.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new kc0.bm(str, zlVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.bm bmVar = (kc0.bm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bmVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bmVar.a);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(re.a, false)).b(fVar, wVar, bmVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, bmVar.c);
    }
}
