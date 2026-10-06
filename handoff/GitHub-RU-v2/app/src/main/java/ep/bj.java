package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class bj implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "path", "subjectType", "isResolved", "viewerCanResolve", "viewerCanUnresolve", "resolvedBy", "viewerCanReply", "diffLines", "comments"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r12 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r16 = r8;
        r8 = r12.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r16 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r17 = r9;
        r9 = r16.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r17 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r18 = r10;
        r10 = r17.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r18 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r12 = r18.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r14 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        return new jo.as(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        k41.b.B(r19, "comments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        k41.b.B(r19, "viewerCanReply");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        k41.b.B(r19, "viewerCanUnresolve");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        k41.b.B(r19, "viewerCanResolve");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        k41.b.B(r19, "isResolved");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        k41.b.B(r19, "subjectType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        k41.b.B(r19, "path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        k41.b.B(r19, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        k41.b.B(r19, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        r19.s0();
        r15 = nvShadow.b.c(r19, r20);
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r7 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jo.as c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        m10.xz xzVar = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        jo.es esVar = null;
        List list = null;
        jo.qr qrVar = null;
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
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    Boolean bool6 = bool2;
                    Boolean bool7 = bool3;
                    Boolean bool8 = bool4;
                    Boolean bool9 = bool5;
                    String u = eVar.u();
                    k71.k.d(u);
                    m10.xz.Companion.getClass();
                    Iterator it = m10.xz.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((m10.xz) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    m10.xz xzVar2 = (m10.xz) obj;
                    xzVar = xzVar2 == null ? m10.xz.v : xzVar2;
                    bool2 = bool6;
                    bool3 = bool7;
                    bool4 = bool8;
                    bool5 = bool9;
                    continue;
                case 4:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 5:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    esVar = (jo.es) aa.c.b(aa.c.c(fj.a, false)).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 9:
                    list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(vi.a, true)))).a(eVar, wVar);
                    bool2 = bool2;
                    bool3 = bool3;
                    continue;
                case 10:
                    bool = bool2;
                    qrVar = (jo.qr) aa.c.c(si.a, false).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jo.as asVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(asVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, asVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, asVar.b);
        fVar.z0("path");
        bVar.b(fVar, wVar, asVar.c);
        fVar.z0("subjectType");
        fVar.I(asVar.d.r);
        fVar.z0("isResolved");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(asVar.e, bVar2, fVar, wVar, "viewerCanResolve");
        jo.f4Shadow.C(asVar.f, bVar2, fVar, wVar, "viewerCanUnresolve");
        jo.f4Shadow.C(asVar.g, bVar2, fVar, wVar, "resolvedBy");
        aa.c.b(aa.c.c(fj.a, false)).b(fVar, wVar, asVar.h);
        fVar.z0("viewerCanReply");
        jo.f4Shadow.C(asVar.i, bVar2, fVar, wVar, "diffLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vi.a, true)))).b(fVar, wVar, asVar.j);
        fVar.z0("comments");
        aa.c.c(si.a, false).b(fVar, wVar, asVar.k);
        List list = nvShadow.b.a;
        nvShadow.b.d(fVar, wVar, asVar.l);
    }
}
