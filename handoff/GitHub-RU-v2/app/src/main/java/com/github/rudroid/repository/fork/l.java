package com.github.rudroid.repository.fork;

import com.github.rudroid.utilities.w0;
import sy.y;
import v71.b0;
import w61.a0;

@c71.e(c = "com.github.rudroid.repository.fork.ForkRepositoryViewModel$checkRepositoryExists$1$2", f = "ForkRepositoryViewModel.kt", l = {165}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class l extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f19737v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f19738w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, a71.c cVar) {
        super(2, cVar);
        this.f19738w = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l(this.f19738w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y71.j) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f19737v;
        if (i == 0) {
            y.j(obj);
            w0.n(this.f19738w.A);
            this.f19737v = 1;
            if (b0.l(2000L, this) == aVar) {
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
