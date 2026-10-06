package xt;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4Shadow;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "actor", "createdAt", "isCrossRepository", "canonical", "duplicate"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return new xt.k(r2, r3, r4, r5, r6.booleanValue(), r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        k41.b.B(r10, "isCrossRepository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        k41.b.B(r10, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        k41.b.B(r10, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        k41.b.B(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r6 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k c(ea.e eVar, w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        a aVar = null;
        ZonedDateTime zonedDateTime = null;
        b bVar = null;
        c cVar = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    bool = bool2;
                    aVar = (a) aa.c.b(aa.c.c(l.a, true)).a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                    break;
                case 4:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 5:
                    bool = bool2;
                    bVar = (b) aa.c.b(aa.c.c(m.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    cVar = (c) aa.c.b(aa.c.c(n.a, true)).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, w wVar, k kVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, kVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(l.a, true)).b(fVar, wVar, kVar.c);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, kVar.d);
        fVar.z0("isCrossRepository");
        f4Shadow.C(kVar.e, aa.c.f, fVar, wVar, "canonical");
        aa.c.b(aa.c.c(m.a, true)).b(fVar, wVar, kVar.f);
        fVar.z0("duplicate");
        aa.c.b(aa.c.c(n.a, true)).b(fVar, wVar, kVar.g);
    }
}
