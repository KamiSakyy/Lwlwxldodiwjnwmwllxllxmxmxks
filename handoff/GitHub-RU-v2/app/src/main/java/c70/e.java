package c70;

import aa.w;
import hc0.h6;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "projectColumnName", "previousProjectColumnName", "project", "createdAt"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return new c70.c(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        k41.b.B(r9, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        k41.b.B(r9, "previousProjectColumnName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        k41.b.B(r9, "projectColumnName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        k41.b.B(r9, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        k41.b.B(r9, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r6 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        String str3 = null;
        String str4 = null;
        b bVar = null;
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
                    aVar = (a) aa.c.b(aa.c.c(d.a, true)).a(eVar, wVar);
                    break;
                case 3:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    bVar = (b) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(d.a, true)).b(fVar, wVar, cVar.c);
        fVar.z0("projectColumnName");
        bVar.b(fVar, wVar, cVar.d);
        fVar.z0("previousProjectColumnName");
        bVar.b(fVar, wVar, cVar.e);
        fVar.z0("project");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, cVar.f);
        fVar.z0("createdAt");
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, cVar.g);
    }

}
