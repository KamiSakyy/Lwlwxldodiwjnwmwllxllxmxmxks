package uu0;

import java.util.Iterator;
import java.util.List;
import pz0.py;
import pz0.zs;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "name", "url", "isInOrganization", "owner", "id", "viewerPermission", "squashMergeAllowed", "rebaseMergeAllowed", "mergeCommitAllowed", "viewerDefaultCommitEmail", "viewerDefaultMergeMethod", "viewerPossibleCommitEmails", "planSupports", "allowUpdateBranch", "issueTypes", "defaultBranchRef"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        r22 = r7;
        r7 = r21.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r9 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r22 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r23 = r11;
        r11 = r22.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r23 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r24 = r12;
        r12 = r23.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r24 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        r25 = r13;
        r13 = r24.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r15 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r25 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r26 = r17;
        r17 = r25.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r26 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        return new uu0.z3(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r26.booleanValue(), r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        k41.b.B(r27, "allowUpdateBranch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        k41.b.B(r27, "planSupports");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        k41.b.B(r27, "viewerDefaultMergeMethod");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        k41.b.B(r27, "mergeCommitAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        k41.b.B(r27, "rebaseMergeAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        k41.b.B(r27, "squashMergeAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        k41.b.B(r27, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        k41.b.B(r27, "owner");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        k41.b.B(r27, "isInOrganization");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        k41.b.B(r27, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        k41.b.B(r27, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        k41.b.B(r27, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r4 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r21 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z3 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool3 = null;
        y3 y3Var = null;
        String str4 = null;
        py pyVar = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str5 = null;
        zs zsVar = null;
        List list = null;
        Boolean bool7 = null;
        x3 x3Var = null;
        w3 w3Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    y3Var = (y3) aa.c.c(c4.a, true).a(eVar, wVar);
                    break;
                case 5:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 6:
                    pyVar = (py) aa.c.b(qz0.b.o).a(eVar, wVar);
                    continue;
                case 7:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 8:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 9:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 10:
                    str5 = (String) aa.c.i.a(eVar, wVar);
                    continue;
                case 11:
                    Boolean bool8 = bool2;
                    Boolean bool9 = bool3;
                    Boolean bool10 = bool4;
                    Boolean bool11 = bool5;
                    Boolean bool12 = bool6;
                    Boolean bool13 = bool7;
                    String u = eVar.u();
                    k71.k.d(u);
                    zs.Companion.getClass();
                    Iterator it = zs.y.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((zs) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    zs zsVar2 = (zs) obj;
                    zsVar = zsVar2 == null ? zs.w : zsVar2;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool12;
                    bool7 = bool13;
                    continue;
                case 12:
                    list = (List) aa.c.b(aa.c.a(aa.c.a)).a(eVar, wVar);
                    continue;
                case 13:
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 14:
                    bool7 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 15:
                    bool = bool2;
                    x3Var = (x3) aa.c.b(aa.c.c(b4.a, false)).a(eVar, wVar);
                    break;
                case 16:
                    bool = bool2;
                    w3Var = (w3) aa.c.b(aa.c.c(a4.a, false)).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }
}
