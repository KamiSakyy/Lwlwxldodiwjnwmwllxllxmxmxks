package com.github.rudroid.repository.pullrequestcreation;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.r0;
import y71.y1;

@c71.e(c = "com.github.rudroid.repository.pullrequestcreation.PullRequestCreationBoxViewModel$fetchCommitDiff$1$2", f = "PullRequestCreationBoxViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class e0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z f20102v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f20103w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(z zVar, String str, a71.c cVar) {
        super(2, cVar);
        this.f20102v = zVar;
        this.f20103w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e0(this.f20102v, this.f20103w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        e0 r10 = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y1 y1Var = this.f20102v.f20150w;
        g1.a aVar2 = g1.Companion;
        a aVar3 = new a(this.f20103w, null, null, 6);
        aVar2.getClass();
        r0 r0Var = new r0(aVar3);
        y1Var.getClass();
        y1Var.k((Object) null, r0Var);
        return w61.a0.a;
    }
}
