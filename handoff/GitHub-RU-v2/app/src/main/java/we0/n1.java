package we0;

import gn0.r6;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "committedDate", "messageHeadline", "committedViaWeb", "authoredByCommitter", "abbreviatedOid", "committer", "author", "statusCheckRollup", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r13 = r5;
        r5 = r6.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r13 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r6 = r13.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r7 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        return new we0.l1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        k41.b.B(r14, "abbreviatedOid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        k41.b.B(r14, "authoredByCommitter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        k41.b.B(r14, "committedViaWeb");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        k41.b.B(r14, "messageHeadline");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        k41.b.B(r14, "committedDate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r6 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l1 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        ZonedDateTime zonedDateTime = null;
        String str2 = null;
        Boolean bool3 = null;
        String str3 = null;
        h1 h1Var = null;
        g1 g1Var = null;
        i1 i1Var = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
                    break;
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
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    h1Var = (h1) aa.c.b(aa.c.c(o1.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    g1Var = (g1) aa.c.b(aa.c.c(m1.a, false)).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    i1Var = (i1) aa.c.b(aa.c.c(p1.a, false)).a(eVar, wVar);
                    break;
                case 9:
                    bool = bool2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, l1 l1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l1Var.a);
        fVar.z0("committedDate");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, l1Var.b);
        fVar.z0("messageHeadline");
        bVar.b(fVar, wVar, l1Var.c);
        fVar.z0("committedViaWeb");
        aa.b bVar2 = aa.c.f;
        f4.C(l1Var.d, bVar2, fVar, wVar, "authoredByCommitter");
        f4.C(l1Var.e, bVar2, fVar, wVar, "abbreviatedOid");
        bVar.b(fVar, wVar, l1Var.f);
        fVar.z0("committer");
        aa.c.b(aa.c.c(o1.a, false)).b(fVar, wVar, l1Var.g);
        fVar.z0("author");
        aa.c.b(aa.c.c(m1.a, false)).b(fVar, wVar, l1Var.h);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(p1.a, false)).b(fVar, wVar, l1Var.i);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l1Var.j);
    }
}
