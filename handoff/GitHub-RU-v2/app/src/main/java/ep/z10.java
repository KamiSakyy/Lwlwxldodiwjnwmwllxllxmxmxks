package ep;

import java.util.List;
import jo.aj0;
import jo.wi0;
import jo.xi0;
import jo.yi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z10 implements aa.a {
    public static final z10 a = new z10();
    public static final List b = sy.d0.o("copilotLicenseType", "isCopilotMobileChatEnabled", "viewerIsCopilotCodingAgentEnabled", "viewerCanSubscribeToCopilotIndividual", "viewerCanSubscribeToCopilotLimited", "copilotEndpoints", "copilotLimitedUser", "copilotConsumptiveUser", "copilotSubscriptionPlatform", "availableCopilotUpgradeSkus", "id", "__typename");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r19 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r20 = r8;
        r8 = r19.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r20 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r9 = r20.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r15 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r16 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return new jo.aj0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        k41.b.B(r22, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        k41.b.B(r22, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        k41.b.B(r22, "viewerCanSubscribeToCopilotLimited");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        k41.b.B(r22, "viewerCanSubscribeToCopilotIndividual");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        k41.b.B(r22, "viewerIsCopilotCodingAgentEnabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        k41.b.B(r22, "isCopilotMobileChatEnabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r9 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        r18 = r6;
        r6 = r9.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r18 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r19 = r7;
        r7 = r18.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        n10.a aVar = n10.a.o;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        m10.m8 m8Var = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        xi0 xi0Var = null;
        yi0 yi0Var = null;
        wi0 wi0Var = null;
        m10.q8 q8Var = null;
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    m8Var = (m10.m8) aa.c.b(aVar).a(eVar, wVar);
                    continue;
                case 1:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 2:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 5:
                    bool = bool2;
                    xi0Var = (xi0) aa.c.b(aa.c.c(w10.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    yi0Var = (yi0) aa.c.b(aa.c.c(x10.a, true)).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    wi0Var = (wi0) aa.c.b(aa.c.c(v10.a, true)).a(eVar, wVar);
                    break;
                case 8:
                    q8Var = (m10.q8) aa.c.b(n10.a.p).a(eVar, wVar);
                    continue;
                case 9:
                    list = (List) aa.c.b(aa.c.a(aVar)).a(eVar, wVar);
                    continue;
                case 10:
                    str = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 11:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    continue;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        aj0 aj0Var = (aj0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aj0Var, "value");
        fVar.z0("copilotLicenseType");
        n10.a aVar = n10.a.o;
        aa.c.b(aVar).b(fVar, wVar, aj0Var.a);
        fVar.z0("isCopilotMobileChatEnabled");
        aa.b bVar = aa.c.f;
        jo.f4.C(aj0Var.b, bVar, fVar, wVar, "viewerIsCopilotCodingAgentEnabled");
        jo.f4.C(aj0Var.c, bVar, fVar, wVar, "viewerCanSubscribeToCopilotIndividual");
        jo.f4.C(aj0Var.d, bVar, fVar, wVar, "viewerCanSubscribeToCopilotLimited");
        jo.f4.C(aj0Var.e, bVar, fVar, wVar, "copilotEndpoints");
        aa.c.b(aa.c.c(w10.a, false)).b(fVar, wVar, aj0Var.f);
        fVar.z0("copilotLimitedUser");
        aa.c.b(aa.c.c(x10.a, true)).b(fVar, wVar, aj0Var.g);
        fVar.z0("copilotConsumptiveUser");
        aa.c.b(aa.c.c(v10.a, true)).b(fVar, wVar, aj0Var.h);
        fVar.z0("copilotSubscriptionPlatform");
        aa.c.b(n10.a.p).b(fVar, wVar, aj0Var.i);
        fVar.z0("availableCopilotUpgradeSkus");
        aa.c.b(aa.c.a(aVar)).b(fVar, wVar, aj0Var.j);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, aj0Var.k);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, aj0Var.l);
    }
}
