package com.github.rudroid.pushnotifications;

@c71.e(c = "com.github.rudroid.pushnotifications.DisableLiveUpdatesWorker", f = "DisableLiveUpdatesWorker.kt", l = {43}, m = "doWork", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
class b extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f18527u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ DisableLiveUpdatesWorker f18528v;

    /* renamed from: w, reason: collision with root package name */
    public int f18529w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DisableLiveUpdatesWorker disableLiveUpdatesWorker, c71.c cVar) {
        super(cVar);
        this.f18528v = disableLiveUpdatesWorker;
    }

    public final Object v(Object obj) {
        this.f18527u = obj;
        this.f18529w |= Integer.MIN_VALUE;
        return this.f18528v.c(this);
    }
}
