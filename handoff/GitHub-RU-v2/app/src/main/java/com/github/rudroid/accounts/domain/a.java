package com.github.rudroid.accounts.domain;

@c71.e(c = "com.github.rudroid.accounts.domain.ServerAndCapabilitiesWorker", f = "ServerAndCapabilitiesWorker.kt", l = {54}, m = "doWork", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class a extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f4362u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ServerAndCapabilitiesWorker f4363v;

    /* renamed from: w, reason: collision with root package name */
    public int f4364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ServerAndCapabilitiesWorker serverAndCapabilitiesWorker, c71.c cVar) {
        super(cVar);
        this.f4363v = serverAndCapabilitiesWorker;
    }

    public final Object v(Object obj) {
        this.f4362u = obj;
        this.f4364w |= Integer.MIN_VALUE;
        return this.f4363v.c(this);
    }
}
