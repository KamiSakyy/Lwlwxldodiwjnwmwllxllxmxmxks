package w50;

import hc0.ev;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aa.a {
    public static final t a = new t();
    public static final List b = sy.d0.o("id", "name", "isPrivate", "viewerSubscription", "viewerSubscriptionTypes", "owner", "__typename");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        return new w50.k(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        k41.b.B(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        k41.b.B(r10, "owner");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        k41.b.B(r10, "isPrivate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        k41.b.B(r10, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        k41.b.B(r10, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r4 = r4.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        ev evVar = null;
        List list = null;
        j jVar = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
                    bool = bool2;
                    evVar = (ev) aa.c.b(ic0.b.o).a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    list = (List) aa.c.b(aa.c.a(ic0.a.i)).a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    jVar = (j) aa.c.c(s.a, false).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k kVar = (k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, kVar.b);
        fVar.z0("isPrivate");
        f4.C(kVar.c, aa.c.f, fVar, wVar, "viewerSubscription");
        aa.c.b(ic0.b.o).b(fVar, wVar, kVar.d);
        fVar.z0("viewerSubscriptionTypes");
        aa.c.b(aa.c.a(ic0.a.i)).b(fVar, wVar, kVar.e);
        fVar.z0("owner");
        aa.c.c(s.a, false).b(fVar, wVar, kVar.f);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, kVar.g);
    }
}
