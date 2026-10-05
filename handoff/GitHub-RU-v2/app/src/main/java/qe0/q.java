package qe0;

import gn0.r6;
import gn0.zc;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "stateReason", "actor", "closable", "closer", "createdAt"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return new qe0.m(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        k41.b.B(r10, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        k41.b.B(r10, "closable");
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
    
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r8 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        zc zcVar = null;
        a aVar = null;
        c cVar = null;
        d dVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    zcVar = (zc) aa.c.b(hn0.a.t).a(eVar, wVar);
                    break;
                case 3:
                    aVar = (a) aa.c.b(aa.c.c(n.a, true)).a(eVar, wVar);
                    break;
                case 4:
                    cVar = (c) aa.c.c(p.a, true).a(eVar, wVar);
                    break;
                case 5:
                    dVar = (d) aa.c.b(aa.c.c(r.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, m mVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, mVar.b);
        fVar.z0("stateReason");
        aa.c.b(hn0.a.t).b(fVar, wVar, mVar.c);
        fVar.z0("actor");
        aa.c.b(aa.c.c(n.a, true)).b(fVar, wVar, mVar.d);
        fVar.z0("closable");
        aa.c.c(p.a, true).b(fVar, wVar, mVar.e);
        fVar.z0("closer");
        aa.c.b(aa.c.c(r.a, true)).b(fVar, wVar, mVar.f);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, mVar.g);
    }
}
