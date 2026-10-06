package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class zc implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "mergeHeadline", "mergeBody", "squashHeadline", "squashBody"});

    public static u10.nj c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                str5 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str6 = (String) aa.c.a.a(eVar, wVar);
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
        if (str3 == null) {
            k41.b.B(eVar, "mergeHeadline");
            throw null;
        }
        if (str4 == null) {
            k41.b.B(eVar, "mergeBody");
            throw null;
        }
        if (str5 == null) {
            k41.b.B(eVar, "squashHeadline");
            throw null;
        }
        if (str6 != null) {
            return new u10.nj(str, str2, str3, str4, str5, str6);
        }
        k41.b.B(eVar, "squashBody");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.nj njVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(njVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, njVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, njVar.b);
        fVar.z0("mergeHeadline");
        bVar.b(fVar, wVar, njVar.c);
        fVar.z0("mergeBody");
        bVar.b(fVar, wVar, njVar.d);
        fVar.z0("squashHeadline");
        bVar.b(fVar, wVar, njVar.e);
        fVar.z0("squashBody");
        bVar.b(fVar, wVar, njVar.f);
    }
}
