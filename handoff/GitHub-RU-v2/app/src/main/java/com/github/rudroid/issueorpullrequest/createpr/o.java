package com.github.rudroid.issueorpullrequest.createpr;

import f1.ca;
import f1.v9;

@c71.e(c = "com.github.rudroid.issueorpullrequest.createpr.CompareChangesBottomSheet$getContent$1$3$3$2$1$1$1$1", f = "CompareChangesBottomSheet.kt", l = {193}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class o extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f15357v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ca f15358w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.activities.h0 f15359x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ca caVar, com.github.rudroid.activities.h0 h0Var, a71.c cVar) {
        super(2, cVar);
        this.f15358w = caVar;
        this.f15359x = h0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o(this.f15358w, this.f15359x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f15357v;
        if (i == 0) {
            sy.y.j(obj);
            String str = this.f15359x.f5819a;
            v9 v9Var = v9.f23929r;
            this.f15357v = 1;
            if (ca.c(this.f15358w, str, null, v9Var, this, 4) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
