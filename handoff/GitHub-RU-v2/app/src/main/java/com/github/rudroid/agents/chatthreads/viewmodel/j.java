package com.github.rudroid.agents.chatthreads.viewmodel;

import com.github.rudroid.utilities.w0;
import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.agents.chatthreads.viewmodel.ChatThreadsViewModel$refresh$1$2", f = "ChatThreadsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class j extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f6729v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f6730w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a71.c cVar, m mVar, boolean z10) {
        super(2, cVar);
        this.f6729v = z10;
        this.f6730w = mVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j(cVar, this.f6730w, this.f6729v);
    }

    public final Object s(Object obj, Object obj2) {
        j r10 = r((a71.c) obj2, (y71.j) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        y.j(obj);
        if (!this.f6729v) {
            w0.h(this.f6730w.f6741x);
        }
        return a0.a;
    }
}
