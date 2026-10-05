package com.github.rudroid.twofactor.worker;

@c71.e(c = "com.github.rudroid.twofactor.worker.RegisterTwoFactorWorker", f = "RegisterTwoFactorWorker.kt", l = {64, 65}, m = "doWork", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a extends c71.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ RegisterTwoFactorWorker v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RegisterTwoFactorWorker registerTwoFactorWorker, c71.c cVar) {
        super(cVar);
        this.v = registerTwoFactorWorker;
    }

    public final Object v(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
