package com.github.rudroid.notifications.domain;

@c71.e(c = "com.github.rudroid.notifications.domain.LocalNotificationsWorker", f = "LocalNotificationsWorker.kt", l = {26}, m = "doWork", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class d extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f17128u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ LocalNotificationsWorker f17129v;

    /* renamed from: w, reason: collision with root package name */
    public int f17130w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LocalNotificationsWorker localNotificationsWorker, c71.c cVar) {
        super(cVar);
        this.f17129v = localNotificationsWorker;
    }

    public final Object v(Object obj) {
        this.f17128u = obj;
        this.f17130w |= Integer.MIN_VALUE;
        return this.f17129v.c(this);
    }
}
