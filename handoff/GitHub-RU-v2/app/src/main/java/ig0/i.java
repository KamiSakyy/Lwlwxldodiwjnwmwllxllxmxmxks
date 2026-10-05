package ig0;

import aa.w;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "createdAt", "pullRequest", "beforeCommit", "afterCommit"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return new ig0.e(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        k41.b.B(r10, "pullRequest");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        k41.b.B(r10, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        k41.b.B(r10, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        k41.b.B(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r6 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        ZonedDateTime zonedDateTime = null;
        d dVar = null;
        c cVar = null;
        b bVar = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    aVar = (a) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
                    break;
                case 3:
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
                    break;
                case 4:
                    dVar = (d) aa.c.c(j.a, false).a(eVar, wVar);
                    break;
                case 5:
                    cVar = (c) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    bVar = (b) aa.c.b(aa.c.c(g.a, false)).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, w wVar, e eVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(eVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, eVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, eVar.c);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, eVar.d);
        fVar.z0("pullRequest");
        aa.c.c(j.a, false).b(fVar, wVar, eVar.e);
        fVar.z0("beforeCommit");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, eVar.f);
        fVar.z0("afterCommit");
        aa.c.b(aa.c.c(g.a, false)).b(fVar, wVar, eVar.g);
    }

}
