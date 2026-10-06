package com.github.rudroid.projects.triagesheet;

@c71.e(c = "com.github.rudroid.projects.triagesheet.TriageProjectsViewModel$addSelectedProject$1", f = "TriageProjectsViewModel.kt", l = {97}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class t0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f18156v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f18157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s0 s0Var, a71.c cVar) {
        super(2, cVar);
        this.f18157w = s0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new t0(this.f18157w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f18156v;
        if (i == 0) {
            sy.y.j(obj);
            x71.hShadow hVar = this.f18157w.f18090y;
            Boolean bool = Boolean.TRUE;
            this.f18156v = 1;
            if (hVar.l(this, bool) == aVar) {
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
