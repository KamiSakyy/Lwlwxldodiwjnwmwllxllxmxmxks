package sj0;

import aa.w;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "dismissalMessageHTML", "review", "createdAt", "url"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return new sj0.d(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        k41.b.B(r9, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        k41.b.B(r9, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        k41.b.B(r9, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        k41.b.B(r9, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r7 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r8 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        String str3 = null;
        c cVar = null;
        ZonedDateTime zonedDateTime = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    aVar = (a) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
                    break;
                case 3:
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    cVar = (c) aa.c.b(aa.c.c(g.a, false)).a(eVar, wVar);
                    break;
                case 5:
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
                    break;
                case 6:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, w wVar, d dVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, dVar.c);
        fVar.z0("dismissalMessageHTML");
        aa.c.i.b(fVar, wVar, dVar.d);
        fVar.z0("review");
        aa.c.b(aa.c.c(g.a, false)).b(fVar, wVar, dVar.e);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, dVar.f);
        fVar.z0("url");
        bVar.b(fVar, wVar, dVar.g);
    }
}
