package com.github.rudroid.viewmodels.issuesorpullrequests;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$initUiElements$1", f = "IssueOrPullRequestViewModel.kt", l = {886, 886}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class m0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l lVar, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (((y71.i) r6).b(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r6 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        l lVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            obj = l.P(lVar, this);
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
        l0 l0Var = new l0(lVar);
        this.v = 2;
    }
}
