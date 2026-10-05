package ep;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ll implements aa.a {
    public static final ll a = new ll();
    public static final List b = sy.d0.o("id", "name", "tagName", "descriptionHTML", "author", "createdAt", "publishedAt", "__typename");

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return new jo.zu(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        k41.b.B(r12, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        k41.b.B(r12, "tagName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        k41.b.B(r12, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r7 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r9 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        jo.wu wuVar = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(b);
            aa.x xVar = m10.sa.a;
            switch (r0) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    wuVar = (jo.wu) aa.c.b(aa.c.c(jl.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    m10.sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    break;
                case 6:
                    m10.sa.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    break;
                case 7:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.zu zuVar = (jo.zu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zuVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zuVar.a);
        fVar.z0("name");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, zuVar.b);
        fVar.z0("tagName");
        bVar.b(fVar, wVar, zuVar.c);
        fVar.z0("descriptionHTML");
        o0Var.b(fVar, wVar, zuVar.d);
        fVar.z0("author");
        aa.c.b(aa.c.c(jl.a, true)).b(fVar, wVar, zuVar.e);
        fVar.z0("createdAt");
        m10.sa.Companion.getClass();
        aa.x xVar = m10.sa.a;
        wVar.e(xVar).b(fVar, wVar, zuVar.f);
        no.a.e(fVar, "publishedAt", wVar, xVar).b(fVar, wVar, zuVar.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, zuVar.h);
    }
}
