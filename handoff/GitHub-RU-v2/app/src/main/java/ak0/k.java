package ak0;

import aa.w;
import gn0.dn;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k implements aa.a {
    public static final List a = x61.l.r(new String[]{"isResolved", "resolvedBy", "path", "id", "viewerCanResolve", "viewerCanUnresolve", "subjectType", "comments", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r7 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r7 = r7.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r12 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r8 = r12.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r9 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r10 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r11 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        return new ak0.f(r3, r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        k41.b.B(r13, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        k41.b.B(r13, "comments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        k41.b.B(r13, "subjectType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        k41.b.B(r13, "viewerCanUnresolve");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        k41.b.B(r13, "viewerCanResolve");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        k41.b.B(r13, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        k41.b.B(r13, "path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        k41.b.B(r13, "isResolved");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        r12 = r3;
        r3 = r1.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r6 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f c(ea.e eVar, w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        d dVar = null;
        String str = null;
        String str2 = null;
        dn dnVar = null;
        a aVar = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 1:
                    bool = bool3;
                    dVar = (d) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
                    break;
                case 2:
                    bool = bool3;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    bool = bool3;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 5:
                    bool = bool3;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 6:
                    Boolean bool5 = bool3;
                    Boolean bool6 = bool4;
                    String u = eVar.u();
                    k71.k.d(u);
                    dn.Companion.getClass();
                    Iterator it = dn.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((dn) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    dn dnVar2 = (dn) obj;
                    dnVar = dnVar2 == null ? dn.v : dnVar2;
                    bool3 = bool5;
                    bool4 = bool6;
                    continue;
                case 7:
                    bool = bool3;
                    aVar = (a) aa.c.c(g.a, false).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool3;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool3 = bool;
        }
    }

    public static void d(ea.f fVar, w wVar, f fVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("isResolved");
        aa.b bVar = aa.c.f;
        f4.C(fVar2.a, bVar, fVar, wVar, "resolvedBy");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, fVar2.b);
        fVar.z0("path");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, fVar2.c);
        fVar.z0("id");
        bVar2.b(fVar, wVar, fVar2.d);
        fVar.z0("viewerCanResolve");
        f4.C(fVar2.e, bVar, fVar, wVar, "viewerCanUnresolve");
        f4.C(fVar2.f, bVar, fVar, wVar, "subjectType");
        fVar.I(fVar2.g.r);
        fVar.z0("comments");
        aa.c.c(g.a, false).b(fVar, wVar, fVar2.h);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, fVar2.i);
    }

}
