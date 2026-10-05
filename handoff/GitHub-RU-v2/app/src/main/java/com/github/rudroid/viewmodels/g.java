package com.github.rudroid.viewmodels;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g extends androidx.lifecycle.k1 {
    public final kj.k s;
    public final com.github.rudroid.activities.util.c t;
    public final y71.y1 u;
    public final y71.i1 v;

    public g(kj.k kVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(kVar, "commitSuggestionUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = kVar;
        this.t = cVar;
        y71.y1 s = com.github.rudroid.m0.s(fl.f.Companion, (Object) null);
        this.u = s;
        this.v = new y71.i1(s);
    }

    public final void P(String str, String str2, String str3, String str4, String str5) {
        k71.k.g(str, "pullRequestId");
        k71.k.g(str2, "headRefOid");
        k71.k.g(str3, "commentId");
        k71.k.g(str4, "suggestionId");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new f(this, str, str2, str3, str4, str5, null), 3);
    }
}
