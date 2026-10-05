package com.github.rudroid.agents.copilothome.navigation;

import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.agents.copilothome.navigation.CopilotNavigationContextLifecycleObserverKt$collectCopilotNavigationContext$1$1", f = "CopilotNavigationContextLifecycleObserver.kt", l = {33}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class g extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f6830v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y71.i f6831w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j71.c f6832x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f6833y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(y71.i iVar, j71.c cVar, d dVar, a71.c cVar2) {
        super(2, cVar2);
        this.f6831w = iVar;
        this.f6832x = cVar;
        this.f6833y = dVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g(this.f6831w, this.f6832x, this.f6833y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f6830v;
        if (i == 0) {
            y.j(obj);
            f fVar = new f(this.f6832x, this.f6833y);
            this.f6830v = 1;
            if (this.f6831w.b(fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0.a;
    }
}
