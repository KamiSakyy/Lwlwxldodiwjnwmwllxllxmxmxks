package com.github.rudroid.actions.workflowruns;

import com.github.service.models.response.CheckStatusState;
import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public mn.u f5325a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5326b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5327c;

    public c(mn.u uVar, boolean z10) {
        CheckStatusState checkStatusState = uVar.g.b;
        boolean z11 = false;
        boolean z12 = (checkStatusState == CheckStatusState.COMPLETED || checkStatusState == CheckStatusState.UNKNOWN__) ? false : true;
        boolean z13 = uVar.j.d;
        if (z12 && z13) {
            z11 = true;
        }
        this.f5325a = uVar;
        this.f5326b = z10;
        this.f5327c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.f5325a, cVar.f5325a) && this.f5326b == cVar.f5326b && this.f5327c == cVar.f5327c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5327c) + x.i.e(this.f5325a.hashCode() * 31, 31, this.f5326b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkflowRunUiModel(run=");
        sb2.append(this.f5325a);
        sb2.append(", isCancelling=");
        sb2.append(this.f5326b);
        sb2.append(", viewerCanCancelRun=");
        return f4.s(sb2, this.f5327c, ")");
    }
}
