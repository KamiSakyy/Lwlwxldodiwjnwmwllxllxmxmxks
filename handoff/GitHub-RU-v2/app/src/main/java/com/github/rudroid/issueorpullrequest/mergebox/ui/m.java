package com.github.rudroid.issueorpullrequest.mergebox.ui;

import androidx.compose.runtime.f1;

@c71.e(c = "com.github.rudroid.issueorpullrequest.mergebox.ui.MergeBoxActionStateContentKt$MergeBoxActionStateContent$1$1$painter$1$1", f = "MergeBoxActionStateContent.kt", l = {70}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class m extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f15722v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0.a f15723w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f1 f15724x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d0.a aVar, f1 f1Var, a71.c cVar) {
        super(2, cVar);
        this.f15723w = aVar;
        this.f15724x = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m(this.f15723w, this.f15724x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
        return b71.a.r;
    }

    public final Object v(Object obj) {
        long j10;
        b71.a aVar = b71.a.r;
        int i = this.f15722v;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sy.y.j(obj);
        do {
            this.f15724x.setValue(Boolean.valueOf(!((Boolean) r6.getValue()).booleanValue()));
            j10 = this.f15723w.f20937c;
            this.f15722v = 1;
        } while (v71.b0.l(j10, this) != aVar);
        return aVar;
    }
}
