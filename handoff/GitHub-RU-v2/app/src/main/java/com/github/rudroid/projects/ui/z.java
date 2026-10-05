package com.github.rudroid.projects.ui;

import f1.ca;

@c71.e(c = "com.github.rudroid.projects.ui.ProjectsScreenKt$ProjectsScreen$2$1$1$1$1", f = "ProjectsScreen.kt", l = {92}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class z extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f18458v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ca f18459w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f18460x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ca caVar, String str, a71.c cVar) {
        super(2, cVar);
        this.f18459w = caVar;
        this.f18460x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z(this.f18459w, this.f18460x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f18458v;
        if (i == 0) {
            sy.y.j(obj);
            this.f18458v = 1;
            if (ca.c(this.f18459w, this.f18460x, null, null, this, 14) == aVar) {
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
