package com.github.rudroid.createrepository;

import com.github.rudroid.utilities.w0;

@c71.e(c = "com.github.rudroid.createrepository.CreateRepositoryViewModel$checkRepositoryNameExists$1$2", f = "CreateRepositoryViewModel.kt", l = {233}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class s extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f10609v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f10610w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, a71.c cVar) {
        super(2, cVar);
        this.f10610w = qVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s(this.f10610w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y71.j) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f10609v;
        if (i == 0) {
            sy.y.j(obj);
            w0.n(this.f10610w.f10606z);
            this.f10609v = 1;
            if (v71.b0.l(500L, this) == aVar) {
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
