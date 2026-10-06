package dw;

import java.util.Iterator;
import java.util.List;
import m10.n40;
import m10.py;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "name", "url", "isInOrganization", "owner", "id", "viewerPermission", "squashMergeAllowed", "rebaseMergeAllowed", "mergeCommitAllowed", "viewerDefaultCommitEmail", "viewerDefaultMergeMethod", "viewerPossibleCommitEmails", "planSupports", "allowUpdateBranch", "issueTypes", "defaultBranchRef", "viewerCodingAgents"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r23 = r7;
        r7 = r22.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r9 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r23 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r24 = r11;
        r11 = r23.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r24 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r25 = r12;
        r12 = r24.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r25 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r26 = r13;
        r13 = r25.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r15 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r26 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        r27 = r17;
        r17 = r26.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r27 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        return new dw.c4(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r27.booleanValue(), r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        k41.b.B(r28, "allowUpdateBranch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        k41.b.B(r28, "planSupports");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        k41.b.B(r28, "viewerDefaultMergeMethod");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        k41.b.B(r28, "mergeCommitAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        k41.b.B(r28, "rebaseMergeAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        k41.b.B(r28, "squashMergeAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        k41.b.B(r28, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        k41.b.B(r28, "owner");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        k41.b.B(r28, "isInOrganization");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        k41.b.B(r28, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        k41.b.B(r28, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
    
        k41.b.B(r28, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r4 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r22 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c4 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool3 = null;
        a4 a4Var = null;
        String str4 = null;
        n40 n40Var = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str5 = null;
        py pyVar = null;
        List list = null;
        Boolean bool7 = null;
        z3 z3Var = null;
        y3 y3Var = null;
        b4 b4Var = null;
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
                    a4Var = (a4) aa.c.c(f4.a, true).a(eVar, wVar);
                    break;
                case 5:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 6:
                    n40Var = (n40) aa.c.b(n10.b.A).a(eVar, wVar);
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
                    py.Companion.getClass();
                    Iterator it = py.y.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((py) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    py pyVar2 = (py) obj;
                    pyVar = pyVar2 == null ? py.w : pyVar2;
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
                    z3Var = (z3) aa.c.b(aa.c.c(e4.a, false)).a(eVar, wVar);
                    break;
                case 16:
                    bool = bool2;
                    y3Var = (y3) aa.c.b(aa.c.c(d4.a, false)).a(eVar, wVar);
                    break;
                case 17:
                    bool = bool2;
                    b4Var = (b4) aa.c.b(aa.c.c(h4.a, false)).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, c4 c4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c4Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, c4Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, c4Var.c);
        fVar.z0("isInOrganization");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(c4Var.d, bVar2, fVar, wVar, "owner");
        aa.c.c(f4.a, true).b(fVar, wVar, c4Var.e);
        fVar.z0("id");
        bVar.b(fVar, wVar, c4Var.f);
        fVar.z0("viewerPermission");
        aa.c.b(n10.b.A).b(fVar, wVar, c4Var.g);
        fVar.z0("squashMergeAllowed");
        jo.f4Shadow.C(c4Var.h, bVar2, fVar, wVar, "rebaseMergeAllowed");
        jo.f4Shadow.C(c4Var.i, bVar2, fVar, wVar, "mergeCommitAllowed");
        jo.f4Shadow.C(c4Var.j, bVar2, fVar, wVar, "viewerDefaultCommitEmail");
        aa.c.i.b(fVar, wVar, c4Var.k);
        fVar.z0("viewerDefaultMergeMethod");
        fVar.I(c4Var.l.r);
        fVar.z0("viewerPossibleCommitEmails");
        aa.c.b(aa.c.a(bVar)).b(fVar, wVar, c4Var.m);
        fVar.z0("planSupports");
        jo.f4Shadow.C(c4Var.n, bVar2, fVar, wVar, "allowUpdateBranch");
        jo.f4Shadow.C(c4Var.o, bVar2, fVar, wVar, "issueTypes");
        aa.c.b(aa.c.c(e4.a, false)).b(fVar, wVar, c4Var.p);
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(d4.a, false)).b(fVar, wVar, c4Var.q);
        fVar.z0("viewerCodingAgents");
        aa.c.b(aa.c.c(h4.a, false)).b(fVar, wVar, c4Var.r);
    }
}
