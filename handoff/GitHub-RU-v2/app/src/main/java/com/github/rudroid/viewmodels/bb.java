package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.UsersViewModel$loadHead$1", f = "UsersViewModel.kt", l = {89, 91}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class bb extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ za w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(za zaVar, a71.c cVar) {
        super(2, cVar);
        this.w = zaVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new bb(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (((y71.i) r7).b(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r7 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        za zaVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            gn.n nVar = zaVar.u;
            ya yaVar = new ya(zaVar, 2);
            this.v = 1;
            obj = zaVar.P(nVar, null, yaVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        ab abVar = new ab(zaVar);
        this.v = 2;
    }
}
