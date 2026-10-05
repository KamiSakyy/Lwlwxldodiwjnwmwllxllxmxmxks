package com.github.rudroid.issueorpullrequest.assigncopilot;

import androidx.compose.runtime.f1;

@c71.e(c = "com.github.rudroid.issueorpullrequest.assigncopilot.AgentAssignmentConfigBottomSheet$getContent$1$hideRepositoryBottomSheet$1$1$1", f = "AgentAssignmentConfigBottomSheet.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class i extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f1 f15220v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f1 f1Var, a71.c cVar) {
        super(2, cVar);
        this.f15220v = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i(this.f15220v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        i r10 = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.f15220v.setValue(Boolean.FALSE);
        return w61.a0.a;
    }
}
