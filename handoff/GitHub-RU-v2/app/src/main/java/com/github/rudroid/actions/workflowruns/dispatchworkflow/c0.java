package com.github.rudroid.actions.workflowruns.dispatchworkflow;

import com.github.rudroid.utilities.ui.g1;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class c0 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0 f5348s;

    public /* synthetic */ c0(i0 i0Var, int i) {
        this.f5347r = i;
        this.f5348s = i0Var;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f5347r) {
            case k5.f.J:
                i0 i0Var = this.f5348s;
                y1 y1Var = i0Var.B;
                y yVar = (y) ((g1) y1Var.getValue()).getData();
                List list = yVar != null ? yVar.f5410a : null;
                i0Var.P(y1Var, bVar, list == null || list.isEmpty());
                break;
            case 1:
                i0 i0Var2 = this.f5348s;
                y1 y1Var2 = i0Var2.B;
                y yVar2 = (y) ((g1) y1Var2.getValue()).getData();
                List list2 = yVar2 != null ? yVar2.f5410a : null;
                i0Var2.P(y1Var2, bVar, list2 == null || list2.isEmpty());
                break;
            default:
                i0 i0Var3 = this.f5348s;
                y1 y1Var3 = i0Var3.B;
                y yVar3 = (y) ((g1) y1Var3.getValue()).getData();
                List list3 = yVar3 != null ? yVar3.f5410a : null;
                i0Var3.P(y1Var3, bVar, list3 == null || list3.isEmpty());
                break;
        }
        return w61.a0.a;
    }
}
