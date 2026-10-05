package com.github.rudroid.projects.ui;

import f1.ca;
import f1.la;
import f1.v9;

@c71.e(c = "com.github.rudroid.projects.ui.ProjectsScreenKt$ProjectsScreen$2$2$1$1", f = "ProjectsScreen.kt", l = {109}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class a0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f18275v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ca f18276w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f18277x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f18278y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ j71.a f18279z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ca caVar, String str, String str2, j71.a aVar, a71.c cVar) {
        super(2, cVar);
        this.f18276w = caVar;
        this.f18277x = str;
        this.f18278y = str2;
        this.f18279z = aVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a0(this.f18276w, this.f18277x, this.f18278y, this.f18279z, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        a0 a0Var;
        b71.a aVar = b71.a.r;
        int i = this.f18275v;
        if (i == 0) {
            sy.y.j(obj);
            v9 v9Var = v9.f23930s;
            this.f18275v = 1;
            a0Var = this;
            obj = ca.c(this.f18276w, this.f18277x, this.f18278y, v9Var, a0Var, 4);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            a0Var = this;
        }
        if (((la) obj) == la.f23254s) {
            a0Var.f18279z.a();
        }
        return w61.a0.a;
    }
}
