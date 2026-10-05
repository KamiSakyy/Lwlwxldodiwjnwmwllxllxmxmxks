package t00;

import com.github.service.dotcom.models.response.copilot.AgentAiModelResponse;
import com.github.service.dotcom.models.response.copilot.AgentAiModelsResponse;
import com.github.service.dotcom.models.response.copilot.AiModelBillingResponse;
import com.github.service.dotcom.models.response.copilot.AiModelPolicyResponse;
import com.github.service.dotcom.models.response.copilot.AiModelSupportsResponse;
import com.github.service.dotcom.models.response.copilot.ChatAiModelResponse;
import com.github.service.dotcom.models.response.copilot.ChatAiModelsResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadWithMessagesResponse;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.SocialLinkService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.c20;
import jn0.d20;
import jn0.e20;
import jn0.f20;
import jn0.g20;
import jn0.h20;
import jn0.ma0;
import jn0.na0;
import jn0.oa0;
import jn0.p50;
import jn0.pa0;
import jn0.q50;
import jn0.qu;
import jn0.ru;
import jn0.su;
import jn0.ta0;
import jo.ai0;
import jo.bi0;
import jo.ch0;
import jo.cr;
import jo.e60;
import jo.er;
import jo.f60;
import jo.fr;
import jo.g60;
import jo.h30;
import jo.hd0;
import jo.i30;
import jo.ii0;
import jo.j30;
import jo.l30;
import jo.o80;
import jo.p80;
import jo.qo;
import jo.so;
import jo.to;
import jo.uo;
import jo.ve0;
import jo.vo;
import jo.zh0;
import jo.zi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x9 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ x9(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        um0.d dVar;
        int i;
        am0.w0 w0Var;
        if (cVar instanceof um0.d) {
            dVar = (um0.d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.u;
                b71.a aVar = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    x61.r<am0.u0> rVar = ((am0.s0) obj).a.a.a;
                    if (rVar == null) {
                        rVar = x61.r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (am0.u0 u0Var : rVar) {
                        j01.b bVar = null;
                        if (u0Var != null && (w0Var = u0Var.c.b) != null) {
                            int i3 = u0Var.a;
                            int i4 = u0Var.b;
                            String str = w0Var.a;
                            String str2 = w0Var.b;
                            am0.x0 x0Var = w0Var.c;
                            bVar = new j01.b(i3, i4, b41.b.O(x0Var.d), str, str2, x0Var.c);
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                    dVar.v = 1;
                    if (this.s.c(arrayList, dVar) == aVar) {
                        return aVar;
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
        dVar = new um0.d(this, cVar);
        Object obj22 = dVar.u;
        b71.a aVar2 = b71.a.r;
        i = dVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        um0.e eVar;
        int i;
        j01.a aVar;
        if (cVar instanceof um0.e) {
            eVar = (um0.e) cVar;
            int i2 = eVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar.u;
                b71.a aVar2 = b71.a.r;
                i = eVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    am0.b1 b1Var = (am0.b1) obj;
                    k71.k.g(b1Var, "<this>");
                    am0.f1 f1Var = b1Var.a;
                    int i3 = f1Var.a.a;
                    x61.r<am0.d1> rVar = f1Var.b.a;
                    if (rVar == null) {
                        rVar = x61.r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (am0.d1 d1Var : rVar) {
                        if (d1Var != null) {
                            wh0.a aVar3 = d1Var.c;
                            aVar = new j01.a(aVar3.c, aVar3.a, aVar3.b, aVar3.d, aVar3.e);
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    yz0.a3 a3Var = new yz0.a3(i3, arrayList);
                    eVar.v = 1;
                    if (this.s.c(a3Var, eVar) == aVar2) {
                        return aVar2;
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
        eVar = new um0.e(this, cVar);
        Object obj22 = eVar.u;
        b71.a aVar22 = b71.a.r;
        i = eVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        v00.a aVar;
        int i;
        cr crVar;
        if (cVar instanceof v00.a) {
            aVar = (v00.a) cVar;
            int i2 = aVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = aVar.u;
                b71.a aVar2 = b71.a.r;
                i = aVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    er erVar = (er) obj;
                    k71.k.g(erVar, "<this>");
                    fr frVar = erVar.a;
                    String str = (frVar == null || (crVar = frVar.a) == null) ? null : crVar.a;
                    if (str == null) {
                        str = "";
                    }
                    zz0.e eVar = new zz0.e(str);
                    aVar.v = 1;
                    if (this.s.c(eVar, aVar) == aVar2) {
                        return aVar2;
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
        aVar = new v00.a(this, cVar);
        Object obj22 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v20, types: [xn.n2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        v00.c cVar2;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        ArrayList arrayList3;
        int i3;
        int i4;
        ArrayList arrayList4;
        xn.o2 o2Var;
        int i5;
        Object obj2;
        if (cVar instanceof v00.c) {
            cVar2 = (v00.c) cVar;
            int i6 = cVar2.v;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar2.v = i6 - Integer.MIN_VALUE;
                Object obj3 = cVar2.u;
                b71.a aVar = b71.a.r;
                i = cVar2.v;
                if (i != 0) {
                    sy.y.j(obj3);
                    so soVar = (so) obj;
                    k71.k.g(soVar, "<this>");
                    uo uoVar = soVar.a;
                    int i7 = 10;
                    if (uoVar != null) {
                        ArrayList arrayList5 = uoVar.a;
                        arrayList = new ArrayList(x61.n.F(arrayList5, 10));
                        int size = arrayList5.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Object obj4 = arrayList5.get(i8);
                            i8++;
                            qo qoVar = (qo) obj4;
                            String str = qoVar.a;
                            ArrayList arrayList6 = qoVar.b;
                            ArrayList arrayList7 = new ArrayList();
                            int size2 = arrayList6.size();
                            int i9 = 0;
                            while (i9 < size2) {
                                Object obj5 = arrayList6.get(i9);
                                int i11 = i9 + 1;
                                to toVar = (to) obj5;
                                cq.n2 n2Var = toVar.b;
                                if (n2Var != null) {
                                    String str2 = n2Var.a;
                                    ArrayList arrayList8 = n2Var.b;
                                    i2 = i11;
                                    arrayList3 = arrayList5;
                                    ArrayList arrayList9 = new ArrayList(x61.n.F(arrayList8, i7));
                                    int size3 = arrayList8.size();
                                    int i12 = 0;
                                    while (i12 < size3) {
                                        Object obj6 = arrayList8.get(i12);
                                        int i13 = i12 + 1;
                                        ArrayList arrayList10 = arrayList8;
                                        cq.a3 a3Var = ((cq.m2) obj6).b;
                                        xn.d1 d1Var = xn.e1.Companion;
                                        int i14 = size3;
                                        String str3 = a3Var.a.r;
                                        d1Var.getClass();
                                        xn.e1 a = xn.d1.a(str3);
                                        xn.b3 b3Var = xn.c3.Companion;
                                        int i15 = size;
                                        String str4 = a3Var.b.r;
                                        b3Var.getClass();
                                        Iterator it = xn.c3.u.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i5 = i8;
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = it.next();
                                            i5 = i8;
                                            if (((xn.c3) obj2).r.equals(str4)) {
                                                break;
                                            }
                                            i8 = i5;
                                        }
                                        xn.c3 c3Var = (xn.c3) obj2;
                                        if (c3Var == null) {
                                            c3Var = xn.c3.s;
                                        }
                                        arrayList9.add(new xn.a3(a, c3Var, a3Var.c, a3Var.d));
                                        i12 = i13;
                                        arrayList8 = arrayList10;
                                        size3 = i14;
                                        size = i15;
                                        i8 = i5;
                                    }
                                    i3 = size;
                                    i4 = i8;
                                    o2Var = new xn.o2(str2, arrayList9);
                                    arrayList4 = arrayList6;
                                } else {
                                    i2 = i11;
                                    arrayList3 = arrayList5;
                                    i3 = size;
                                    i4 = i8;
                                    cq.r2 r2Var = toVar.c;
                                    if (r2Var != null) {
                                        String str5 = r2Var.a;
                                        ArrayList arrayList11 = r2Var.b;
                                        ArrayList arrayList12 = new ArrayList(x61.n.F(arrayList11, 10));
                                        int size4 = arrayList11.size();
                                        int i16 = 0;
                                        while (i16 < size4) {
                                            Object obj7 = arrayList11.get(i16);
                                            int i17 = i16 + 1;
                                            cq.j jVar = ((cq.q2) obj7).b;
                                            xn.d1 d1Var2 = xn.e1.Companion;
                                            ArrayList arrayList13 = arrayList11;
                                            String str6 = jVar.a.r;
                                            d1Var2.getClass();
                                            xn.e1 a2 = xn.d1.a(str6);
                                            String str7 = jVar.b;
                                            ArrayList arrayList14 = jVar.c;
                                            int i18 = size4;
                                            ArrayList arrayList15 = arrayList6;
                                            ArrayList arrayList16 = new ArrayList(x61.n.F(arrayList14, 10));
                                            int size5 = arrayList14.size();
                                            int i19 = 0;
                                            while (i19 < size5) {
                                                Object obj8 = arrayList14.get(i19);
                                                i19++;
                                                int i21 = size5;
                                                arrayList16.add(new xn.p0(((cq.i) obj8).a));
                                                arrayList14 = arrayList14;
                                                size5 = i21;
                                            }
                                            arrayList12.add(new xn.q0(a2, str7, arrayList16));
                                            arrayList11 = arrayList13;
                                            size4 = i18;
                                            i16 = i17;
                                            arrayList6 = arrayList15;
                                        }
                                        arrayList4 = arrayList6;
                                        o2Var = new xn.n2(str5, arrayList12);
                                    } else {
                                        arrayList4 = arrayList6;
                                        o2Var = null;
                                    }
                                }
                                if (o2Var != null) {
                                    arrayList7.add(o2Var);
                                }
                                i9 = i2;
                                arrayList5 = arrayList3;
                                arrayList6 = arrayList4;
                                size = i3;
                                i8 = i4;
                                i7 = 10;
                            }
                            arrayList.add(new xn.q2(str, arrayList7));
                            i7 = 10;
                        }
                    } else {
                        arrayList = null;
                    }
                    ArrayList arrayList17 = x61.r.r;
                    if (arrayList == null) {
                        arrayList = arrayList17;
                    }
                    ArrayList arrayList18 = uoVar != null ? uoVar.b : null;
                    if (arrayList18 == null) {
                        arrayList18 = arrayList17;
                    }
                    if (uoVar != null) {
                        ArrayList arrayList19 = uoVar.c;
                        arrayList2 = new ArrayList(x61.n.F(arrayList19, 10));
                        int size6 = arrayList19.size();
                        int i22 = 0;
                        while (i22 < size6) {
                            Object obj9 = arrayList19.get(i22);
                            i22++;
                            cq.x2 x2Var = ((vo) obj9).b;
                            xn.d1 d1Var3 = xn.e1.Companion;
                            String str8 = x2Var.a.r;
                            d1Var3.getClass();
                            xn.e1 a3 = xn.d1.a(str8);
                            String str9 = x2Var.b;
                            String str10 = x2Var.c;
                            String str11 = x2Var.d;
                            ArrayList arrayList20 = x2Var.e;
                            ArrayList arrayList21 = arrayList19;
                            ArrayList arrayList22 = new ArrayList(x61.n.F(arrayList20, 10));
                            int size7 = arrayList20.size();
                            int i23 = 0;
                            while (i23 < size7) {
                                Object obj10 = arrayList20.get(i23);
                                i23++;
                                int i24 = size7;
                                arrayList22.add(new xn.w2(((cq.w2) obj10).a));
                                size7 = i24;
                                arrayList17 = arrayList17;
                            }
                            arrayList2.add(new xn.x2(a3, str9, str10, str11, arrayList22));
                            arrayList19 = arrayList21;
                        }
                    } else {
                        arrayList2 = null;
                    }
                    xn.r2 r2Var2 = new xn.r2(arrayList, arrayList18, arrayList2 == null ? arrayList17 : arrayList2);
                    cVar2.v = 1;
                    if (this.s.c(r2Var2, cVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj3);
                }
                return w61.a0.a;
            }
        }
        cVar2 = new v00.c(this, cVar);
        Object obj32 = cVar2.u;
        b71.a aVar2 = b71.a.r;
        i = cVar2.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        v00.d dVar;
        int i;
        if (cVar instanceof v00.d) {
            dVar = (v00.d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.u;
                b71.a aVar = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    p80 p80Var = ((o80) obj).a;
                    Boolean bool = p80Var != null ? p80Var.a : null;
                    if (bool != null) {
                        dVar.v = 1;
                        if (this.s.c(bool, dVar) == aVar) {
                            return aVar;
                        }
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
        dVar = new v00.d(this, cVar);
        Object obj22 = dVar.u;
        b71.a aVar2 = b71.a.r;
        i = dVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        v00.h hVar;
        int i;
        if (cVar instanceof v00.h) {
            hVar = (v00.h) cVar;
            int i2 = hVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.u;
                b71.a aVar = b71.a.r;
                i = hVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    String str = aa1.b.X((zi0) obj).g;
                    if (str != null) {
                        hVar.v = 1;
                        if (this.s.c(str, hVar) == aVar) {
                            return aVar;
                        }
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
        hVar = new v00.h(this, cVar);
        Object obj22 = hVar.u;
        b71.a aVar2 = b71.a.r;
        i = hVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        v00.j jVar;
        int i;
        String str;
        boolean z;
        String str2;
        xn.g gVar;
        if (cVar instanceof v00.j) {
            jVar = (v00.j) cVar;
            int i2 = jVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = jVar.u;
                b71.a aVar = b71.a.r;
                i = jVar.v;
                int i3 = 1;
                if (i != 0) {
                    sy.y.j(obj2);
                    AgentAiModelsResponse agentAiModelsResponse = (AgentAiModelsResponse) obj;
                    String str3 = "<this>";
                    k71.k.g(agentAiModelsResponse, "<this>");
                    List list = agentAiModelsResponse.a;
                    ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AgentAiModelResponse agentAiModelResponse = (AgentAiModelResponse) it.next();
                        k71.k.g(agentAiModelResponse, str3);
                        boolean z2 = agentAiModelResponse.a;
                        String str4 = agentAiModelResponse.b;
                        String str5 = agentAiModelResponse.c;
                        boolean z3 = agentAiModelResponse.e;
                        xn.j c = sy.e0.c(agentAiModelResponse.f);
                        xn.p pVar = xn.v.Companion;
                        String str6 = agentAiModelResponse.d;
                        pVar.getClass();
                        xn.v a = xn.p.a(str6);
                        xn.h b = sy.e0.b(agentAiModelResponse.g);
                        AiModelSupportsResponse aiModelSupportsResponse = agentAiModelResponse.h;
                        xn.m mVar = aiModelSupportsResponse != null ? new xn.m(aiModelSupportsResponse.a) : null;
                        AiModelPolicyResponse aiModelPolicyResponse = agentAiModelResponse.i;
                        xn.k d = aiModelPolicyResponse != null ? sy.e0.d(aiModelPolicyResponse) : null;
                        AiModelBillingResponse aiModelBillingResponse = agentAiModelResponse.j;
                        Iterator it2 = it;
                        if (aiModelBillingResponse != null) {
                            str = str3;
                            z = z2;
                            str2 = str4;
                            gVar = new xn.g(aiModelBillingResponse.b, aiModelBillingResponse.a);
                        } else {
                            str = str3;
                            z = z2;
                            str2 = str4;
                            gVar = null;
                        }
                        arrayList.add(new xn.v0(str2, str5, gVar, b, c, d, mVar, a, z, z3, agentAiModelResponse.k, agentAiModelResponse.l));
                        it = it2;
                        str3 = str;
                        i3 = 1;
                    }
                    jVar.v = i3;
                    if (this.s.c(arrayList, jVar) == aVar) {
                        return aVar;
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
        jVar = new v00.j(this, cVar);
        Object obj22 = jVar.u;
        b71.a aVar2 = b71.a.r;
        i = jVar.v;
        int i32 = 1;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        v00.l lVar;
        int i;
        Iterator it;
        boolean z;
        String str;
        xn.g gVar;
        if (cVar instanceof v00.l) {
            lVar = (v00.l) cVar;
            int i2 = lVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = lVar.u;
                b71.a aVar = b71.a.r;
                i = lVar.v;
                int i3 = 1;
                if (i != 0) {
                    sy.y.j(obj2);
                    ChatAiModelsResponse chatAiModelsResponse = (ChatAiModelsResponse) obj;
                    k71.k.g(chatAiModelsResponse, "<this>");
                    List list = chatAiModelsResponse.a;
                    ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ChatAiModelResponse chatAiModelResponse = (ChatAiModelResponse) it2.next();
                        k71.k.g(chatAiModelResponse, "<this>");
                        String str2 = chatAiModelResponse.a;
                        String str3 = chatAiModelResponse.b;
                        boolean z2 = chatAiModelResponse.d;
                        xn.j c = sy.e0.c(chatAiModelResponse.e);
                        xn.p pVar = xn.v.Companion;
                        String str4 = chatAiModelResponse.c;
                        pVar.getClass();
                        xn.v a = xn.p.a(str4);
                        xn.h b = sy.e0.b(chatAiModelResponse.f);
                        AiModelSupportsResponse aiModelSupportsResponse = chatAiModelResponse.g;
                        xn.m mVar = aiModelSupportsResponse != null ? new xn.m(aiModelSupportsResponse.a) : null;
                        AiModelPolicyResponse aiModelPolicyResponse = chatAiModelResponse.h;
                        xn.k d = aiModelPolicyResponse != null ? sy.e0.d(aiModelPolicyResponse) : null;
                        AiModelBillingResponse aiModelBillingResponse = chatAiModelResponse.i;
                        if (aiModelBillingResponse != null) {
                            it = it2;
                            z = z2;
                            str = str2;
                            gVar = new xn.g(aiModelBillingResponse.b, aiModelBillingResponse.a);
                        } else {
                            it = it2;
                            z = z2;
                            str = str2;
                            gVar = null;
                        }
                        arrayList.add(new xn.c1(str, str3, gVar, b, c, d, mVar, a, z, chatAiModelResponse.j, chatAiModelResponse.k, chatAiModelResponse.l));
                        it2 = it;
                        i3 = 1;
                    }
                    lVar.v = i3;
                    if (this.s.c(arrayList, lVar) == aVar) {
                        return aVar;
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
        lVar = new v00.l(this, cVar);
        Object obj22 = lVar.u;
        b71.a aVar2 = b71.a.r;
        i = lVar.v;
        int i32 = 1;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(a71.c cVar, Object obj) {
        v00.o oVar;
        int i;
        if (cVar instanceof v00.o) {
            oVar = (v00.o) cVar;
            int i2 = oVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = oVar.u;
                b71.a aVar = b71.a.r;
                i = oVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    xn.s0 b = t.q.b((ChatThreadResponse) obj, x61.r.r);
                    oVar.v = 1;
                    if (this.s.c(b, oVar) == aVar) {
                        return aVar;
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
        oVar = new v00.o(this, cVar);
        Object obj22 = oVar.u;
        b71.a aVar2 = b71.a.r;
        i = oVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0b92  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        w9 w9Var;
        int i;
        f60 f60Var;
        ba baVar;
        int i2;
        ga gaVar;
        int i3;
        la laVar;
        int i4;
        i30 i30Var;
        i30 i30Var2;
        i30 i30Var3;
        na naVar;
        int i5;
        oa oaVar;
        int i6;
        pa paVar;
        int i7;
        yz0.p8 p8Var;
        String str;
        boolean z;
        yz0.o8 o8Var;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        x61.r rVar;
        boolean z4;
        int i8;
        x61.r rVar2;
        qx.l1 l1Var;
        qa qaVar;
        int i9;
        ArrayList arrayList2;
        ra raVar;
        int i11;
        ta taVar;
        int i12;
        String a;
        tm0.a aVar;
        int i13;
        tw0.a aVar2;
        int i14;
        jn0.z4 z4Var;
        tw0.c cVar2;
        int i15;
        jn0.i7 i7Var;
        jn0.i7 i7Var2;
        jn0.i7 i7Var3;
        tw0.d dVar;
        int i16;
        yz0.y1 y1Var;
        tw0.e eVar;
        int i17;
        uu0.v5 v5Var;
        tw0.h hVar;
        int i18;
        ru ruVar;
        tw0.j jVar;
        int i19;
        tw0.k kVar;
        int i21;
        na0 na0Var;
        oa0 oa0Var;
        um0.b bVar;
        int i22;
        um0.c cVar3;
        int i23;
        v00.r rVar3;
        int i24;
        switch (this.r) {
            case 0:
                if (cVar instanceof w9) {
                    w9Var = (w9) cVar;
                    int i25 = w9Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        w9Var.v = i25 - Integer.MIN_VALUE;
                        Object obj2 = w9Var.u;
                        b71.a aVar3 = b71.a.r;
                        i = w9Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            g60 g60Var = ((e60) obj).a;
                            List P = com.google.android.gms.internal.measurement.i4.P((g60Var == null || (f60Var = g60Var.a) == null) ? null : f60Var.b);
                            w9Var.v = 1;
                            if (this.s.c(P, w9Var) == aVar3) {
                                return aVar3;
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
                w9Var = new w9(this, cVar);
                Object obj22 = w9Var.u;
                b71.a aVar32 = b71.a.r;
                i = w9Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof ba) {
                    baVar = (ba) cVar;
                    int i26 = baVar.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        baVar.v = i26 - Integer.MIN_VALUE;
                        Object obj3 = baVar.u;
                        b71.a aVar4 = b71.a.r;
                        i2 = baVar.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            yz0.w7 n = sy.y.n((hd0) obj);
                            baVar.v = 1;
                            if (this.s.c(n, baVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                baVar = new ba(this, cVar);
                Object obj32 = baVar.u;
                b71.a aVar42 = b71.a.r;
                i2 = baVar.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof ga) {
                    gaVar = (ga) cVar;
                    int i27 = gaVar.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        gaVar.v = i27 - Integer.MIN_VALUE;
                        Object obj4 = gaVar.u;
                        b71.a aVar5 = b71.a.r;
                        i3 = gaVar.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            yz0.y7 d = sy.c0.d((ve0) obj);
                            gaVar.v = 1;
                            if (this.s.c(d, gaVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                gaVar = new ga(this, cVar);
                Object obj42 = gaVar.u;
                b71.a aVar52 = b71.a.r;
                i3 = gaVar.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof la) {
                    laVar = (la) cVar;
                    int i28 = laVar.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        laVar.v = i28 - Integer.MIN_VALUE;
                        Object obj5 = laVar.u;
                        b71.a aVar6 = b71.a.r;
                        i4 = laVar.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            h30 h30Var = (h30) obj;
                            l30 l30Var = h30Var.a;
                            List list = (l30Var == null || (i30Var3 = l30Var.a) == null) ? null : i30Var3.b;
                            if (list == null) {
                                list = x61.r.r;
                            }
                            ArrayList S = x61.m.S(list);
                            ArrayList arrayList3 = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i29 = 0;
                            while (i29 < size) {
                                Object obj6 = S.get(i29);
                                i29++;
                                fu.a aVar7 = ((j30) obj6).c;
                                arrayList3.add(new fz.g(aVar7.b, aVar7.c, k41.b.Y(aVar7.d), (int) aVar7.e, aVar7.f));
                            }
                            l30 l30Var2 = h30Var.a;
                            w61.k kVar2 = new w61.k(arrayList3, new x01.i((l30Var2 == null || (i30Var = l30Var2.a) == null) ? null : i30Var.a.b, (l30Var2 == null || (i30Var2 = l30Var2.a) == null) ? false : i30Var2.a.a, false));
                            laVar.v = 1;
                            if (this.s.c(kVar2, laVar) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                laVar = new la(this, cVar);
                Object obj52 = laVar.u;
                b71.a aVar62 = b71.a.r;
                i4 = laVar.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof na) {
                    naVar = (na) cVar;
                    int i31 = naVar.v;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        naVar.v = i31 - Integer.MIN_VALUE;
                        Object obj7 = naVar.u;
                        b71.a aVar8 = b71.a.r;
                        i5 = naVar.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            Integer num = new Integer(((ii0) obj).a.a.a);
                            naVar.v = 1;
                            if (this.s.c(num, naVar) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                naVar = new na(this, cVar);
                Object obj72 = naVar.u;
                b71.a aVar82 = b71.a.r;
                i5 = naVar.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof oa) {
                    oaVar = (oa) cVar;
                    int i32 = oaVar.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        oaVar.v = i32 - Integer.MIN_VALUE;
                        Object obj8 = oaVar.u;
                        b71.a aVar9 = b71.a.r;
                        i6 = oaVar.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            ch0 ch0Var = (ch0) obj;
                            eq.c cVar4 = ch0Var.a.d;
                            yz0.c8 c8Var = new yz0.c8(w8.s.A(cVar4.f), cVar4.b, ch0Var.a.b);
                            oaVar.v = 1;
                            if (this.s.c(c8Var, oaVar) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                oaVar = new oa(this, cVar);
                Object obj82 = oaVar.u;
                b71.a aVar92 = b71.a.r;
                i6 = oaVar.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof pa) {
                    paVar = (pa) cVar;
                    int i33 = paVar.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        paVar.v = i33 - Integer.MIN_VALUE;
                        Object obj9 = paVar.u;
                        b71.a aVar10 = b71.a.r;
                        i7 = paVar.v;
                        if (i7 != 0) {
                            sy.y.j(obj9);
                            zh0 zh0Var = (zh0) obj;
                            bi0 bi0Var = zh0Var.a;
                            x61.r rVar4 = x61.r.r;
                            if (bi0Var != null) {
                                qx.t1 t1Var = bi0Var.c;
                                String str2 = t1Var.b;
                                String str3 = t1Var.c;
                                Avatar A = w8.s.A(t1Var.H);
                                String str4 = t1Var.d;
                                String str5 = t1Var.e;
                                String str6 = t1Var.f;
                                int i34 = t1Var.I.c.a;
                                int i35 = t1Var.g.a;
                                boolean z5 = t1Var.h;
                                boolean z6 = t1Var.i;
                                boolean z7 = t1Var.j;
                                boolean z8 = t1Var.k;
                                boolean z9 = t1Var.l;
                                String str7 = t1Var.n;
                                String str8 = str7 == null ? "" : str7;
                                String str9 = t1Var.o;
                                String str10 = t1Var.p;
                                String str11 = str10 == null ? "" : str10;
                                int i36 = t1Var.q.a;
                                String str12 = t1Var.r;
                                String str13 = str12 == null ? "" : str12;
                                int i37 = t1Var.s.a;
                                int i38 = t1Var.t.a;
                                int i39 = t1Var.u.a;
                                boolean z11 = t1Var.y;
                                boolean z12 = t1Var.z;
                                String str14 = t1Var.A;
                                String str15 = str14 == null ? "" : str14;
                                qx.r1 r1Var = t1Var.v;
                                if (r1Var != null) {
                                    qx.n0 n0Var = r1Var.c;
                                    str = "";
                                    String str16 = n0Var.b;
                                    qx.m0 m0Var = n0Var.g;
                                    String str17 = str16 == null ? str : str16;
                                    z = z8;
                                    boolean z13 = n0Var.c;
                                    String str18 = n0Var.d;
                                    String str19 = str18 == null ? str : str18;
                                    String str20 = n0Var.e;
                                    o8Var = new yz0.o8(str17, str20 == null ? str : str20, z13, str19, m0Var != null ? m7.y.P(m0Var.c) : null, m0Var != null ? m0Var.c.a : null, n0Var.f);
                                } else {
                                    str = "";
                                    z = z8;
                                    o8Var = null;
                                }
                                cv.f fVar = t1Var.m.b;
                                boolean z14 = fVar.a;
                                x61.r rVar5 = fVar.b.a;
                                if (rVar5 == null) {
                                    rVar5 = rVar4;
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it = rVar5.iterator();
                                while (it.hasNext()) {
                                    Iterator it2 = it;
                                    cv.e eVar2 = (cv.e) it.next();
                                    boolean z15 = z14;
                                    yz0.j8 g = (eVar2 != null ? eVar2.c : null) != null ? sy.e0.g(eVar2.c) : (eVar2 != null ? eVar2.b : null) != null ? sy.e0.h(eVar2.b.c) : null;
                                    if (g != null) {
                                        arrayList4.add(g);
                                    }
                                    it = it2;
                                    z14 = z15;
                                }
                                boolean z16 = z14;
                                yz0.m8 i41 = (!t1Var.w || (l1Var = t1Var.x) == null) ? null : sy.e0.i(l1Var.b);
                                boolean z17 = t1Var.B;
                                boolean z18 = t1Var.C;
                                List list2 = t1Var.F.a;
                                if (list2 != null) {
                                    z2 = z18;
                                    ArrayList S2 = x61.m.S(list2);
                                    arrayList = arrayList4;
                                    z3 = z7;
                                    rVar = new ArrayList(x61.n.F(S2, 10));
                                    int size2 = S2.size();
                                    int i42 = 0;
                                    while (i42 < size2) {
                                        Object obj10 = S2.get(i42);
                                        int i43 = i42 + 1;
                                        qx.j1 j1Var = (qx.j1) obj10;
                                        int i44 = size2;
                                        String str21 = j1Var.c;
                                        r01.w wVar = SocialLinkService.Companion;
                                        String str22 = str3;
                                        String str23 = j1Var.b.r;
                                        wVar.getClass();
                                        rVar.add(new yz0.n8(str21, r01.w.a(str23), j1Var.a));
                                        S2 = S2;
                                        i42 = i43;
                                        size2 = i44;
                                        str3 = str22;
                                    }
                                } else {
                                    z2 = z18;
                                    arrayList = arrayList4;
                                    z3 = z7;
                                    rVar = null;
                                }
                                String str24 = str3;
                                x61.r rVar6 = rVar == null ? rVar4 : rVar;
                                boolean z19 = t1Var.D;
                                int i45 = t1Var.E.a;
                                List list3 = t1Var.G.a;
                                if (list3 != null) {
                                    ArrayList S3 = x61.m.S(list3);
                                    ArrayList arrayList5 = new ArrayList(x61.n.F(S3, 10));
                                    int size3 = S3.size();
                                    int i46 = 0;
                                    while (i46 < size3) {
                                        Object obj11 = S3.get(i46);
                                        i46++;
                                        ArrayList arrayList6 = S3;
                                        qx.i1 i1Var = (qx.i1) obj11;
                                        boolean z20 = z19;
                                        int i47 = i45;
                                        qx.e1 e1Var = i1Var.a;
                                        int i48 = size3;
                                        String str25 = e1Var.b;
                                        String str26 = e1Var.a;
                                        qx.s1 s1Var = i1Var.b;
                                        String str27 = s1Var != null ? s1Var.b : null;
                                        if (str27 == null) {
                                            str27 = str;
                                        }
                                        arrayList5.add(new yz0.h8(str25, str26, str27));
                                        size3 = i48;
                                        S3 = arrayList6;
                                        z19 = z20;
                                        i45 = i47;
                                    }
                                    z4 = z19;
                                    i8 = i45;
                                    rVar2 = new ArrayList();
                                    int size4 = arrayList5.size();
                                    int i49 = 0;
                                    while (i49 < size4) {
                                        Object obj12 = arrayList5.get(i49);
                                        i49++;
                                        yz0.h8 h8Var = (yz0.h8) obj12;
                                        int i51 = size4;
                                        if (!t71.p.T(h8Var.a) && !t71.p.T(h8Var.c)) {
                                            rVar2.add(obj12);
                                        }
                                        size4 = i51;
                                    }
                                } else {
                                    z4 = z19;
                                    i8 = i45;
                                    rVar2 = null;
                                }
                                p8Var = new yz0.p8(str2, str24, A, str4, str5, str6, i34, i35, z5, false, z6, z3, z, z9, str8, str9, str11, i36, str13, i37, i38, i39, z11, z12, str15, o8Var, z16, arrayList, i41, false, z17, z2, "", z4, i8, (yz0.d1) null, rVar2 == null ? rVar4 : rVar2, rVar6);
                            } else {
                                ai0 ai0Var = zh0Var.b;
                                if (ai0Var == null) {
                                    throw new ApiFailure(ApiFailureType.NOT_FOUND, (String) null, (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                                }
                                tu.j jVar2 = ai0Var.c;
                                String str28 = jVar2.i;
                                String str29 = jVar2.b;
                                String str30 = jVar2.c;
                                Avatar A2 = w8.s.A(jVar2.s);
                                String str31 = jVar2.d;
                                String str32 = str31 == null ? "" : str31;
                                String str33 = jVar2.e;
                                String str34 = str33 == null ? "" : str33;
                                boolean z21 = jVar2.f;
                                String str35 = jVar2.h;
                                String str36 = str35 == null ? "" : str35;
                                String str37 = jVar2.j;
                                String str38 = str37 == null ? "" : str37;
                                int i52 = jVar2.l.a;
                                int i53 = jVar2.n.a;
                                boolean z22 = jVar2.k;
                                String str39 = jVar2.o;
                                String str40 = str39 == null ? "" : str39;
                                cv.f fVar2 = jVar2.g.b;
                                boolean z23 = fVar2.a;
                                x61.r<cv.e> rVar7 = fVar2.b.a;
                                if (rVar7 == null) {
                                    rVar7 = rVar4;
                                }
                                ArrayList arrayList7 = new ArrayList();
                                for (cv.e eVar3 : rVar7) {
                                    int i54 = i52;
                                    int i55 = i53;
                                    yz0.j8 g2 = (eVar3 != null ? eVar3.c : null) != null ? sy.e0.g(eVar3.c) : (eVar3 != null ? eVar3.b : null) != null ? sy.e0.h(eVar3.b.c) : null;
                                    if (g2 != null) {
                                        arrayList7.add(g2);
                                    }
                                    i52 = i54;
                                    i53 = i55;
                                }
                                int i56 = i52;
                                int i57 = i53;
                                tu.h hVar2 = jVar2.m;
                                yz0.m8 i58 = hVar2 != null ? sy.e0.i(hVar2.b) : null;
                                String str41 = jVar2.p;
                                String str42 = str41 == null ? "" : str41;
                                int i59 = jVar2.q.a;
                                tu.d dVar2 = jVar2.r;
                                p8Var = new yz0.p8(str29, str30, A2, str32, "", str34, -1, -1, false, z21, false, false, false, false, str36, str28, str38, -1, "", i56, -1, i57, true, z22, str40, (yz0.o8) null, z23, arrayList7, i58, true, false, false, str42, false, i59, dVar2 != null ? new yz0.d1(str28, dVar2.b.a, dVar2.a) : null, rVar4, rVar4);
                            }
                            paVar.v = 1;
                            if (this.s.c(p8Var, paVar) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                paVar = new pa(this, cVar);
                Object obj92 = paVar.u;
                b71.a aVar102 = b71.a.r;
                i7 = paVar.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof qa) {
                    qaVar = (qa) cVar;
                    int i61 = qaVar.v;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        qaVar.v = i61 - Integer.MIN_VALUE;
                        Object obj13 = qaVar.u;
                        b71.a aVar11 = b71.a.r;
                        i9 = qaVar.v;
                        if (i9 != 0) {
                            sy.y.j(obj13);
                            List list4 = ((up.b) obj).a.a;
                            if (list4 != null) {
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj14 : list4) {
                                    if (((up.c) obj14).b) {
                                        arrayList8.add(obj14);
                                    }
                                }
                                arrayList2 = new ArrayList();
                                int size5 = arrayList8.size();
                                int i62 = 0;
                                while (i62 < size5) {
                                    Object obj15 = arrayList8.get(i62);
                                    i62++;
                                    r10.a aVar12 = r10.b.Companion;
                                    String str43 = ((up.c) obj15).a;
                                    aVar12.getClass();
                                    r10.b a2 = r10.a.a(str43);
                                    if (a2 != null) {
                                        arrayList2.add(a2);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                qaVar.v = 1;
                                if (this.s.c(arrayList2, qaVar) == aVar11) {
                                    return aVar11;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                qaVar = new qa(this, cVar);
                Object obj132 = qaVar.u;
                b71.a aVar112 = b71.a.r;
                i9 = qaVar.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof ra) {
                    raVar = (ra) cVar;
                    int i63 = raVar.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        raVar.v = i63 - Integer.MIN_VALUE;
                        Object obj16 = raVar.u;
                        b71.a aVar13 = b71.a.r;
                        i11 = raVar.v;
                        if (i11 != 0) {
                            sy.y.j(obj16);
                            String str44 = ((ox.b) obj).a.a;
                            raVar.v = 1;
                            if (this.s.c(str44, raVar) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                raVar = new ra(this, cVar);
                Object obj162 = raVar.u;
                b71.a aVar132 = b71.a.r;
                i11 = raVar.v;
                if (i11 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof ta) {
                    taVar = (ta) cVar;
                    int i64 = taVar.v;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        taVar.v = i64 - Integer.MIN_VALUE;
                        Object obj17 = taVar.u;
                        b71.a aVar14 = b71.a.r;
                        i12 = taVar.v;
                        if (i12 != 0) {
                            sy.y.j(obj17);
                            fa1.q0 q0Var = (fa1.q0) obj;
                            k71.k.g(q0Var, "<this>");
                            q81.a0 a0Var = q0Var.a;
                            c11.a aVar15 = null;
                            if (a0Var.u == 301 && (a = a0Var.w.a("Location")) != null) {
                                List g0 = t71.p.g0(a, new String[]{"/"}, 6);
                                if (g0.size() == 8 && k71.k.b(g0.get(3), "repos") && k71.k.b(g0.get(6), "issues")) {
                                    String str45 = (String) g0.get(4);
                                    String str46 = (String) g0.get(5);
                                    Integer G = t71.w.G((String) g0.get(7));
                                    if (G != null) {
                                        aVar15 = new c11.a(str45, G.intValue(), str46);
                                    }
                                }
                            }
                            taVar.v = 1;
                            if (this.s.c(aVar15, taVar) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                taVar = new ta(this, cVar);
                Object obj172 = taVar.u;
                b71.a aVar142 = b71.a.r;
                i12 = taVar.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof tm0.a) {
                    aVar = (tm0.a) cVar;
                    int i65 = aVar.v;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i65 - Integer.MIN_VALUE;
                        Object obj18 = aVar.u;
                        b71.a aVar16 = b71.a.r;
                        i13 = aVar.v;
                        if (i13 != 0) {
                            sy.y.j(obj18);
                            q81.c0 c0Var = (q81.c0) ((fa1.q0) obj).b;
                            String t = c0Var != null ? c0Var.t() : null;
                            if (t == null) {
                                t = "";
                            }
                            aVar.v = 1;
                            if (this.s.c(t, aVar) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                aVar = new tm0.a(this, cVar);
                Object obj182 = aVar.u;
                b71.a aVar162 = b71.a.r;
                i13 = aVar.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof tw0.a) {
                    aVar2 = (tw0.a) cVar;
                    int i66 = aVar2.v;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        aVar2.v = i66 - Integer.MIN_VALUE;
                        Object obj19 = aVar2.u;
                        b71.a aVar17 = b71.a.r;
                        i14 = aVar2.v;
                        if (i14 != 0) {
                            sy.y.j(obj19);
                            jn0.w4 w4Var = ((jn0.y4) obj).a;
                            yz0.x7 h0 = (w4Var == null || (z4Var = w4Var.a) == null) ? null : com.google.android.gms.internal.measurement.d5.h0(z4Var.c);
                            if (h0 != null) {
                                aVar2.v = 1;
                                if (this.s.c(h0, aVar2) == aVar17) {
                                    return aVar17;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                aVar2 = new tw0.a(this, cVar);
                Object obj192 = aVar2.u;
                b71.a aVar172 = b71.a.r;
                i14 = aVar2.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof tw0.c) {
                    cVar2 = (tw0.c) cVar;
                    int i67 = cVar2.v;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i67 - Integer.MIN_VALUE;
                        Object obj20 = cVar2.u;
                        b71.a aVar18 = b71.a.r;
                        i15 = cVar2.v;
                        if (i15 != 0) {
                            sy.y.j(obj20);
                            jn0.h7 h7Var = (jn0.h7) obj;
                            k71.k.g(h7Var, "<this>");
                            jn0.g7 g7Var = h7Var.a;
                            Integer num2 = null;
                            String str47 = (g7Var == null || (i7Var3 = g7Var.a) == null) ? null : i7Var3.b;
                            if (str47 == null) {
                                str47 = "";
                            }
                            String str48 = (g7Var == null || (i7Var2 = g7Var.a) == null) ? null : i7Var2.c;
                            String str49 = str48 != null ? str48 : "";
                            if (g7Var != null && (i7Var = g7Var.a) != null) {
                                num2 = Integer.valueOf(i7Var.d);
                            }
                            yz0.y0 y0Var = new yz0.y0(num2, str47, str49);
                            cVar2.v = 1;
                            if (this.s.c(y0Var, cVar2) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                cVar2 = new tw0.c(this, cVar);
                Object obj202 = cVar2.u;
                b71.a aVar182 = b71.a.r;
                i15 = cVar2.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof tw0.d) {
                    dVar = (tw0.d) cVar;
                    int i68 = dVar.v;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i68 - Integer.MIN_VALUE;
                        Object obj21 = dVar.u;
                        b71.a aVar19 = b71.a.r;
                        i16 = dVar.v;
                        if (i16 != 0) {
                            sy.y.j(obj21);
                            c20 c20Var = (c20) obj;
                            k71.k.g(c20Var, "<this>");
                            h20 h20Var = c20Var.a;
                            List<d20> list5 = h20Var.b;
                            ArrayList arrayList9 = null;
                            if (list5 != null) {
                                ArrayList arrayList10 = new ArrayList();
                                for (d20 d20Var : list5) {
                                    if (d20Var != null) {
                                        e20 e20Var = d20Var.b;
                                        if (e20Var != null) {
                                            y1Var = a.a.A(e20Var.c);
                                        } else {
                                            f20 f20Var = d20Var.c;
                                            if (f20Var != null) {
                                                y1Var = k21.f.J(f20Var.c);
                                            }
                                        }
                                        if (y1Var == null) {
                                            arrayList10.add(y1Var);
                                        }
                                    }
                                    y1Var = null;
                                    if (y1Var == null) {
                                    }
                                }
                                arrayList9 = arrayList10;
                            }
                            if (arrayList9 == null) {
                                arrayList9 = x61.r.r;
                            }
                            g20 g20Var = h20Var.a;
                            boolean z24 = g20Var.a;
                            String str50 = g20Var.b;
                            xz0.g gVar = new xz0.g(arrayList9, new x01.i(str50, z24, str50 == null));
                            dVar.v = 1;
                            if (this.s.c(gVar, dVar) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                dVar = new tw0.d(this, cVar);
                Object obj212 = dVar.u;
                b71.a aVar192 = b71.a.r;
                i16 = dVar.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof tw0.e) {
                    eVar = (tw0.e) cVar;
                    int i69 = eVar.v;
                    if ((i69 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i69 - Integer.MIN_VALUE;
                        Object obj23 = eVar.u;
                        b71.a aVar20 = b71.a.r;
                        i17 = eVar.v;
                        if (i17 != 0) {
                            sy.y.j(obj23);
                            q50 q50Var = ((p50) obj).a;
                            List g3 = (q50Var == null || (v5Var = q50Var.c) == null) ? x61.r.r : b91.g.g(v5Var);
                            eVar.v = 1;
                            if (this.s.c(g3, eVar) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                eVar = new tw0.e(this, cVar);
                Object obj232 = eVar.u;
                b71.a aVar202 = b71.a.r;
                i17 = eVar.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof tw0.h) {
                    hVar = (tw0.h) cVar;
                    int i71 = hVar.v;
                    if ((i71 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i71 - Integer.MIN_VALUE;
                        Object obj24 = hVar.u;
                        b71.a aVar21 = b71.a.r;
                        i18 = hVar.v;
                        if (i18 != 0) {
                            sy.y.j(obj24);
                            su suVar = ((qu) obj).a;
                            yz0.x7 h02 = (suVar == null || (ruVar = suVar.a) == null) ? null : com.google.android.gms.internal.measurement.d5.h0(ruVar.c);
                            if (h02 != null) {
                                hVar.v = 1;
                                if (this.s.c(h02, hVar) == aVar21) {
                                    return aVar21;
                                }
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                hVar = new tw0.h(this, cVar);
                Object obj242 = hVar.u;
                b71.a aVar212 = b71.a.r;
                i18 = hVar.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof tw0.j) {
                    jVar = (tw0.j) cVar;
                    int i72 = jVar.v;
                    if ((i72 & Integer.MIN_VALUE) != 0) {
                        jVar.v = i72 - Integer.MIN_VALUE;
                        Object obj25 = jVar.u;
                        b71.a aVar22 = b71.a.r;
                        i19 = jVar.v;
                        if (i19 != 0) {
                            sy.y.j(obj25);
                            yz0.w7 z0 = com.google.android.gms.internal.measurement.i4.z0((ta0) obj);
                            jVar.v = 1;
                            if (this.s.c(z0, jVar) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                jVar = new tw0.j(this, cVar);
                Object obj252 = jVar.u;
                b71.a aVar222 = b71.a.r;
                i19 = jVar.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof tw0.k) {
                    kVar = (tw0.k) cVar;
                    int i73 = kVar.v;
                    if ((i73 & Integer.MIN_VALUE) != 0) {
                        kVar.v = i73 - Integer.MIN_VALUE;
                        Object obj26 = kVar.u;
                        b71.a aVar23 = b71.a.r;
                        i21 = kVar.v;
                        if (i21 != 0) {
                            sy.y.j(obj26);
                            pa0 pa0Var = ((ma0) obj).a;
                            IssueType k = (pa0Var == null || (na0Var = pa0Var.a) == null || (oa0Var = na0Var.b) == null) ? null : aa1.b.k(oa0Var.c);
                            kVar.v = 1;
                            if (this.s.c(k, kVar) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                kVar = new tw0.k(this, cVar);
                Object obj262 = kVar.u;
                b71.a aVar232 = b71.a.r;
                i21 = kVar.v;
                if (i21 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof um0.b) {
                    bVar = (um0.b) cVar;
                    int i74 = bVar.v;
                    if ((i74 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i74 - Integer.MIN_VALUE;
                        Object obj27 = bVar.u;
                        b71.a aVar24 = b71.a.r;
                        i22 = bVar.v;
                        if (i22 != 0) {
                            sy.y.j(obj27);
                            am0.d dVar3 = (am0.d) obj;
                            wl0.i iVar = new wl0.i(dVar3);
                            am0.h0 h0Var = dVar3.a.b.a;
                            w61.k kVar3 = new w61.k(iVar, new x01.i(h0Var.b, h0Var.a, false));
                            bVar.v = 1;
                            if (this.s.c(kVar3, bVar) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                bVar = new um0.b(this, cVar);
                Object obj272 = bVar.u;
                b71.a aVar242 = b71.a.r;
                i22 = bVar.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof um0.c) {
                    cVar3 = (um0.c) cVar;
                    int i75 = cVar3.v;
                    if ((i75 & Integer.MIN_VALUE) != 0) {
                        cVar3.v = i75 - Integer.MIN_VALUE;
                        Object obj28 = cVar3.u;
                        b71.a aVar25 = b71.a.r;
                        i23 = cVar3.v;
                        if (i23 != 0) {
                            sy.y.j(obj28);
                            am0.d dVar4 = (am0.d) obj;
                            wl0.i iVar2 = new wl0.i(dVar4);
                            am0.h0 h0Var2 = dVar4.a.b.a;
                            w61.k kVar4 = new w61.k(iVar2, new x01.i(h0Var2.b, h0Var2.a, false));
                            cVar3.v = 1;
                            if (this.s.c(kVar4, cVar3) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                cVar3 = new um0.c(this, cVar);
                Object obj282 = cVar3.u;
                b71.a aVar252 = b71.a.r;
                i23 = cVar3.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 20:
                return a(cVar, obj);
            case 21:
                return b(cVar, obj);
            case 22:
                return d(cVar, obj);
            case 23:
                return e(cVar, obj);
            case 24:
                return f(cVar, obj);
            case 25:
                return g(cVar, obj);
            case 26:
                return h(cVar, obj);
            case 27:
                return i(cVar, obj);
            case 28:
                return j(cVar, obj);
            default:
                if (cVar instanceof v00.r) {
                    rVar3 = (v00.r) cVar;
                    int i76 = rVar3.v;
                    if ((i76 & Integer.MIN_VALUE) != 0) {
                        rVar3.v = i76 - Integer.MIN_VALUE;
                        Object obj29 = rVar3.u;
                        b71.a aVar26 = b71.a.r;
                        i24 = rVar3.v;
                        if (i24 != 0) {
                            sy.y.j(obj29);
                            ChatThreadWithMessagesResponse chatThreadWithMessagesResponse = (ChatThreadWithMessagesResponse) obj;
                            k71.k.g(chatThreadWithMessagesResponse, "<this>");
                            xn.s0 b = t.q.b(chatThreadWithMessagesResponse.a, chatThreadWithMessagesResponse.b);
                            rVar3.v = 1;
                            if (this.s.c(b, rVar3) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                rVar3 = new v00.r(this, cVar);
                Object obj292 = rVar3.u;
                b71.a aVar262 = b71.a.r;
                i24 = rVar3.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
        }
    }
}
