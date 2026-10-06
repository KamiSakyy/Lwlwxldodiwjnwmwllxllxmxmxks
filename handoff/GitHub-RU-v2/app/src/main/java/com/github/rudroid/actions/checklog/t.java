package com.github.rudroid.actions.checklog;

import com.github.rudroid.actions.workflowruns.dispatchworkflow.DispatchWorkflowBottomSheet;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.type.StatusState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class t implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4876r;

    public /* synthetic */ t(int i) {
        this.f4876r = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int size;
        x61.rShadow l02;
        int i = this.f4876r;
        int i10 = 0;
        w61.a0 a0Var = w61.a0.a;
        switch (i) {
            case k5.f.J:
                pi.p pVar = (pi.p) obj;
                k71.k.g(pVar, "it");
                break;
            case 1:
                break;
            case 2:
                g1 g1Var = (g1) obj;
                k71.k.g(g1Var, "event");
                break;
            case 3:
                mn.i iVar = (mn.i) obj;
                k71.k.g(iVar, "it");
                String str = iVar.a;
                StatusState statusState = iVar.b;
                mn.m mVar = iVar.c;
                Object r92 = iVar.d;
                ArrayList a10 = ta.e.a(r92, null, new x01.i((String) null, false, true));
                mn.h hVar = iVar.e;
                Object r32 = hVar.b;
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : r32) {
                    if (!atomicBoolean.getAndSet(!((mn.f) obj2).f.a.a())) {
                        ArrayList arrayList2 = new ArrayList();
                        size = arrayList.size();
                        while (i10 < size) {
                            Object obj3 = arrayList.get(i10);
                            i10++;
                            mn.f fVar = (mn.f) obj3;
                            mn.e eVar = fVar.f;
                            String str2 = fVar.a;
                            if (eVar.c.isEmpty()) {
                                l02 = x61.rShadow.r;
                            } else {
                                List n10 = sy.d0Shadow.n(new ta.c(str2, hVar.a, fVar));
                                mn.e eVar2 = fVar.f;
                                l02 = x61.m.l0(n10, ta.e.a(eVar2.c, str2, eVar2.a));
                            }
                            x61.m.J(arrayList2, l02);
                        }
                        break;
                    } else {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList22 = new ArrayList();
                size = arrayList.size();
                while (i10 < size) {
                }
            case 4:
                break;
            case 5:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                break;
            case 6:
                g1 g1Var2 = (g1) obj;
                k71.k.g(g1Var2, "stateEvent");
                break;
            case 7:
                mn.xShadow xVar = (mn.xShadow) obj;
                k71.k.g(xVar, "it");
                break;
            case 8:
                mn.n nVar = (mn.n) obj;
                k71.k.g(nVar, "it");
                break;
            case 9:
                k71.k.g((d3.c0) obj, "$this$semantics");
                break;
            case 10:
                k71.k.g((d3.c0) obj, "$this$semantics");
                break;
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                d3.c0 c0Var = (d3.c0) obj;
                DispatchWorkflowBottomSheet.a aVar = DispatchWorkflowBottomSheet.Companion;
                k71.k.g(c0Var, "$this$semantics");
                d3.z.b(c0Var);
                break;
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                com.github.rudroid.actions.workflowruns.dispatchworkflow.y yVar = (com.github.rudroid.actions.workflowruns.dispatchworkflow.y) obj;
                k71.k.g(yVar, "it");
                break;
            case 13:
                d3.c0 c0Var2 = (d3.c0) obj;
                k71.k.g(c0Var2, "$this$clearAndSetSemantics");
                d3.z.c(c0Var2);
                break;
            case 14:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                break;
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                com.github.rudroid.actions.workflowruns.c cVar = (com.github.rudroid.actions.workflowruns.c) obj;
                k71.k.g(cVar, "it");
                break;
            case 16:
                break;
            case 17:
                k71.k.g((d3.c0) obj, "$this$semantics");
                break;
            case 18:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                break;
            case 19:
                k71.k.g((d3.c0) obj, "$this$semantics");
                break;
            case 20:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                break;
            case 21:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                break;
            case 22:
                le.v vVar = (le.v) obj;
                k71.k.g(vVar, "it");
                break;
            case 23:
                d3.c0 c0Var3 = (d3.c0) obj;
                k71.k.g(c0Var3, "$this$semantics");
                d3.z.b(c0Var3);
                break;
            case 24:
                d3.c0 c0Var4 = (d3.c0) obj;
                k71.k.g(c0Var4, "$this$semantics");
                d3.z.b(c0Var4);
                break;
            case 25:
                d3.c0 c0Var5 = (d3.c0) obj;
                k71.k.g(c0Var5, "$this$semantics");
                d3.z.b(c0Var5);
                break;
            case 26:
                d3.c0 c0Var6 = (d3.c0) obj;
                k71.k.g(c0Var6, "$this$semantics");
                d3.z.b(c0Var6);
                break;
            case 27:
                d3.c0 c0Var7 = (d3.c0) obj;
                k71.k.g(c0Var7, "$this$semantics");
                d3.z.b(c0Var7);
                break;
            case 28:
                d3.c0 c0Var8 = (d3.c0) obj;
                k71.k.g(c0Var8, "$this$semantics");
                d3.z.b(c0Var8);
                break;
            default:
                d3.c0 c0Var9 = (d3.c0) obj;
                k71.k.g(c0Var9, "$this$semantics");
                d3.z.b(c0Var9);
                break;
        }
        return a0Var;
    }
}
