package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 implements aaShadow.a {
    public static final w0 a = new w0();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "isResolved", "resolvedBy", "viewerCanResolve", "viewerCanUnresolve", "pullRequest", "diffLines", "comments"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r15 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r16 = r8;
        r8 = r15.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r16 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r9 = r16.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r10 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r12 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return new jn0.p1(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        k41.b.B(r18, "comments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        k41.b.B(r18, "pullRequest");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        k41.b.B(r18, "viewerCanUnresolve");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        k41.b.B(r18, "viewerCanResolve");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        k41.b.B(r18, "isResolved");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        k41.b.B(r18, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        k41.b.B(r18, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r18.s0();
        r13 = eu0.b.c(r18, r19);
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r9 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r15 = r6;
        r6 = r9.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        Boolean bool3 = null;
        jn0.o1 o1Var = null;
        Boolean bool4 = null;
        jn0.m1 m1Var = null;
        List list = null;
        jn0.e1 e1Var = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
                    bool = bool2;
                    o1Var = (jn0.o1) aa.c.b(aa.c.c(v0.a, false)).a(eVar, wVar);
                    break;
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
                    m1Var = (jn0.m1) aa.c.c(t0.a, true).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(p0.a, true)))).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    e1Var = (jn0.e1) aa.c.c(m0.a, false).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.p1 p1Var = (jn0.p1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p1Var.b);
        fVar.z0("isResolved");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(p1Var.c, bVar2, fVar, wVar, "resolvedBy");
        aa.c.b(aa.c.c(v0.a, false)).b(fVar, wVar, p1Var.d);
        fVar.z0("viewerCanResolve");
        jo.f4Shadow.C(p1Var.e, bVar2, fVar, wVar, "viewerCanUnresolve");
        jo.f4Shadow.C(p1Var.f, bVar2, fVar, wVar, "pullRequest");
        aa.c.c(t0.a, true).b(fVar, wVar, p1Var.g);
        fVar.z0("diffLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(p0.a, true)))).b(fVar, wVar, p1Var.h);
        fVar.z0("comments");
        aa.c.c(m0.a, false).b(fVar, wVar, p1Var.i);
        List list = eu0.b.a;
        eu0.b.d(fVar, wVar, p1Var.j);
    }
}
