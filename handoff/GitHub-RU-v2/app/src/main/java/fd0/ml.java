package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ml implements aa.a {
    public static final ml a = new ml();
    public static final List b = sy.d0.o(new String[]{"id", "branchInfo", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.yu yuVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                yuVar = (kc0.yu) aa.c.b(aa.c.c(kl.a, true)).a(eVar, wVar);
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
            return new kc0.bv(str, yuVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.bv bvVar = (kc0.bv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bvVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bvVar.a);
        fVar.z0("branchInfo");
        aa.c.b(aa.c.c(kl.a, true)).b(fVar, wVar, bvVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, bvVar.c);
    }
}
