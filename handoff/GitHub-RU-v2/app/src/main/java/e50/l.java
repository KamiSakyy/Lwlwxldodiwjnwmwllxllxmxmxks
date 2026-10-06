package e50;

import hc0.h6;
import hc0.i9;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = sy.d0Shadow.o("id", "closed", "viewerCanClose", "viewerCanReopen", "closedAt", "stateReason", "__typename");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r10 = r4;
        r4 = r9.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r10 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r5 = r10.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r8 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return new e50.j(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        k41.b.B(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        k41.b.B(r11, "viewerCanReopen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        k41.b.B(r11, "viewerCanClose");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        k41.b.B(r11, "closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        k41.b.B(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r9 = r3;
        r3 = r5.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r9 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        ZonedDateTime zonedDateTime = null;
        i9 i9Var = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 2:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) no.a.h(wVar, h6.a, eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    i9Var = (i9) aa.c.b(ic0.a.o).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, j jVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jVar.a);
        fVar.z0("closed");
        aa.b bVar2 = aa.c.f;
        f4.C(jVar.b, bVar2, fVar, wVar, "viewerCanClose");
        f4.C(jVar.c, bVar2, fVar, wVar, "viewerCanReopen");
        f4.C(jVar.d, bVar2, fVar, wVar, "closedAt");
        h6.Companion.getClass();
        aa.c.b(wVar.e(h6.a)).b(fVar, wVar, jVar.e);
        fVar.z0("stateReason");
        aa.c.b(ic0.a.o).b(fVar, wVar, jVar.f);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, jVar.g);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (j) obj);
    }
}
