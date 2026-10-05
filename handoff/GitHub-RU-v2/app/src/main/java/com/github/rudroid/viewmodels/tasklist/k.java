package com.github.rudroid.viewmodels.tasklist;

import sy.y;
import t00.f8;
import v71.z;
import w61.a0;
import y71.n1;

@c71.e(c = "com.github.rudroid.viewmodels.tasklist.TaskListViewModel$checkIssueOrPullRequestCommentTask$1", f = "TaskListViewModel.kt", l = {169}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.e {
    public final /* synthetic */ boolean A;
    public int v;
    public final /* synthetic */ n w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, String str, String str2, int i, boolean z, a71.c cVar) {
        super(2, cVar);
        this.w = nVar;
        this.x = str;
        this.y = str2;
        this.z = i;
        this.A = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k(this.w, this.x, this.y, this.z, this.A, cVar);
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
            an.j jVar = nVar.u;
            oa.j d = nVar.x.d();
            String str = this.x;
            c cVar = new c(nVar, str, 3);
            jVar.getClass();
            k71.k.g(str, "id");
            String str2 = this.y;
            k71.k.g(str2, "body");
            y71.y J = b31.b.J(new y71.y(n1.x(new an.g(jVar, d, str, null, 0), new f8(new an.a(jVar, str2, this.z, this.A, null, 3))), new an.i(jVar, d, (a71.c) null, 0), 6), d, cVar);
            j jVar2 = new j(nVar, str);
            this.v = 1;
            if (J.b(jVar2, this) == aVar) {
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
