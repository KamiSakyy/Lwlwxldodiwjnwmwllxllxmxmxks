package gv;

import java.util.Iterator;
import java.util.List;
import m10.xz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0Shadow.o("__typename", "subjectType", "id", "isResolved", "isOutdated", "viewerCanResolve", "viewerCanUnresolve", "resolvedBy", "viewerCanReply", "comments");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        r15 = r7;
        r7 = r12.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r15 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r16 = r8;
        r8 = r15.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r16 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r17 = r9;
        r9 = r16.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r17 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r18 = r10;
        r10 = r17.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r18 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r12 = r18.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r13 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return new gv.c0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        k41.b.B(r20, "comments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        k41.b.B(r20, "viewerCanReply");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        k41.b.B(r20, "viewerCanUnresolve");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        k41.b.B(r20, "viewerCanResolve");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        k41.b.B(r20, "isOutdated");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        k41.b.B(r20, "isResolved");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        k41.b.B(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        k41.b.B(r20, "subjectType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        k41.b.B(r20, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r20.s0();
        r14 = nv.b.c(r20, r21);
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r6 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r12 == null) goto L32;
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
        xz xzVar = null;
        String str2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        d0 d0Var = null;
        a0Shadow a0Var = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    Boolean bool7 = bool2;
                    Boolean bool8 = bool3;
                    Boolean bool9 = bool4;
                    Boolean bool10 = bool5;
                    Boolean bool11 = bool6;
                    String u = eVar.u();
                    k71.k.d(u);
                    xz.Companion.getClass();
                    Iterator it = xz.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((xz) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    xz xzVar2 = (xz) obj;
                    xzVar = xzVar2 == null ? xz.v : xzVar2;
                    bool2 = bool7;
                    bool3 = bool8;
                    bool4 = bool9;
                    bool5 = bool10;
                    bool6 = bool11;
                    continue;
                case 2:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    d0Var = (d0) aa.c.b(aa.c.c(m0.a, false)).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 9:
                    bool = bool2;
                    a0Var = (a0Shadow) aa.c.c(i0.a, false).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c0Var.a);
        fVar.z0("subjectType");
        fVar.I(c0Var.b.r);
        fVar.z0("id");
        bVar.b(fVar, wVar, c0Var.c);
        fVar.z0("isResolved");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(c0Var.d, bVar2, fVar, wVar, "isOutdated");
        jo.f4Shadow.C(c0Var.e, bVar2, fVar, wVar, "viewerCanResolve");
        jo.f4Shadow.C(c0Var.f, bVar2, fVar, wVar, "viewerCanUnresolve");
        jo.f4Shadow.C(c0Var.g, bVar2, fVar, wVar, "resolvedBy");
        aa.c.b(aa.c.c(m0.a, false)).b(fVar, wVar, c0Var.h);
        fVar.z0("viewerCanReply");
        jo.f4Shadow.C(c0Var.i, bVar2, fVar, wVar, "comments");
        aa.c.c(i0.a, false).b(fVar, wVar, c0Var.j);
        List list = nv.b.a;
        nv.b.d(fVar, wVar, c0Var.k);
    }
}
