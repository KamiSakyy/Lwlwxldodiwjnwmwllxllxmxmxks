package yq;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "stateReason", "actor", "closable", "closer", "duplicateOf", "createdAt"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return new yq.n(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        k41.b.B(r11, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        k41.b.B(r11, "closable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        k41.b.B(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        k41.b.B(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r9 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        yi yiVar = null;
        a aVar = null;
        c cVar = null;
        d dVar = null;
        e eVar2 = null;
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
                    yiVar = (yi) aa.c.b(n10.b.f).a(eVar, wVar);
                    break;
                case 3:
                    aVar = (a) aa.c.b(aa.c.c(o.a, true)).a(eVar, wVar);
                    break;
                case 4:
                    cVar = (c) aa.c.c(q.a, true).a(eVar, wVar);
                    break;
                case 5:
                    dVar = (d) aa.c.b(aa.c.c(s.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    eVar2 = (e) aa.c.b(aa.c.c(t.a, true)).a(eVar, wVar);
                    break;
                case 7:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, n nVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, nVar.b);
        fVar.z0("stateReason");
        aa.c.b(n10.b.f).b(fVar, wVar, nVar.c);
        fVar.z0("actor");
        aa.c.b(aa.c.c(o.a, true)).b(fVar, wVar, nVar.d);
        fVar.z0("closable");
        aa.c.c(q.a, true).b(fVar, wVar, nVar.e);
        fVar.z0("closer");
        aa.c.b(aa.c.c(s.a, true)).b(fVar, wVar, nVar.f);
        fVar.z0("duplicateOf");
        aa.c.b(aa.c.c(t.a, true)).b(fVar, wVar, nVar.g);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, nVar.h);
    }
}
