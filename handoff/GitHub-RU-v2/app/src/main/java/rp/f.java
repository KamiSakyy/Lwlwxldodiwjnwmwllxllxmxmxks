package rp;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = l.r(new String[]{"id", "bodyHTML", "title", "updatedAt", "creator", "projectsV2", "projectV2Items"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        return new qp.g(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        k41.b.B(r10, "projectV2Items");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        k41.b.B(r10, "projectsV2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        k41.b.B(r10, "updatedAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        k41.b.B(r10, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        k41.b.B(r10, "bodyHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        k41.b.B(r10, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r5 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qp.g c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        qp.b bVar = null;
        qp.i iVar = null;
        qp.h hVar = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                    break;
                case 4:
                    bVar = (qp.b) aa.c.b(aa.c.c(a.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    iVar = (qp.i) aa.c.c(h.a, false).a(eVar, wVar);
                    break;
                case 6:
                    hVar = (qp.h) aa.c.c(g.a, false).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, w wVar, qp.g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("bodyHTML");
        bVar.b(fVar, wVar, gVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, gVar.c);
        fVar.z0("updatedAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, gVar.d);
        fVar.z0("creator");
        aa.c.b(aa.c.c(a.a, true)).b(fVar, wVar, gVar.e);
        fVar.z0("projectsV2");
        aa.c.c(h.a, false).b(fVar, wVar, gVar.f);
        fVar.z0("projectV2Items");
        aa.c.c(g.a, false).b(fVar, wVar, gVar.g);
    }
}
