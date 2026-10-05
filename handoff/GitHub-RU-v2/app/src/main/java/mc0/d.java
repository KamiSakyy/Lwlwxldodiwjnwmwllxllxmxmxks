package mc0;

import aa.w;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.o(new String[]{"id", "localizedDescription", "unlockedAt", "url", "achievable", "tier", "tiers", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r8 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r9 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return new lc0.e(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        k41.b.B(r12, "tiers");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        k41.b.B(r12, "achievable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        k41.b.B(r12, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        k41.b.B(r12, "unlockedAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        k41.b.B(r12, "localizedDescription");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        k41.b.B(r12, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        ZonedDateTime zonedDateTime = null;
        String str3 = null;
        lc0.a aVar = null;
        lc0.i iVar = null;
        ArrayList arrayList = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
                    break;
                case 3:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
                    aVar = (lc0.a) aa.c.c(a.a, false).a(eVar, wVar);
                    break;
                case 5:
                    iVar = (lc0.i) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    arrayList = aa.c.a(aa.c.c(g.a, false)).c(eVar, wVar);
                    break;
                case 7:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lc0.e eVar = (lc0.e) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(eVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("localizedDescription");
        bVar.b(fVar, wVar, eVar.b);
        fVar.z0("unlockedAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, eVar.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, eVar.d);
        fVar.z0("achievable");
        aa.c.c(a.a, false).b(fVar, wVar, eVar.e);
        fVar.z0("tier");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, eVar.f);
        fVar.z0("tiers");
        aa.c.a(aa.c.c(g.a, false)).e(fVar, wVar, eVar.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, eVar.h);
    }
}
