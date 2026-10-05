package eo0;

import java.util.Iterator;
import java.util.List;
import jn0.bc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hx implements aa.a {
    public static final hx a = new hx();
    public static final List b = sy.d0.o(new String[]{"id", "mergeCommitAllowed", "squashMergeAllowed", "rebaseMergeAllowed", "viewerDefaultMergeMethod", "viewerDefaultCommitEmail", "viewerPossibleCommitEmails", "viewerPermission", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r12 = r4;
        r4 = r11.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r12 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r5 = r12.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return new jn0.bc0(r2, r3, r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        k41.b.B(r14, "viewerDefaultMergeMethod");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        k41.b.B(r14, "rebaseMergeAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        k41.b.B(r14, "squashMergeAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        k41.b.B(r14, "mergeCommitAllowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r11 = r3;
        r3 = r5.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r11 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        pz0.zs zsVar = null;
        String str2 = null;
        List list = null;
        pz0.py pyVar = null;
        String str3 = null;
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
                    Boolean bool5 = bool2;
                    Boolean bool6 = bool3;
                    Boolean bool7 = bool4;
                    String u = eVar.u();
                    k71.k.d(u);
                    pz0.zs.Companion.getClass();
                    Iterator it = pz0.zs.y.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((pz0.zs) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    pz0.zs zsVar2 = (pz0.zs) obj;
                    zsVar = zsVar2 == null ? pz0.zs.w : zsVar2;
                    bool2 = bool5;
                    bool3 = bool6;
                    bool4 = bool7;
                    continue;
                case 5:
                    bool = bool2;
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    list = (List) aa.c.b(aa.c.a(aa.c.a)).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    pyVar = (pz0.py) aa.c.b(qz0.b.o).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        bc0 bc0Var = (bc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bc0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bc0Var.a);
        fVar.z0("mergeCommitAllowed");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(bc0Var.b, bVar2, fVar, wVar, "squashMergeAllowed");
        jo.f4.C(bc0Var.c, bVar2, fVar, wVar, "rebaseMergeAllowed");
        jo.f4.C(bc0Var.d, bVar2, fVar, wVar, "viewerDefaultMergeMethod");
        fVar.I(bc0Var.e.r);
        fVar.z0("viewerDefaultCommitEmail");
        aa.c.i.b(fVar, wVar, bc0Var.f);
        fVar.z0("viewerPossibleCommitEmails");
        aa.c.b(aa.c.a(bVar)).b(fVar, wVar, bc0Var.g);
        fVar.z0("viewerPermission");
        aa.c.b(qz0.b.o).b(fVar, wVar, bc0Var.h);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, bc0Var.i);
    }
}
