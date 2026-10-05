package pt0;

import aa.w;
import java.util.Iterator;
import java.util.List;
import pz0.rm;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "linesAdded", "linesDeleted", "oldTreeEntry", "newTreeEntry", "diffLines", "isBinary", "isLargeDiff", "isSubmodule", "status", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r18 = r6;
        r6 = r17.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r18 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r19 = r10;
        r10 = r18.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r19 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r20 = r11;
        r11 = r19.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r20 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r12 = r20.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r13 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r14 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        return new pt0.h(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        k41.b.B(r21, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        k41.b.B(r21, "status");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        k41.b.B(r21, "isSubmodule");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        k41.b.B(r21, "isLargeDiff");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        k41.b.B(r21, "isBinary");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        k41.b.B(r21, "linesDeleted");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        k41.b.B(r21, "linesAdded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        k41.b.B(r21, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r12 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        r17 = r5;
        r5 = r12.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r17 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h c(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Boolean bool = null;
        e eVar2 = null;
        d dVar = null;
        List list = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        rm rmVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            nn.a aVar = ro0.a.a;
            switch (r0) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    num = (Integer) aVar.a(eVar, wVar);
                    break;
                case 2:
                    num2 = (Integer) aVar.a(eVar, wVar);
                    break;
                case 3:
                    eVar2 = (e) aa.c.b(aa.c.c(m.a, false)).a(eVar, wVar);
                    break;
                case 4:
                    dVar = (d) aa.c.b(aa.c.c(l.a, false)).a(eVar, wVar);
                    break;
                case 5:
                    list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, true)))).a(eVar, wVar);
                    num = num;
                    break;
                case 6:
                    bool = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 7:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 8:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 9:
                    Integer num3 = num;
                    Integer num4 = num2;
                    Boolean bool4 = bool;
                    Boolean bool5 = bool2;
                    Boolean bool6 = bool3;
                    String u = eVar.u();
                    k71.k.d(u);
                    rm.Companion.getClass();
                    Iterator it = rm.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((rm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    rm rmVar2 = (rm) obj;
                    rmVar = rmVar2 == null ? rm.t : rmVar2;
                    num = num3;
                    num2 = num4;
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    break;
                case 10:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }
}
