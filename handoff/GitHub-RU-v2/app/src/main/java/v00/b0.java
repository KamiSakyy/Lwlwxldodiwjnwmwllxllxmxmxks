package v00;

import com.github.service.dotcom.models.response.copilot.EventResponse;
import com.github.service.dotcom.models.response.copilot.EventsResponse;
import fa1.q0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xn.d2;
import xn.e2;
import xn.f2;
import xn.f4;
import xn.g1;
import xn.g2;
import xn.h1;
import xn.h2;
import xn.i2;
import xn.i3;
import xn.j2;
import xn.j3;
import xn.k2;
import xn.m2;
import xn.t2;
import xn.v2;
import xn.y1;
import xn.y2;
import xn.z1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    public b0(y71.j jVar, int i, int i2) {
        this.r = jVar;
        this.s = i;
        this.t = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0401 A[Catch: Exception -> 0x03cc, TRY_ENTER, TryCatch #9 {Exception -> 0x03cc, blocks: (B:104:0x03cf, B:107:0x03d6, B:116:0x0401, B:118:0x0409, B:119:0x0414, B:121:0x041a, B:128:0x044b, B:140:0x049b), top: B:103:0x03cf }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x044b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0457 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0312 A[Catch: Exception -> 0x0300, TryCatch #13 {Exception -> 0x0300, blocks: (B:371:0x030a, B:373:0x0312, B:375:0x031e), top: B:370:0x030a }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0347 A[Catch: Exception -> 0x0302, TryCatch #24 {Exception -> 0x0302, blocks: (B:378:0x0328, B:380:0x0334, B:383:0x033f, B:385:0x0347, B:387:0x0351, B:389:0x0357, B:390:0x035c, B:392:0x0364), top: B:377:0x0328 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x02d9 A[Catch: Exception -> 0x02c9, TryCatch #10 {Exception -> 0x02c9, blocks: (B:403:0x02d1, B:405:0x02d9, B:409:0x02e7, B:411:0x02ed, B:413:0x02f5), top: B:402:0x02d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x02ed A[Catch: Exception -> 0x02c9, TryCatch #10 {Exception -> 0x02c9, blocks: (B:403:0x02d1, B:405:0x02d9, B:409:0x02e7, B:411:0x02ed, B:413:0x02f5), top: B:402:0x02d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0206 A[Catch: Exception -> 0x01f4, TryCatch #3 {Exception -> 0x01f4, blocks: (B:461:0x01fc, B:463:0x0206, B:464:0x0215, B:466:0x021b, B:468:0x022d), top: B:460:0x01fc }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        Object C15 = null;
        Object booleanValue = null;
        Object booleanValue2 = null;
        Object C17 = null;
        a0 a0Var;
        int i;
        q0 q0Var;
        a0 a0Var2;
        b71.a aVar;
        EventsResponse eventsResponse;
        x61.rShadow rVar;
        x61.rShadow rVar2;
        t2 t2Var;
        Integer num;
        String str;
        List list;
        b71.a aVar2;
        a0 a0Var3;
        String C;
        String str2;
        String C2;
        EventsResponse eventsResponse2;
        String C3;
        kotlinx.serialization.json.b bVar;
        x61.rShadow rVar3;
        LinkedHashMap linkedHashMap;
        q0 q0Var2;
        x61.rShadow rVar4;
        Boolean bool;
        Boolean bool2;
        kotlinx.serialization.json.b bVar2;
        kotlinx.serialization.json.c cVar2;
        String C4;
        kotlinx.serialization.json.b bVar3;
        String C5;
        String str3;
        kotlinx.serialization.json.b bVar4;
        String str4;
        kotlinx.serialization.json.b bVar5;
        String C6;
        boolean z;
        y2 y2Var;
        y2 y2Var2;
        String C7;
        kotlinx.serialization.json.b bVar6;
        boolean z2;
        Boolean b;
        sy.s i2Var;
        kotlinx.serialization.json.b bVar7;
        String C8;
        String C9;
        String C10;
        x61.rShadow rVar5;
        boolean z3;
        f4 f4Var;
        Boolean b2;
        x61.rShadow rVar6;
        kotlinx.serialization.json.b bVar8;
        Boolean b3;
        String C11;
        x61.rShadow rVar7;
        z1 z1Var;
        x61.rShadow rVar8;
        kotlinx.serialization.json.b bVar9;
        Boolean b4;
        String C12;
        String C13;
        kotlinx.serialization.json.c cVar3;
        kotlinx.serialization.json.b bVar10;
        kotlinx.serialization.json.c e;
        x61.rShadow rVar9;
        y1 y1Var;
        Set<Map.Entry> entrySet;
        h1 h1Var;
        kotlinx.serialization.json.c e2;
        sy.rShadow l;
        kotlinx.serialization.json.b bVar11;
        sy.s sVar;
        String C14;
        g1 g1Var;
        LinkedHashMap linkedHashMap2;
        kotlinx.serialization.json.b bVar12;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i2 = a0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = a0Var.u;
                b71.a aVar3 = b71.a.r;
                i = a0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    q0 q0Var3 = (q0) obj;
                    String str5 = "<this>";
                    k71.k.g(q0Var3, "<this>");
                    EventsResponse eventsResponse3 = (EventsResponse) q0Var3.b;
                    x61.rShadow rVar10 = x61.rShadow.r;
                    if (eventsResponse3 == null || (list = eventsResponse3.a) == null) {
                        q0Var = q0Var3;
                        a0Var2 = a0Var;
                        aVar = aVar3;
                        eventsResponse = eventsResponse3;
                        rVar = rVar10;
                        rVar2 = null;
                    } else {
                        rVar2 = new ArrayList(x61.n.F(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            EventResponse eventResponse = (EventResponse) it.next();
                            k71.k.g(eventResponse, str5);
                            j3 j3Var = eventResponse.e;
                            String str6 = eventResponse.a;
                            Instant instant = sy.f0.g(eventResponse.b).toInstant();
                            k71.k.f(instant, "toInstant(...)");
                            String str7 = eventResponse.c;
                            boolean z4 = eventResponse.d;
                            j3 j3Var2 = eventResponse.e;
                            String str8 = str5;
                            kotlinx.serialization.json.c cVar4 = eventResponse.f;
                            x61.rShadow rVar11 = rVar10;
                            Iterator it2 = it;
                            if (cVar4 == null) {
                                a0Var3 = a0Var;
                                aVar2 = aVar3;
                            } else {
                                aVar2 = aVar3;
                                a0Var3 = a0Var;
                                switch (j3Var2.ordinal()) {
                                    case 0:
                                    case 4:
                                    case 5:
                                    case 7:
                                    case 9:
                                    case 10:
                                    case 13:
                                    case 16:
                                    case 17:
                                    case 27:
                                    case 28:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                        break;
                                    case 1:
                                        C = sy.n.C(cVar4, "initialPrompt");
                                        if (C == null) {
                                            C = sy.n.C(cVar4, "source");
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                            switch (j3Var.ordinal()) {
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                    C2 = sy.n.C(cVar4, "toolName");
                                                    break;
                                            }
                                            String C15 = (cVar4 != null && ty.a.a[j3Var.ordinal()] == 3) ? sy.n.C(cVar4, "messageId") : null;
                                            if (cVar4 != null) {
                                                eventsResponse2 = eventsResponse3;
                                            } else {
                                                int ordinal = j3Var.ordinal();
                                                eventsResponse2 = eventsResponse3;
                                                if (ordinal != 10 && ordinal != 32 && ordinal != 34 && ordinal != 36) {
                                                    switch (ordinal) {
                                                    }
                                                    if (cVar4 != null && j3Var == j3.y) {
                                                        try {
                                                            bVar = (kotlinx.serialization.json.b) cVar4.get("toolRequests");
                                                        } catch (Exception unused) {
                                                        }
                                                        if (bVar != null) {
                                                            kotlinx.serialization.json.a d = l81.j.d(bVar);
                                                            x61.rShadow arrayList = new ArrayList();
                                                            Iterator it3 = d.r.iterator();
                                                            while (it3.hasNext()) {
                                                                Iterator it4 = it3;
                                                                String C16 = sy.n.C(l81.j.e((kotlinx.serialization.json.b) it3.next()), "toolCallId");
                                                                if (C16 != null) {
                                                                    arrayList.add(C16);
                                                                }
                                                                it3 = it4;
                                                            }
                                                            rVar3 = arrayList;
                                                            LinkedHashMap linkedHashMap3 = x61.s.r;
                                                            if (cVar4 != null) {
                                                                int ordinal2 = j3Var.ordinal();
                                                                linkedHashMap = linkedHashMap3;
                                                                if (ordinal2 == 19 || ordinal2 == 20) {
                                                                    try {
                                                                        kotlinx.serialization.json.b bVar13 = (kotlinx.serialization.json.b) cVar4.get("arguments");
                                                                        if (bVar13 != null) {
                                                                            linkedHashMap3 = sy.n.w(l81.j.e(bVar13));
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                        linkedHashMap3 = linkedHashMap;
                                                                    }
                                                                }
                                                                if (cVar4 != null) {
                                                                    q0Var2 = q0Var3;
                                                                } else {
                                                                    q0Var2 = q0Var3;
                                                                    if (j3Var == j3.B) {
                                                                        try {
                                                                            bVar2 = (kotlinx.serialization.json.b) cVar4.get("success");
                                                                        } catch (Exception unused3) {
                                                                        }
                                                                        if (bVar2 != null && (bool = l81.j.b(l81.j.f(bVar2))) != null) {
                                                                            rVar4 = rVar2;
                                                                            bool2 = bool;
                                                                            if (cVar4 != null && j3Var == j3.B) {
                                                                                try {
                                                                                    bVar3 = (kotlinx.serialization.json.b) cVar4.get("result");
                                                                                } catch (Exception unused4) {
                                                                                }
                                                                                if (bVar3 != null) {
                                                                                    C5 = sy.n.C(l81.j.e(bVar3), "content");
                                                                                    if (C5 != null) {
                                                                                    }
                                                                                    str3 = C5;
                                                                                    if (cVar4 != null && j3Var == j3.B) {
                                                                                        try {
                                                                                            bVar4 = (kotlinx.serialization.json.b) cVar4.get("result");
                                                                                        } catch (Exception unused5) {
                                                                                        }
                                                                                        if (bVar4 == null) {
                                                                                            kotlinx.serialization.json.c e3 = l81.j.e(bVar4);
                                                                                            kotlinx.serialization.json.b bVar14 = (kotlinx.serialization.json.b) cVar4.get("success");
                                                                                            if (bVar14 != null) {
                                                                                                str4 = "source";
                                                                                                try {
                                                                                                    z = k71.k.b(l81.j.b(l81.j.f(bVar14)), Boolean.FALSE);
                                                                                                } catch (Exception unused6) {
                                                                                                }
                                                                                            } else {
                                                                                                str4 = "source";
                                                                                                z = false;
                                                                                            }
                                                                                            C6 = z ? sy.n.C(e3, "content") : null;
                                                                                            if (C6 == null) {
                                                                                            }
                                                                                            String C17 = (cVar4 != null && j3Var == j3.t) ? sy.n.C(cVar4, "sessionId") : null;
                                                                                            switch (j3Var.ordinal()) {
                                                                                                case 30:
                                                                                                    if (cVar4 != null && j3Var == j3.C) {
                                                                                                        try {
                                                                                                            C7 = sy.n.C(cVar4, "requestId");
                                                                                                        } catch (Exception unused7) {
                                                                                                            y2Var = null;
                                                                                                        }
                                                                                                        if (C7 != null && (bVar6 = (kotlinx.serialization.json.b) cVar4.get("permissionRequest")) != null) {
                                                                                                            kotlinx.serialization.json.c e4 = l81.j.e(bVar6);
                                                                                                            String C18 = sy.n.C(e4, "kind");
                                                                                                            if (C18 == null) {
                                                                                                                C18 = "unknown";
                                                                                                            }
                                                                                                            String str9 = C18;
                                                                                                            String C19 = sy.n.C(e4, "toolCallId");
                                                                                                            String str10 = C19 == null ? C7 : C19;
                                                                                                            String C20 = sy.n.C(e4, "intention");
                                                                                                            String C21 = sy.n.C(e4, "fullCommandText");
                                                                                                            String C22 = sy.n.C(e4, "path");
                                                                                                            String C23 = sy.n.C(e4, "fileName");
                                                                                                            String C24 = sy.n.C(e4, "diff");
                                                                                                            String C25 = sy.n.C(e4, "toolName");
                                                                                                            try {
                                                                                                                kotlinx.serialization.json.b bVar15 = (kotlinx.serialization.json.b) e4.get("canOfferSessionApproval");
                                                                                                                z2 = (bVar15 == null || (b = l81.j.b(l81.j.f(bVar15))) == null) ? false : b.booleanValue();
                                                                                                            } catch (Exception unused8) {
                                                                                                                z2 = false;
                                                                                                            }
                                                                                                            y2Var = new y2(C7, str10, str9, C20, C21, C22, C23, C24, C25, z2);
                                                                                                            y2Var2 = y2Var;
                                                                                                            if (y2Var2 != null) {
                                                                                                                i2Var = new i2(y2Var2.a, y2Var2);
                                                                                                                sVar = i2Var;
                                                                                                                break;
                                                                                                            }
                                                                                                            sVar = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    y2Var2 = null;
                                                                                                    if (y2Var2 != null) {
                                                                                                    }
                                                                                                    sVar = null;
                                                                                                    break;
                                                                                                case 31:
                                                                                                    String C26 = (cVar4 != null && j3Var == j3.D) ? sy.n.C(cVar4, "requestId") : null;
                                                                                                    if (C26 != null) {
                                                                                                        if (cVar4 != null && j3Var == j3.D) {
                                                                                                            try {
                                                                                                                bVar7 = (kotlinx.serialization.json.b) cVar4.get("result");
                                                                                                            } catch (Exception unused9) {
                                                                                                            }
                                                                                                            if (bVar7 != null) {
                                                                                                                C8 = sy.n.C(l81.j.e(bVar7), "kind");
                                                                                                                i2Var = new h2(C26, C8);
                                                                                                                sVar = i2Var;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        C8 = null;
                                                                                                        i2Var = new h2(C26, C8);
                                                                                                        sVar = i2Var;
                                                                                                    }
                                                                                                    sVar = null;
                                                                                                    break;
                                                                                                case 32:
                                                                                                    if (cVar4 != null && j3Var == j3.E) {
                                                                                                        try {
                                                                                                            C9 = sy.n.C(cVar4, "requestId");
                                                                                                        } catch (Exception unused10) {
                                                                                                        }
                                                                                                        if (C9 != null && (C10 = sy.n.C(cVar4, "toolCallId")) != null) {
                                                                                                            try {
                                                                                                                kotlinx.serialization.json.b bVar16 = (kotlinx.serialization.json.b) cVar4.get("choices");
                                                                                                                if (bVar16 != null) {
                                                                                                                    kotlinx.serialization.json.a d2 = l81.j.d(bVar16);
                                                                                                                    rVar6 = new ArrayList();
                                                                                                                    Iterator it5 = d2.r.iterator();
                                                                                                                    while (it5.hasNext()) {
                                                                                                                        kotlinx.serialization.json.d f = l81.j.f((kotlinx.serialization.json.b) it5.next());
                                                                                                                        if (!f.b()) {
                                                                                                                            f = null;
                                                                                                                        }
                                                                                                                        String a = f != null ? f.a() : null;
                                                                                                                        if (a != null) {
                                                                                                                            rVar6.add(a);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    rVar6 = rVar11;
                                                                                                                }
                                                                                                                rVar5 = rVar6;
                                                                                                            } catch (Exception unused11) {
                                                                                                                rVar5 = rVar11;
                                                                                                            }
                                                                                                            String C27 = sy.n.C(cVar4, "question");
                                                                                                            try {
                                                                                                                kotlinx.serialization.json.b bVar17 = (kotlinx.serialization.json.b) cVar4.get("allowFreeform");
                                                                                                                z3 = (bVar17 == null || (b2 = l81.j.b(l81.j.f(bVar17))) == null) ? false : b2.booleanValue();
                                                                                                            } catch (Exception unused12) {
                                                                                                                z3 = false;
                                                                                                            }
                                                                                                            f4Var = new f4(C9, C10, C27, rVar5, z3);
                                                                                                            if (f4Var != null) {
                                                                                                                i2Var = new k2(f4Var.a, f4Var);
                                                                                                                sVar = i2Var;
                                                                                                                break;
                                                                                                            }
                                                                                                            sVar = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    f4Var = null;
                                                                                                    if (f4Var != null) {
                                                                                                    }
                                                                                                    sVar = null;
                                                                                                    break;
                                                                                                case 33:
                                                                                                    String C28 = (cVar4 != null && j3Var == j3.F) ? sy.n.C(cVar4, "requestId") : null;
                                                                                                    if (C28 != null) {
                                                                                                        String C29 = (cVar4 != null && j3Var == j3.F) ? sy.n.C(cVar4, "answer") : null;
                                                                                                        if (cVar4 != null && j3Var == j3.F) {
                                                                                                            try {
                                                                                                                bVar8 = (kotlinx.serialization.json.b) cVar4.get("wasFreeform");
                                                                                                            } catch (Exception unused13) {
                                                                                                            }
                                                                                                            if (bVar8 != null) {
                                                                                                                b3 = l81.j.b(l81.j.f(bVar8));
                                                                                                                i2Var = new j2(b3, C28, C29);
                                                                                                                sVar = i2Var;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        b3 = null;
                                                                                                        i2Var = new j2(b3, C28, C29);
                                                                                                        sVar = i2Var;
                                                                                                    }
                                                                                                    sVar = null;
                                                                                                    break;
                                                                                                case 34:
                                                                                                    if (cVar4 != null && j3Var == j3.G) {
                                                                                                        try {
                                                                                                            C11 = sy.n.C(cVar4, "requestId");
                                                                                                        } catch (Exception unused14) {
                                                                                                        }
                                                                                                        if (C11 != null) {
                                                                                                            try {
                                                                                                                kotlinx.serialization.json.b bVar18 = (kotlinx.serialization.json.b) cVar4.get("actions");
                                                                                                                if (bVar18 != null) {
                                                                                                                    kotlinx.serialization.json.a d3 = l81.j.d(bVar18);
                                                                                                                    rVar8 = new ArrayList();
                                                                                                                    Iterator it6 = d3.r.iterator();
                                                                                                                    while (it6.hasNext()) {
                                                                                                                        kotlinx.serialization.json.d f2 = l81.j.f((kotlinx.serialization.json.b) it6.next());
                                                                                                                        if (!f2.b()) {
                                                                                                                            f2 = null;
                                                                                                                        }
                                                                                                                        String a2 = f2 != null ? f2.a() : null;
                                                                                                                        if (a2 != null) {
                                                                                                                            rVar8.add(a2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    rVar8 = rVar11;
                                                                                                                }
                                                                                                                rVar7 = rVar8;
                                                                                                            } catch (Exception unused15) {
                                                                                                                rVar7 = rVar11;
                                                                                                            }
                                                                                                            z1Var = new z1(C11, sy.n.C(cVar4, "summary"), sy.n.C(cVar4, "planContent"), sy.n.C(cVar4, "recommendedAction"), rVar7);
                                                                                                            if (z1Var != null) {
                                                                                                                i2Var = new g2(z1Var.a, z1Var);
                                                                                                                sVar = i2Var;
                                                                                                                break;
                                                                                                            }
                                                                                                            sVar = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    z1Var = null;
                                                                                                    if (z1Var != null) {
                                                                                                    }
                                                                                                    sVar = null;
                                                                                                    break;
                                                                                                case 35:
                                                                                                    String C30 = (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "requestId") : null;
                                                                                                    if (C30 != null) {
                                                                                                        if (cVar4 != null && j3Var == j3.H) {
                                                                                                            try {
                                                                                                                bVar9 = (kotlinx.serialization.json.b) cVar4.get("approved");
                                                                                                            } catch (Exception unused16) {
                                                                                                            }
                                                                                                            if (bVar9 != null) {
                                                                                                                b4 = l81.j.b(l81.j.f(bVar9));
                                                                                                                i2Var = new f2(C30, b4, (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "selectedAction") : null, (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "feedback") : null);
                                                                                                                sVar = i2Var;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        b4 = null;
                                                                                                        if (cVar4 != null) {
                                                                                                            if (cVar4 != null) {
                                                                                                                i2Var = new f2(C30, b4, (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "selectedAction") : null, (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "feedback") : null);
                                                                                                                sVar = i2Var;
                                                                                                            }
                                                                                                            i2Var = new f2(C30, b4, (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "selectedAction") : null, (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "feedback") : null);
                                                                                                            sVar = i2Var;
                                                                                                        }
                                                                                                        i2Var = new f2(C30, b4, (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "selectedAction") : null, (cVar4 != null && j3Var == j3.H) ? sy.n.C(cVar4, "feedback") : null);
                                                                                                        sVar = i2Var;
                                                                                                    }
                                                                                                    sVar = null;
                                                                                                    break;
                                                                                                case 36:
                                                                                                    if (cVar4 != null) {
                                                                                                        try {
                                                                                                            C12 = sy.n.C(cVar4, "requestId");
                                                                                                        } catch (Exception unused17) {
                                                                                                        }
                                                                                                        if (C12 != null && (C13 = sy.n.C(cVar4, "toolCallId")) != null) {
                                                                                                            try {
                                                                                                                bVar11 = (kotlinx.serialization.json.b) cVar4.get("requestedSchema");
                                                                                                            } catch (Exception unused18) {
                                                                                                            }
                                                                                                            if (bVar11 != null) {
                                                                                                                cVar3 = l81.j.e(bVar11);
                                                                                                                if (cVar3 != null) {
                                                                                                                    try {
                                                                                                                        bVar10 = (kotlinx.serialization.json.b) cVar3.get("properties");
                                                                                                                    } catch (Exception unused19) {
                                                                                                                    }
                                                                                                                    if (bVar10 != null) {
                                                                                                                        e = l81.j.e(bVar10);
                                                                                                                        if (e != null || (entrySet = e.r.entrySet()) == null) {
                                                                                                                            rVar9 = rVar11;
                                                                                                                        } else {
                                                                                                                            x61.rShadow arrayList2 = new ArrayList();
                                                                                                                            for (Map.Entry entry : entrySet) {
                                                                                                                                String str11 = (String) entry.getKey();
                                                                                                                                try {
                                                                                                                                    e2 = l81.j.e((kotlinx.serialization.json.b) entry.getValue());
                                                                                                                                    l = t.z.l(e2);
                                                                                                                                } catch (Exception unused20) {
                                                                                                                                }
                                                                                                                                if (l != null) {
                                                                                                                                    h1Var = new h1(str11, sy.n.C(e2, "title"), sy.n.C(e2, "description"), l);
                                                                                                                                    if (h1Var == null) {
                                                                                                                                        arrayList2.add(h1Var);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                h1Var = null;
                                                                                                                                if (h1Var == null) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                            rVar9 = arrayList2;
                                                                                                                        }
                                                                                                                        Set set = x61.t.r;
                                                                                                                        if (cVar3 != null) {
                                                                                                                            try {
                                                                                                                                kotlinx.serialization.json.b bVar19 = (kotlinx.serialization.json.b) cVar3.get("required");
                                                                                                                                if (bVar19 != null) {
                                                                                                                                    kotlinx.serialization.json.a d4 = l81.j.d(bVar19);
                                                                                                                                    ArrayList arrayList3 = new ArrayList();
                                                                                                                                    Iterator it7 = d4.r.iterator();
                                                                                                                                    while (it7.hasNext()) {
                                                                                                                                        kotlinx.serialization.json.d f3 = l81.j.f((kotlinx.serialization.json.b) it7.next());
                                                                                                                                        if (!f3.b()) {
                                                                                                                                            f3 = null;
                                                                                                                                        }
                                                                                                                                        String a3 = f3 != null ? f3.a() : null;
                                                                                                                                        if (a3 != null) {
                                                                                                                                            arrayList3.add(a3);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    set = x61.m.K0(arrayList3);
                                                                                                                                }
                                                                                                                            } catch (Exception unused21) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                        y1Var = new y1(C12, C13, sy.n.C(cVar4, "message"), rVar9, set);
                                                                                                                        if (y1Var != null) {
                                                                                                                            i2Var = new e2(y1Var.a, y1Var);
                                                                                                                            sVar = i2Var;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        sVar = null;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                e = null;
                                                                                                                if (e != null) {
                                                                                                                }
                                                                                                                rVar9 = rVar11;
                                                                                                                Set set2 = x61.t.r;
                                                                                                                if (cVar3 != null) {
                                                                                                                }
                                                                                                                y1Var = new y1(C12, C13, sy.n.C(cVar4, "message"), rVar9, set2);
                                                                                                                if (y1Var != null) {
                                                                                                                }
                                                                                                                sVar = null;
                                                                                                            }
                                                                                                            cVar3 = null;
                                                                                                            if (cVar3 != null) {
                                                                                                            }
                                                                                                            e = null;
                                                                                                            if (e != null) {
                                                                                                            }
                                                                                                            rVar9 = rVar11;
                                                                                                            Set set22 = x61.t.r;
                                                                                                            if (cVar3 != null) {
                                                                                                            }
                                                                                                            y1Var = new y1(C12, C13, sy.n.C(cVar4, "message"), rVar9, set22);
                                                                                                            if (y1Var != null) {
                                                                                                            }
                                                                                                            sVar = null;
                                                                                                        }
                                                                                                    }
                                                                                                    y1Var = null;
                                                                                                    if (y1Var != null) {
                                                                                                    }
                                                                                                    sVar = null;
                                                                                                    break;
                                                                                                case 37:
                                                                                                    if (cVar4 != null) {
                                                                                                        try {
                                                                                                            C14 = sy.n.C(cVar4, "requestId");
                                                                                                        } catch (Exception unused22) {
                                                                                                        }
                                                                                                        if (C14 != null) {
                                                                                                            String C31 = sy.n.C(cVar4, "action");
                                                                                                            if (C31 != null) {
                                                                                                                g1.Companion.getClass();
                                                                                                                g1Var = (g1) g1.s.get(C31);
                                                                                                            } else {
                                                                                                                g1Var = null;
                                                                                                            }
                                                                                                            try {
                                                                                                                bVar12 = (kotlinx.serialization.json.b) cVar4.get("content");
                                                                                                            } catch (Exception unused23) {
                                                                                                            }
                                                                                                            if (bVar12 != null) {
                                                                                                                linkedHashMap2 = sy.n.w(l81.j.e(bVar12));
                                                                                                                i2Var = new d2(C14, g1Var, linkedHashMap2);
                                                                                                                sVar = i2Var;
                                                                                                                break;
                                                                                                            }
                                                                                                            linkedHashMap2 = null;
                                                                                                            i2Var = new d2(C14, g1Var, linkedHashMap2);
                                                                                                            sVar = i2Var;
                                                                                                        }
                                                                                                    }
                                                                                                    i2Var = null;
                                                                                                    sVar = i2Var;
                                                                                                default:
                                                                                                    sVar = null;
                                                                                                    break;
                                                                                            }
                                                                                            Boolean bool3 = eventResponse.h;
                                                                                            boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
                                                                                            Boolean bool4 = eventResponse.g;
                                                                                            boolean booleanValue2 = bool4 != null ? bool4.booleanValue() : false;
                                                                                            x61.rShadow rVar12 = rVar4;
                                                                                            rVar12.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                            rVar2 = rVar12;
                                                                                            str5 = str8;
                                                                                            rVar10 = rVar11;
                                                                                            it = it2;
                                                                                            aVar3 = aVar2;
                                                                                            a0Var = a0Var3;
                                                                                            eventsResponse3 = eventsResponse2;
                                                                                            q0Var3 = q0Var2;
                                                                                        } else {
                                                                                            str4 = "source";
                                                                                        }
                                                                                        bVar5 = (kotlinx.serialization.json.b) cVar4.get("toolResult");
                                                                                        if (bVar5 != null) {
                                                                                            kotlinx.serialization.json.c e5 = l81.j.e(bVar5);
                                                                                            String C32 = sy.n.C(e5, "resultType");
                                                                                            if (C32 == null || C32.equals("success")) {
                                                                                                kotlinx.serialization.json.b bVar20 = (kotlinx.serialization.json.b) cVar4.get("error");
                                                                                                if (bVar20 != null) {
                                                                                                    C6 = sy.n.C(l81.j.e(bVar20), "message");
                                                                                                }
                                                                                            } else {
                                                                                                C6 = sy.n.C(e5, "textResultForLlm");
                                                                                            }
                                                                                            if (cVar4 != null) {
                                                                                                switch (j3Var.ordinal()) {
                                                                                                }
                                                                                                Boolean bool32 = eventResponse.h;
                                                                                                if (bool32 != null) {
                                                                                                }
                                                                                                Boolean bool42 = eventResponse.g;
                                                                                                if (bool42 != null) {
                                                                                                }
                                                                                                if (cVar4 != null) {
                                                                                                    if (cVar4 != null) {
                                                                                                        x61.rShadow rVar122 = rVar4;
                                                                                                        rVar122.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                                        rVar2 = rVar122;
                                                                                                        str5 = str8;
                                                                                                        rVar10 = rVar11;
                                                                                                        it = it2;
                                                                                                        aVar3 = aVar2;
                                                                                                        a0Var = a0Var3;
                                                                                                        eventsResponse3 = eventsResponse2;
                                                                                                        q0Var3 = q0Var2;
                                                                                                    }
                                                                                                    x61.rShadow rVar1222 = rVar4;
                                                                                                    rVar1222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                                    rVar2 = rVar1222;
                                                                                                    str5 = str8;
                                                                                                    rVar10 = rVar11;
                                                                                                    it = it2;
                                                                                                    aVar3 = aVar2;
                                                                                                    a0Var = a0Var3;
                                                                                                    eventsResponse3 = eventsResponse2;
                                                                                                    q0Var3 = q0Var2;
                                                                                                }
                                                                                                if (cVar4 != null) {
                                                                                                }
                                                                                                x61.rShadow rVar12222 = rVar4;
                                                                                                rVar12222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                                rVar2 = rVar12222;
                                                                                                str5 = str8;
                                                                                                rVar10 = rVar11;
                                                                                                it = it2;
                                                                                                aVar3 = aVar2;
                                                                                                a0Var = a0Var3;
                                                                                                eventsResponse3 = eventsResponse2;
                                                                                                q0Var3 = q0Var2;
                                                                                            }
                                                                                            switch (j3Var.ordinal()) {
                                                                                            }
                                                                                            Boolean bool322 = eventResponse.h;
                                                                                            if (bool322 != null) {
                                                                                            }
                                                                                            Boolean bool422 = eventResponse.g;
                                                                                            if (bool422 != null) {
                                                                                            }
                                                                                            if (cVar4 != null) {
                                                                                            }
                                                                                            if (cVar4 != null) {
                                                                                            }
                                                                                            x61.rShadow rVar122222 = rVar4;
                                                                                            rVar122222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                            rVar2 = rVar122222;
                                                                                            str5 = str8;
                                                                                            rVar10 = rVar11;
                                                                                            it = it2;
                                                                                            aVar3 = aVar2;
                                                                                            a0Var = a0Var3;
                                                                                            eventsResponse3 = eventsResponse2;
                                                                                            q0Var3 = q0Var2;
                                                                                        }
                                                                                        C6 = null;
                                                                                        if (cVar4 != null) {
                                                                                        }
                                                                                        switch (j3Var.ordinal()) {
                                                                                        }
                                                                                        Boolean bool3222 = eventResponse.h;
                                                                                        if (bool3222 != null) {
                                                                                        }
                                                                                        Boolean bool4222 = eventResponse.g;
                                                                                        if (bool4222 != null) {
                                                                                        }
                                                                                        if (cVar4 != null) {
                                                                                        }
                                                                                        if (cVar4 != null) {
                                                                                        }
                                                                                        x61.rShadow rVar1222222 = rVar4;
                                                                                        rVar1222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                        rVar2 = rVar1222222;
                                                                                        str5 = str8;
                                                                                        rVar10 = rVar11;
                                                                                        it = it2;
                                                                                        aVar3 = aVar2;
                                                                                        a0Var = a0Var3;
                                                                                        eventsResponse3 = eventsResponse2;
                                                                                        q0Var3 = q0Var2;
                                                                                    }
                                                                                    str4 = "source";
                                                                                    C6 = null;
                                                                                    if (cVar4 != null) {
                                                                                    }
                                                                                    switch (j3Var.ordinal()) {
                                                                                    }
                                                                                    Boolean bool32222 = eventResponse.h;
                                                                                    if (bool32222 != null) {
                                                                                    }
                                                                                    Boolean bool42222 = eventResponse.g;
                                                                                    if (bool42222 != null) {
                                                                                    }
                                                                                    if (cVar4 != null) {
                                                                                    }
                                                                                    if (cVar4 != null) {
                                                                                    }
                                                                                    x61.rShadow rVar12222222 = rVar4;
                                                                                    rVar12222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                    rVar2 = rVar12222222;
                                                                                    str5 = str8;
                                                                                    rVar10 = rVar11;
                                                                                    it = it2;
                                                                                    aVar3 = aVar2;
                                                                                    a0Var = a0Var3;
                                                                                    eventsResponse3 = eventsResponse2;
                                                                                    q0Var3 = q0Var2;
                                                                                }
                                                                                C5 = sy.n.C(cVar4, "toolResult");
                                                                                if (C5 == null) {
                                                                                    kotlinx.serialization.json.b bVar21 = (kotlinx.serialization.json.b) cVar4.get("toolResult");
                                                                                    if (bVar21 != null) {
                                                                                        C5 = sy.n.C(l81.j.e(bVar21), "textResultForLlm");
                                                                                    }
                                                                                }
                                                                                str3 = C5;
                                                                                if (cVar4 != null) {
                                                                                    bVar4 = (kotlinx.serialization.json.b) cVar4.get("result");
                                                                                    if (bVar4 == null) {
                                                                                    }
                                                                                    bVar5 = (kotlinx.serialization.json.b) cVar4.get("toolResult");
                                                                                    if (bVar5 != null) {
                                                                                    }
                                                                                    C6 = null;
                                                                                    if (cVar4 != null) {
                                                                                    }
                                                                                    switch (j3Var.ordinal()) {
                                                                                    }
                                                                                    Boolean bool322222 = eventResponse.h;
                                                                                    if (bool322222 != null) {
                                                                                    }
                                                                                    Boolean bool422222 = eventResponse.g;
                                                                                    if (bool422222 != null) {
                                                                                    }
                                                                                    if (cVar4 != null) {
                                                                                    }
                                                                                    if (cVar4 != null) {
                                                                                    }
                                                                                    x61.rShadow rVar122222222 = rVar4;
                                                                                    rVar122222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                    rVar2 = rVar122222222;
                                                                                    str5 = str8;
                                                                                    rVar10 = rVar11;
                                                                                    it = it2;
                                                                                    aVar3 = aVar2;
                                                                                    a0Var = a0Var3;
                                                                                    eventsResponse3 = eventsResponse2;
                                                                                    q0Var3 = q0Var2;
                                                                                }
                                                                                str4 = "source";
                                                                                C6 = null;
                                                                                if (cVar4 != null) {
                                                                                }
                                                                                switch (j3Var.ordinal()) {
                                                                                }
                                                                                Boolean bool3222222 = eventResponse.h;
                                                                                if (bool3222222 != null) {
                                                                                }
                                                                                Boolean bool4222222 = eventResponse.g;
                                                                                if (bool4222222 != null) {
                                                                                }
                                                                                if (cVar4 != null) {
                                                                                }
                                                                                if (cVar4 != null) {
                                                                                }
                                                                                x61.rShadow rVar1222222222 = rVar4;
                                                                                rVar1222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                rVar2 = rVar1222222222;
                                                                                str5 = str8;
                                                                                rVar10 = rVar11;
                                                                                it = it2;
                                                                                aVar3 = aVar2;
                                                                                a0Var = a0Var3;
                                                                                eventsResponse3 = eventsResponse2;
                                                                                q0Var3 = q0Var2;
                                                                            }
                                                                            str3 = null;
                                                                            if (cVar4 != null) {
                                                                            }
                                                                            str4 = "source";
                                                                            C6 = null;
                                                                            if (cVar4 != null) {
                                                                            }
                                                                            switch (j3Var.ordinal()) {
                                                                            }
                                                                            Boolean bool32222222 = eventResponse.h;
                                                                            if (bool32222222 != null) {
                                                                            }
                                                                            Boolean bool42222222 = eventResponse.g;
                                                                            if (bool42222222 != null) {
                                                                            }
                                                                            if (cVar4 != null) {
                                                                            }
                                                                            if (cVar4 != null) {
                                                                            }
                                                                            x61.rShadow rVar12222222222 = rVar4;
                                                                            rVar12222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                            rVar2 = rVar12222222222;
                                                                            str5 = str8;
                                                                            rVar10 = rVar11;
                                                                            it = it2;
                                                                            aVar3 = aVar2;
                                                                            a0Var = a0Var3;
                                                                            eventsResponse3 = eventsResponse2;
                                                                            q0Var3 = q0Var2;
                                                                        }
                                                                        kotlinx.serialization.json.b bVar22 = (kotlinx.serialization.json.b) cVar4.get("toolResult");
                                                                        if (bVar22 != null) {
                                                                            try {
                                                                                cVar2 = l81.j.e(bVar22);
                                                                            } catch (Exception unused24) {
                                                                                cVar2 = null;
                                                                            }
                                                                            if (cVar2 != null) {
                                                                                rVar4 = rVar2;
                                                                                try {
                                                                                    C4 = sy.n.C(cVar2, "resultType");
                                                                                } catch (Exception unused25) {
                                                                                }
                                                                                if (C4 != null) {
                                                                                    bool = Boolean.valueOf(C4.equals("success"));
                                                                                } else {
                                                                                    kotlinx.serialization.json.b bVar23 = (kotlinx.serialization.json.b) cVar2.get("success");
                                                                                    if (bVar23 != null) {
                                                                                        bool = l81.j.b(l81.j.f(bVar23));
                                                                                    }
                                                                                    bool = null;
                                                                                }
                                                                            } else {
                                                                                rVar4 = rVar2;
                                                                                bool = Boolean.TRUE;
                                                                            }
                                                                            bool2 = bool;
                                                                            if (cVar4 != null) {
                                                                                bVar3 = (kotlinx.serialization.json.b) cVar4.get("result");
                                                                                if (bVar3 != null) {
                                                                                }
                                                                                C5 = sy.n.C(cVar4, "toolResult");
                                                                                if (C5 == null) {
                                                                                }
                                                                                str3 = C5;
                                                                                if (cVar4 != null) {
                                                                                }
                                                                                str4 = "source";
                                                                                C6 = null;
                                                                                if (cVar4 != null) {
                                                                                }
                                                                                switch (j3Var.ordinal()) {
                                                                                }
                                                                                Boolean bool322222222 = eventResponse.h;
                                                                                if (bool322222222 != null) {
                                                                                }
                                                                                Boolean bool422222222 = eventResponse.g;
                                                                                if (bool422222222 != null) {
                                                                                }
                                                                                if (cVar4 != null) {
                                                                                }
                                                                                if (cVar4 != null) {
                                                                                }
                                                                                x61.rShadow rVar122222222222 = rVar4;
                                                                                rVar122222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                                rVar2 = rVar122222222222;
                                                                                str5 = str8;
                                                                                rVar10 = rVar11;
                                                                                it = it2;
                                                                                aVar3 = aVar2;
                                                                                a0Var = a0Var3;
                                                                                eventsResponse3 = eventsResponse2;
                                                                                q0Var3 = q0Var2;
                                                                            }
                                                                            str3 = null;
                                                                            if (cVar4 != null) {
                                                                            }
                                                                            str4 = "source";
                                                                            C6 = null;
                                                                            if (cVar4 != null) {
                                                                            }
                                                                            switch (j3Var.ordinal()) {
                                                                            }
                                                                            Boolean bool3222222222 = eventResponse.h;
                                                                            if (bool3222222222 != null) {
                                                                            }
                                                                            Boolean bool4222222222 = eventResponse.g;
                                                                            if (bool4222222222 != null) {
                                                                            }
                                                                            if (cVar4 != null) {
                                                                            }
                                                                            if (cVar4 != null) {
                                                                            }
                                                                            x61.rShadow rVar1222222222222 = rVar4;
                                                                            rVar1222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                            rVar2 = rVar1222222222222;
                                                                            str5 = str8;
                                                                            rVar10 = rVar11;
                                                                            it = it2;
                                                                            aVar3 = aVar2;
                                                                            a0Var = a0Var3;
                                                                            eventsResponse3 = eventsResponse2;
                                                                            q0Var3 = q0Var2;
                                                                        }
                                                                        rVar4 = rVar2;
                                                                        bool = null;
                                                                        bool2 = bool;
                                                                        if (cVar4 != null) {
                                                                        }
                                                                        str3 = null;
                                                                        if (cVar4 != null) {
                                                                        }
                                                                        str4 = "source";
                                                                        C6 = null;
                                                                        if (cVar4 != null) {
                                                                        }
                                                                        switch (j3Var.ordinal()) {
                                                                        }
                                                                        Boolean bool32222222222 = eventResponse.h;
                                                                        if (bool32222222222 != null) {
                                                                        }
                                                                        Boolean bool42222222222 = eventResponse.g;
                                                                        if (bool42222222222 != null) {
                                                                        }
                                                                        if (cVar4 != null) {
                                                                        }
                                                                        if (cVar4 != null) {
                                                                        }
                                                                        x61.rShadow rVar12222222222222 = rVar4;
                                                                        rVar12222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                        rVar2 = rVar12222222222222;
                                                                        str5 = str8;
                                                                        rVar10 = rVar11;
                                                                        it = it2;
                                                                        aVar3 = aVar2;
                                                                        a0Var = a0Var3;
                                                                        eventsResponse3 = eventsResponse2;
                                                                        q0Var3 = q0Var2;
                                                                    }
                                                                }
                                                                rVar4 = rVar2;
                                                                bool2 = null;
                                                                if (cVar4 != null) {
                                                                }
                                                                str3 = null;
                                                                if (cVar4 != null) {
                                                                }
                                                                str4 = "source";
                                                                C6 = null;
                                                                if (cVar4 != null) {
                                                                }
                                                                switch (j3Var.ordinal()) {
                                                                }
                                                                Boolean bool322222222222 = eventResponse.h;
                                                                if (bool322222222222 != null) {
                                                                }
                                                                Boolean bool422222222222 = eventResponse.g;
                                                                if (bool422222222222 != null) {
                                                                }
                                                                if (cVar4 != null) {
                                                                }
                                                                if (cVar4 != null) {
                                                                }
                                                                x61.rShadow rVar122222222222222 = rVar4;
                                                                rVar122222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                                rVar2 = rVar122222222222222;
                                                                str5 = str8;
                                                                rVar10 = rVar11;
                                                                it = it2;
                                                                aVar3 = aVar2;
                                                                a0Var = a0Var3;
                                                                eventsResponse3 = eventsResponse2;
                                                                q0Var3 = q0Var2;
                                                            }
                                                            linkedHashMap = linkedHashMap3;
                                                            if (cVar4 != null) {
                                                            }
                                                            rVar4 = rVar2;
                                                            bool2 = null;
                                                            if (cVar4 != null) {
                                                            }
                                                            str3 = null;
                                                            if (cVar4 != null) {
                                                            }
                                                            str4 = "source";
                                                            C6 = null;
                                                            if (cVar4 != null) {
                                                            }
                                                            switch (j3Var.ordinal()) {
                                                            }
                                                            Boolean bool3222222222222 = eventResponse.h;
                                                            if (bool3222222222222 != null) {
                                                            }
                                                            Boolean bool4222222222222 = eventResponse.g;
                                                            if (bool4222222222222 != null) {
                                                            }
                                                            if (cVar4 != null) {
                                                            }
                                                            if (cVar4 != null) {
                                                            }
                                                            x61.rShadow rVar1222222222222222 = rVar4;
                                                            rVar1222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                            rVar2 = rVar1222222222222222;
                                                            str5 = str8;
                                                            rVar10 = rVar11;
                                                            it = it2;
                                                            aVar3 = aVar2;
                                                            a0Var = a0Var3;
                                                            eventsResponse3 = eventsResponse2;
                                                            q0Var3 = q0Var2;
                                                        }
                                                    }
                                                    rVar3 = rVar11;
                                                    LinkedHashMap linkedHashMap32 = x61.s.r;
                                                    if (cVar4 != null) {
                                                    }
                                                    linkedHashMap = linkedHashMap32;
                                                    if (cVar4 != null) {
                                                    }
                                                    rVar4 = rVar2;
                                                    bool2 = null;
                                                    if (cVar4 != null) {
                                                    }
                                                    str3 = null;
                                                    if (cVar4 != null) {
                                                    }
                                                    str4 = "source";
                                                    C6 = null;
                                                    if (cVar4 != null) {
                                                    }
                                                    switch (j3Var.ordinal()) {
                                                    }
                                                    Boolean bool32222222222222 = eventResponse.h;
                                                    if (bool32222222222222 != null) {
                                                    }
                                                    Boolean bool42222222222222 = eventResponse.g;
                                                    if (bool42222222222222 != null) {
                                                    }
                                                    if (cVar4 != null) {
                                                    }
                                                    if (cVar4 != null) {
                                                    }
                                                    x61.rShadow rVar12222222222222222 = rVar4;
                                                    rVar12222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                    rVar2 = rVar12222222222222222;
                                                    str5 = str8;
                                                    rVar10 = rVar11;
                                                    it = it2;
                                                    aVar3 = aVar2;
                                                    a0Var = a0Var3;
                                                    eventsResponse3 = eventsResponse2;
                                                    q0Var3 = q0Var2;
                                                }
                                                C3 = sy.n.C(cVar4, "toolCallId");
                                                if (cVar4 != null) {
                                                    bVar = (kotlinx.serialization.json.b) cVar4.get("toolRequests");
                                                    if (bVar != null) {
                                                    }
                                                }
                                                rVar3 = rVar11;
                                                LinkedHashMap linkedHashMap322 = x61.s.r;
                                                if (cVar4 != null) {
                                                }
                                                linkedHashMap = linkedHashMap322;
                                                if (cVar4 != null) {
                                                }
                                                rVar4 = rVar2;
                                                bool2 = null;
                                                if (cVar4 != null) {
                                                }
                                                str3 = null;
                                                if (cVar4 != null) {
                                                }
                                                str4 = "source";
                                                C6 = null;
                                                if (cVar4 != null) {
                                                }
                                                switch (j3Var.ordinal()) {
                                                }
                                                Boolean bool322222222222222 = eventResponse.h;
                                                if (bool322222222222222 != null) {
                                                }
                                                Boolean bool422222222222222 = eventResponse.g;
                                                if (bool422222222222222 != null) {
                                                }
                                                if (cVar4 != null) {
                                                }
                                                if (cVar4 != null) {
                                                }
                                                x61.rShadow rVar122222222222222222 = rVar4;
                                                rVar122222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                                rVar2 = rVar122222222222222222;
                                                str5 = str8;
                                                rVar10 = rVar11;
                                                it = it2;
                                                aVar3 = aVar2;
                                                a0Var = a0Var3;
                                                eventsResponse3 = eventsResponse2;
                                                q0Var3 = q0Var2;
                                            }
                                            C3 = null;
                                            if (cVar4 != null) {
                                            }
                                            rVar3 = rVar11;
                                            LinkedHashMap linkedHashMap3222 = x61.s.r;
                                            if (cVar4 != null) {
                                            }
                                            linkedHashMap = linkedHashMap3222;
                                            if (cVar4 != null) {
                                            }
                                            rVar4 = rVar2;
                                            bool2 = null;
                                            if (cVar4 != null) {
                                            }
                                            str3 = null;
                                            if (cVar4 != null) {
                                            }
                                            str4 = "source";
                                            C6 = null;
                                            if (cVar4 != null) {
                                            }
                                            switch (j3Var.ordinal()) {
                                            }
                                            Boolean bool3222222222222222 = eventResponse.h;
                                            if (bool3222222222222222 != null) {
                                            }
                                            Boolean bool4222222222222222 = eventResponse.g;
                                            if (bool4222222222222222 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            x61.rShadow rVar1222222222222222222 = rVar4;
                                            rVar1222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                            rVar2 = rVar1222222222222222222;
                                            str5 = str8;
                                            rVar10 = rVar11;
                                            it = it2;
                                            aVar3 = aVar2;
                                            a0Var = a0Var3;
                                            eventsResponse3 = eventsResponse2;
                                            q0Var3 = q0Var2;
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                            if (cVar4 != null) {
                                            }
                                            C3 = null;
                                            if (cVar4 != null) {
                                            }
                                            rVar3 = rVar11;
                                            LinkedHashMap linkedHashMap32222 = x61.s.r;
                                            if (cVar4 != null) {
                                            }
                                            linkedHashMap = linkedHashMap32222;
                                            if (cVar4 != null) {
                                            }
                                            rVar4 = rVar2;
                                            bool2 = null;
                                            if (cVar4 != null) {
                                            }
                                            str3 = null;
                                            if (cVar4 != null) {
                                            }
                                            str4 = "source";
                                            C6 = null;
                                            if (cVar4 != null) {
                                            }
                                            switch (j3Var.ordinal()) {
                                            }
                                            Boolean bool32222222222222222 = eventResponse.h;
                                            if (bool32222222222222222 != null) {
                                            }
                                            Boolean bool42222222222222222 = eventResponse.g;
                                            if (bool42222222222222222 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            x61.rShadow rVar12222222222222222222 = rVar4;
                                            rVar12222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                            rVar2 = rVar12222222222222222222;
                                            str5 = str8;
                                            rVar10 = rVar11;
                                            it = it2;
                                            aVar3 = aVar2;
                                            a0Var = a0Var3;
                                            eventsResponse3 = eventsResponse2;
                                            q0Var3 = q0Var2;
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap322222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap322222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool322222222222222222 = eventResponse.h;
                                        if (bool322222222222222222 != null) {
                                        }
                                        Boolean bool422222222222222222 = eventResponse.g;
                                        if (bool422222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar122222222222222222222 = rVar4;
                                        rVar122222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar122222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 2:
                                        C = sy.n.C(cVar4, "source");
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap3222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap3222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool3222222222222222222 = eventResponse.h;
                                        if (bool3222222222222222222 != null) {
                                        }
                                        Boolean bool4222222222222222222 = eventResponse.g;
                                        if (bool4222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar1222222222222222222222 = rVar4;
                                        rVar1222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar1222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 3:
                                        kotlinx.serialization.json.b bVar24 = (kotlinx.serialization.json.b) cVar4.get("error");
                                        if (bVar24 == null || (C = sy.n.C(l81.j.e(bVar24), "message")) == null) {
                                            C = sy.n.C(cVar4, "message");
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap32222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap32222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool32222222222222222222 = eventResponse.h;
                                        if (bool32222222222222222222 != null) {
                                        }
                                        Boolean bool42222222222222222222 = eventResponse.g;
                                        if (bool42222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar12222222222222222222222 = rVar4;
                                        rVar12222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar12222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 6:
                                        C = sy.n.C(cVar4, "model");
                                        if (C == null) {
                                            C = sy.n.C(cVar4, "message");
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap322222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap322222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool322222222222222222222 = eventResponse.h;
                                        if (bool322222222222222222222 != null) {
                                        }
                                        Boolean bool422222222222222222222 = eventResponse.g;
                                        if (bool422222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar122222222222222222222222 = rVar4;
                                        rVar122222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar122222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 8:
                                        String C33 = sy.n.C(cVar4, "message");
                                        if (C33 == null) {
                                            C = sy.n.C(cVar4, "reason");
                                            str2 = C;
                                            if (cVar4 != null) {
                                            }
                                            C2 = null;
                                            if (cVar4 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            C3 = null;
                                            if (cVar4 != null) {
                                            }
                                            rVar3 = rVar11;
                                            LinkedHashMap linkedHashMap3222222222 = x61.s.r;
                                            if (cVar4 != null) {
                                            }
                                            linkedHashMap = linkedHashMap3222222222;
                                            if (cVar4 != null) {
                                            }
                                            rVar4 = rVar2;
                                            bool2 = null;
                                            if (cVar4 != null) {
                                            }
                                            str3 = null;
                                            if (cVar4 != null) {
                                            }
                                            str4 = "source";
                                            C6 = null;
                                            if (cVar4 != null) {
                                            }
                                            switch (j3Var.ordinal()) {
                                            }
                                            Boolean bool3222222222222222222222 = eventResponse.h;
                                            if (bool3222222222222222222222 != null) {
                                            }
                                            Boolean bool4222222222222222222222 = eventResponse.g;
                                            if (bool4222222222222222222222 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            x61.rShadow rVar1222222222222222222222222 = rVar4;
                                            rVar1222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                            rVar2 = rVar1222222222222222222222222;
                                            str5 = str8;
                                            rVar10 = rVar11;
                                            it = it2;
                                            aVar3 = aVar2;
                                            a0Var = a0Var3;
                                            eventsResponse3 = eventsResponse2;
                                            q0Var3 = q0Var2;
                                        } else {
                                            str2 = C33;
                                            if (cVar4 != null) {
                                            }
                                            C2 = null;
                                            if (cVar4 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            C3 = null;
                                            if (cVar4 != null) {
                                            }
                                            rVar3 = rVar11;
                                            LinkedHashMap linkedHashMap32222222222 = x61.s.r;
                                            if (cVar4 != null) {
                                            }
                                            linkedHashMap = linkedHashMap32222222222;
                                            if (cVar4 != null) {
                                            }
                                            rVar4 = rVar2;
                                            bool2 = null;
                                            if (cVar4 != null) {
                                            }
                                            str3 = null;
                                            if (cVar4 != null) {
                                            }
                                            str4 = "source";
                                            C6 = null;
                                            if (cVar4 != null) {
                                            }
                                            switch (j3Var.ordinal()) {
                                            }
                                            Boolean bool32222222222222222222222 = eventResponse.h;
                                            if (bool32222222222222222222222 != null) {
                                            }
                                            Boolean bool42222222222222222222222 = eventResponse.g;
                                            if (bool42222222222222222222222 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            if (cVar4 != null) {
                                            }
                                            x61.rShadow rVar12222222222222222222222222 = rVar4;
                                            rVar12222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                            rVar2 = rVar12222222222222222222222222;
                                            str5 = str8;
                                            rVar10 = rVar11;
                                            it = it2;
                                            aVar3 = aVar2;
                                            a0Var = a0Var3;
                                            eventsResponse3 = eventsResponse2;
                                            q0Var3 = q0Var2;
                                        }
                                        break;
                                    case 11:
                                    case 12:
                                        C = sy.n.C(cVar4, "prompt");
                                        if (C == null && (C = sy.n.C(cVar4, "message")) == null) {
                                            C = sy.n.C(cVar4, "content");
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap322222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap322222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool322222222222222222222222 = eventResponse.h;
                                        if (bool322222222222222222222222 != null) {
                                        }
                                        Boolean bool422222222222222222222222 = eventResponse.g;
                                        if (bool422222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar122222222222222222222222222 = rVar4;
                                        rVar122222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar122222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 14:
                                        C = sy.n.C(cVar4, "intent");
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap3222222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap3222222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool3222222222222222222222222 = eventResponse.h;
                                        if (bool3222222222222222222222222 != null) {
                                        }
                                        Boolean bool4222222222222222222222222 = eventResponse.g;
                                        if (bool4222222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar1222222222222222222222222222 = rVar4;
                                        rVar1222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar1222222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 15:
                                        C = sy.n.C(cVar4, "content");
                                        if (C == null) {
                                            C = sy.n.C(cVar4, "message");
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap32222222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap32222222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool32222222222222222222222222 = eventResponse.h;
                                        if (bool32222222222222222222222222 != null) {
                                        }
                                        Boolean bool42222222222222222222222222 = eventResponse.g;
                                        if (bool42222222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar12222222222222222222222222222 = rVar4;
                                        rVar12222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar12222222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 18:
                                        C = sy.n.C(cVar4, "reason");
                                        if (C == null) {
                                            C = sy.n.C(cVar4, "message");
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap322222222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap322222222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool322222222222222222222222222 = eventResponse.h;
                                        if (bool322222222222222222222222222 != null) {
                                        }
                                        Boolean bool422222222222222222222222222 = eventResponse.g;
                                        if (bool422222222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar122222222222222222222222222222 = rVar4;
                                        rVar122222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar122222222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 19:
                                    case 20:
                                        C = sy.n.C(cVar4, "toolArgs");
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap3222222222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap3222222222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool3222222222222222222222222222 = eventResponse.h;
                                        if (bool3222222222222222222222222222 != null) {
                                        }
                                        Boolean bool4222222222222222222222222222 = eventResponse.g;
                                        if (bool4222222222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar1222222222222222222222222222222 = rVar4;
                                        rVar1222222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar1222222222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 21:
                                        C = sy.n.C(cVar4, "toolResult");
                                        if (C == null) {
                                            kotlinx.serialization.json.b bVar25 = (kotlinx.serialization.json.b) cVar4.get("toolResult");
                                            if (bVar25 != null) {
                                                C = sy.n.C(l81.j.e(bVar25), "textResultForLlm");
                                            }
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap32222222222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap32222222222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool32222222222222222222222222222 = eventResponse.h;
                                        if (bool32222222222222222222222222222 != null) {
                                        }
                                        Boolean bool42222222222222222222222222222 = eventResponse.g;
                                        if (bool42222222222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar12222222222222222222222222222222 = rVar4;
                                        rVar12222222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar12222222222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 22:
                                        kotlinx.serialization.json.b bVar26 = (kotlinx.serialization.json.b) cVar4.get("result");
                                        C = bVar26 != null ? sy.n.C(l81.j.e(bVar26), "content") : null;
                                        if (C == null) {
                                            kotlinx.serialization.json.b bVar27 = (kotlinx.serialization.json.b) cVar4.get("toolResult");
                                            C = bVar27 != null ? sy.n.C(l81.j.e(bVar27), "textResultForLlm") : null;
                                            if (C == null) {
                                                C = sy.n.C(cVar4, "toolArgs");
                                            }
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap322222222222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap322222222222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool322222222222222222222222222222 = eventResponse.h;
                                        if (bool322222222222222222222222222222 != null) {
                                        }
                                        Boolean bool422222222222222222222222222222 = eventResponse.g;
                                        if (bool422222222222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar122222222222222222222222222222222 = rVar4;
                                        rVar122222222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar122222222222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                        C = sy.n.C(cVar4, "agentName");
                                        if (C == null) {
                                            C = sy.n.C(cVar4, "message");
                                        }
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap3222222222222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap3222222222222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool3222222222222222222222222222222 = eventResponse.h;
                                        if (bool3222222222222222222222222222222 != null) {
                                        }
                                        Boolean bool4222222222222222222222222222222 = eventResponse.g;
                                        if (bool4222222222222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar1222222222222222222222222222222222 = rVar4;
                                        rVar1222222222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar1222222222222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    case 29:
                                        C = sy.n.C(cVar4, "message");
                                        str2 = C;
                                        if (cVar4 != null) {
                                        }
                                        C2 = null;
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        C3 = null;
                                        if (cVar4 != null) {
                                        }
                                        rVar3 = rVar11;
                                        LinkedHashMap linkedHashMap32222222222222222222 = x61.s.r;
                                        if (cVar4 != null) {
                                        }
                                        linkedHashMap = linkedHashMap32222222222222222222;
                                        if (cVar4 != null) {
                                        }
                                        rVar4 = rVar2;
                                        bool2 = null;
                                        if (cVar4 != null) {
                                        }
                                        str3 = null;
                                        if (cVar4 != null) {
                                        }
                                        str4 = "source";
                                        C6 = null;
                                        if (cVar4 != null) {
                                        }
                                        switch (j3Var.ordinal()) {
                                        }
                                        Boolean bool32222222222222222222222222222222 = eventResponse.h;
                                        if (bool32222222222222222222222222222222 != null) {
                                        }
                                        Boolean bool42222222222222222222222222222222 = eventResponse.g;
                                        if (bool42222222222222222222222222222222 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        if (cVar4 != null) {
                                        }
                                        x61.rShadow rVar12222222222222222222222222222222222 = rVar4;
                                        rVar12222222222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                                        rVar2 = rVar12222222222222222222222222222222222;
                                        str5 = str8;
                                        rVar10 = rVar11;
                                        it = it2;
                                        aVar3 = aVar2;
                                        a0Var = a0Var3;
                                        eventsResponse3 = eventsResponse2;
                                        q0Var3 = q0Var2;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            str2 = null;
                            if (cVar4 != null) {
                            }
                            C2 = null;
                            if (cVar4 != null) {
                            }
                            if (cVar4 != null) {
                            }
                            C3 = null;
                            if (cVar4 != null) {
                            }
                            rVar3 = rVar11;
                            LinkedHashMap linkedHashMap322222222222222222222 = x61.s.r;
                            if (cVar4 != null) {
                            }
                            linkedHashMap = linkedHashMap322222222222222222222;
                            if (cVar4 != null) {
                            }
                            rVar4 = rVar2;
                            bool2 = null;
                            if (cVar4 != null) {
                            }
                            str3 = null;
                            if (cVar4 != null) {
                            }
                            str4 = "source";
                            C6 = null;
                            if (cVar4 != null) {
                            }
                            switch (j3Var.ordinal()) {
                            }
                            Boolean bool322222222222222222222222222222222 = eventResponse.h;
                            if (bool322222222222222222222222222222222 != null) {
                            }
                            Boolean bool422222222222222222222222222222222 = eventResponse.g;
                            if (bool422222222222222222222222222222222 != null) {
                            }
                            if (cVar4 != null) {
                            }
                            if (cVar4 != null) {
                            }
                            x61.rShadow rVar122222222222222222222222222222222222 = rVar4;
                            rVar122222222222222222222222222222222222.add(new i3(str6, instant, str7, z4, j3Var2, str2, C2, C15, C3, rVar3, linkedHashMap, bool2, str3, C6, C17, sVar, booleanValue, booleanValue2, (cVar4 != null && j3Var == j3.y) ? sy.n.C(cVar4, "reasoningText") : null, cVar4 == null ? null : sy.n.C(cVar4, "parentToolCallId"), (cVar4 != null && j3Var == j3.w) ? sy.n.C(cVar4, str4) : null));
                            rVar2 = rVar122222222222222222222222222222222222;
                            str5 = str8;
                            rVar10 = rVar11;
                            it = it2;
                            aVar3 = aVar2;
                            a0Var = a0Var3;
                            eventsResponse3 = eventsResponse2;
                            q0Var3 = q0Var2;
                        }
                        q0Var = q0Var3;
                        a0Var2 = a0Var;
                        aVar = aVar3;
                        eventsResponse = eventsResponse3;
                        rVar = rVar10;
                    }
                    x61.rShadow rVar13 = rVar2 == null ? rVar : rVar2;
                    t71.n nVar = m2.a;
                    String a4 = q0Var.a.w.a("Link");
                    if (a4 == null || t71.p.T(a4)) {
                        num = null;
                        t2Var = new t2(null, null, null, null);
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        int length = a4.length();
                        boolean z5 = false;
                        for (int i3 = 0; i3 < length; i3++) {
                            char charAt = a4.charAt(i3);
                            if (charAt == '<') {
                                sb.append(charAt);
                                z5 = true;
                            } else if (charAt == '>') {
                                sb.append(charAt);
                                z5 = false;
                            } else {
                                if (charAt != ',' || z5) {
                                    sb.append(charAt);
                                } else {
                                    String sb2 = sb.toString();
                                    k71.k.f(sb2, "toString(...)");
                                    arrayList4.add(sb2);
                                    sb.setLength(0);
                                }
                            }
                        }
                        if (sb.length() > 0) {
                            String sb3 = sb.toString();
                            k71.k.f(sb3, "toString(...)");
                            arrayList4.add(sb3);
                        }
                        int size = arrayList4.size();
                        int i4 = 0;
                        String str12 = null;
                        String str13 = null;
                        String str14 = null;
                        String str15 = null;
                        while (i4 < size) {
                            Object obj3 = arrayList4.get(i4);
                            i4++;
                            t71.l a5 = m2.a.a(t71.p.t0((String) obj3).toString());
                            if (a5 != null) {
                                String obj4 = t71.p.t0((String) a5.a().get(1)).toString();
                                t71.l a6 = m2.b.a((String) a5.a().get(2));
                                if (a6 != null && (str = (String) a6.a().get(1)) != null) {
                                    switch (str.hashCode()) {
                                        case -1273775369:
                                            if (str.equals("previous")) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 3314326:
                                            if (str.equals("last")) {
                                                str15 = obj4;
                                                break;
                                            } else {
                                                continue;
                                            }
                                        case 3377907:
                                            if (str.equals("next")) {
                                                str14 = obj4;
                                                break;
                                            } else {
                                                continue;
                                            }
                                        case 3449395:
                                            if (str.equals("prev")) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 97440432:
                                            if (str.equals("first")) {
                                                str12 = obj4;
                                                break;
                                            } else {
                                                continue;
                                            }
                                    }
                                    str13 = obj4;
                                }
                            }
                        }
                        t2Var = new t2(str12, str13, str14, str15);
                        num = null;
                    }
                    v2 v2Var = new v2(rVar13, this.s, this.t, eventsResponse != null ? eventsResponse.b : num, t2Var);
                    a0 a0Var4 = a0Var2;
                    a0Var4.v = 1;
                    b71.a aVar4 = aVar;
                    if (this.r.c(v2Var, a0Var4) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        a0Var = new a0(this, cVar);
        Object obj22 = a0Var.u;
        b71.a aVar32 = b71.a.r;
        i = a0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
