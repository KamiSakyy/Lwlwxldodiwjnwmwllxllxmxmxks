package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ub implements aaShadow.a {
    public static final ub a = new ub();
    public static final List b = sy.d0.o(new String[]{"issues", "pullRequests", "repos", "users", "organizations", "code", "id", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r8 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r9 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return new jn0.mh(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        k41.b.B(r12, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        k41.b.B(r12, "organizations");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        k41.b.B(r12, "users");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        k41.b.B(r12, "repos");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        k41.b.B(r12, "pullRequests");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        k41.b.B(r12, "issues");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.nh nhVar = null;
        jn0.bi biVar = null;
        jn0.ci ciVar = null;
        jn0.di diVar = null;
        jn0.zh zhVar = null;
        jn0.kh khVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    nhVar = (jn0.nh) aa.c.c(vb.a, false).a(eVar, wVar);
                    break;
                case 1:
                    biVar = (jn0.bi) aa.c.c(jc.a, false).a(eVar, wVar);
                    break;
                case 2:
                    ciVar = (jn0.ci) aa.c.c(kc.a, false).a(eVar, wVar);
                    break;
                case 3:
                    diVar = (jn0.di) aa.c.c(lc.a, false).a(eVar, wVar);
                    break;
                case 4:
                    zhVar = (jn0.zh) aa.c.c(hc.a, false).a(eVar, wVar);
                    break;
                case 5:
                    khVar = (jn0.kh) aa.c.b(aa.c.c(tb.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 7:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mh mhVar = (jn0.mh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mhVar, "value");
        fVar.z0("issues");
        aa.c.c(vb.a, false).b(fVar, wVar, mhVar.a);
        fVar.z0("pullRequests");
        aa.c.c(jc.a, false).b(fVar, wVar, mhVar.b);
        fVar.z0("repos");
        aa.c.c(kc.a, false).b(fVar, wVar, mhVar.c);
        fVar.z0("users");
        aa.c.c(lc.a, false).b(fVar, wVar, mhVar.d);
        fVar.z0("organizations");
        aa.c.c(hc.a, false).b(fVar, wVar, mhVar.e);
        fVar.z0("code");
        aa.c.b(aa.c.c(tb.a, false)).b(fVar, wVar, mhVar.f);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mhVar.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, mhVar.h);
    }
}
