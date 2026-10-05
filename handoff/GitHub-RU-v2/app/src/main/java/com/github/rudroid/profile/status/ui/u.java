package com.github.rudroid.profile.status.ui;

import android.content.Context;

@c71.e(c = "com.github.rudroid.profile.status.ui.SetStatusScreenKt$SetStatusScreen$2$3$2$1", f = "SetStatusScreen.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class u extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f17437v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f17438w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, String str, a71.c cVar) {
        super(2, cVar);
        this.f17437v = context;
        this.f17438w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new u(this.f17437v, this.f17438w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        u r10 = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        new com.github.rudroid.utilities.b(this.f17437v).b(this.f17438w);
        return w61.a0.a;
    }
}
