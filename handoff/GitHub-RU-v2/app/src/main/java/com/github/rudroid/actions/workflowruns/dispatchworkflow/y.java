package com.github.rudroid.actions.workflowruns.dispatchworkflow;

import com.github.rudroid.copilot.h1;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public List f5410a;

    /* renamed from: b, reason: collision with root package name */
    public String f5411b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5412c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5413d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5414e;

    public y(List list, String str, boolean z10, boolean z11, boolean z12) {
        k71.k.g(list, "workflowInputs");
        this.f5410a = list;
        this.f5411b = str;
        this.f5412c = z10;
        this.f5413d = z11;
        this.f5414e = z12;
    }

    public static y a(y yVar, List list, String str, boolean z10, boolean z11, int i) {
        if ((i & 1) != 0) {
            list = yVar.f5410a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            str = yVar.f5411b;
        }
        String str2 = str;
        boolean z12 = (i & 4) != 0 ? yVar.f5412c : true;
        if ((i & 8) != 0) {
            z10 = yVar.f5413d;
        }
        boolean z13 = z10;
        if ((i & 16) != 0) {
            z11 = yVar.f5414e;
        }
        yVar.getClass();
        k71.k.g(list2, "workflowInputs");
        return new y(list2, str2, z12, z13, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.f5410a, yVar.f5410a) && k71.k.b(this.f5411b, yVar.f5411b) && this.f5412c == yVar.f5412c && this.f5413d == yVar.f5413d && this.f5414e == yVar.f5414e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5414e) + x.i.e(x.i.e(h1.i(this.f5410a.hashCode() * 31, this.f5411b, 31), 31, this.f5412c), 31, this.f5413d);
    }

    public final String toString() {
        StringBuilder n10 = com.github.rudroid.m0.n("DispatchWorkflowState(workflowInputs=", ", currentBranch=", this.f5411b, ", shouldDismiss=", this.f5410a);
        com.github.rudroid.m0.A(n10, this.f5412c, ", invalidInputsAndAttemptedDispatch=", this.f5413d, ", hasWorkflowDispatchTrigger=");
        return f4Shadow.s(n10, this.f5414e, ")");
    }
}
