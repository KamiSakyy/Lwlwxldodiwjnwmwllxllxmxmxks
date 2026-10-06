package com.github.rudroid.viewmodels.tasklist;

import sy.y;
import t00.f8;
import v71.z;
import w61.a0;
import y71.n1Shadow;

@c71.e(c = "com.github.rudroid.viewmodels.tasklist.TaskListViewModel$checkDiscussionCommentTask$1", f = "TaskListViewModel.kt", l = {223}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g extends c71.j implements j71.e {
    public final /* synthetic */ boolean A;
    public int v;
    public final /* synthetic */ n w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, String str, String str2, int i, boolean z, a71.c cVar) {
        super(2, cVar);
        this.w = nVar;
        this.x = str;
        this.y = str2;
        this.z = i;
        this.A = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g(this.w, this.x, this.y, this.z, this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            y.j(obj);
            n nVar = this.w;
            an.eShadow eVar = nVar.w;
            oa.j d = nVar.x.d();
            String str = this.x;
            c cVar = new c(nVar, str, 1);
            eVar.getClass();
            k71.k.g(str, "id");
            String str2 = this.y;
            k71.k.g(str2, "body");
            a71.c cVar2 = null;
            y71.y J = b31.b.J(n1Shadow.x(new an.d(eVar, d, str, cVar, cVar2, 0), new f8(new an.a(eVar, str2, this.z, this.A, cVar2, 1))), d, cVar);
            f fVar = new f(nVar, str);
            this.v = 1;
            if (J.b(fVar, this) == aVar) {
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
