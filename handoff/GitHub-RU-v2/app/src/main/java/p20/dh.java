package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class dh implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "target", "message", "name", "commitUrl", "tagger"});

    public static u10.dp c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.np npVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        u10.mp mpVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                npVar = (u10.np) aa.c.c(nh.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                mpVar = (u10.mp) aa.c.b(aa.c.c(mh.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (npVar == null) {
            k41.b.B(eVar, "target");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str4 != null) {
            return new u10.dp(str, npVar, str2, str3, str4, mpVar);
        }
        k41.b.B(eVar, "commitUrl");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.dp dpVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dpVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dpVar.a);
        fVar.z0("target");
        aa.c.c(nh.a, true).b(fVar, wVar, dpVar.b);
        fVar.z0("message");
        aa.c.i.b(fVar, wVar, dpVar.c);
        fVar.z0("name");
        bVar.b(fVar, wVar, dpVar.d);
        fVar.z0("commitUrl");
        bVar.b(fVar, wVar, dpVar.e);
        fVar.z0("tagger");
        aa.c.b(aa.c.c(mh.a, false)).b(fVar, wVar, dpVar.f);
    }
}
