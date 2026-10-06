package com.github.rudroid.copilot;

import f1.ca;
import f1.v9;

@c71.e(c = "com.github.rudroid.copilot.CopilotChatFragment$HandleAndShowSnackbarErrorEffect$1$1$1$1", f = "CopilotChatFragment.kt", l = {363}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class m0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f9889v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ca f9890w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.activities.h0 f9891x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j71.a f9892y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ca caVar, com.github.rudroid.activities.h0 h0Var, j71.a aVar, a71.c cVar) {
        super(2, cVar);
        this.f9890w = caVar;
        this.f9891x = h0Var;
        this.f9892y = aVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m0(this.f9890w, this.f9891x, this.f9892y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public static final Object v(Object obj) {
        m0 m0Var;
        b71.a aVar = b71.a.r;
        int i = this.f9889v;
        if (i == 0) {
            sy.y.j(obj);
            String str = this.f9891x.f5819a;
            v9 v9Var = v9.f23929r;
            this.f9889v = 1;
            m0Var = this;
            if (ca.c(this.f9890w, str, null, v9Var, m0Var, 4) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            m0Var = this;
        }
        m0Var.f9892y.a();
        return w61.a0.a;
    }
    public static Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object k(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object v(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
