package com.github.rudroid.viewmodels;

import com.github.domain.users.FetchUsersParams$FetchReleaseMentionsParams;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s6 extends za<FetchUsersParams$FetchReleaseMentionsParams> {
    public final kl.c y;
    public final com.github.rudroid.activities.util.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(kl.c cVar, com.github.rudroid.activities.util.c cVar2, androidx.lifecycle.a1 a1Var) {
        super(a1Var);
        k71.k.g(cVar, "fetchReleaseMentionsUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.y = cVar;
        this.z = cVar2;
        Q();
    }

    @Override // com.github.rudroid.viewmodels.za
    public final Object P(gn.n nVar, String str, j71.c cVar, c71.j jVar) {
        FetchUsersParams$FetchReleaseMentionsParams fetchUsersParams$FetchReleaseMentionsParams = (FetchUsersParams$FetchReleaseMentionsParams) nVar;
        oa.j d = this.z.d();
        String str2 = fetchUsersParams$FetchReleaseMentionsParams.r;
        String str3 = fetchUsersParams$FetchReleaseMentionsParams.s;
        String str4 = fetchUsersParams$FetchReleaseMentionsParams.t;
        kl.c cVar2 = this.y;
        cVar2.getClass();
        k71.k.g(str2, "repositoryOwner");
        k71.k.g(str3, "repositoryName");
        k71.k.g(str4, "tagName");
        return b31.b.J(((z01.b1) cVar2.a.a(d)).c(str2, str3, str4, str), d, cVar);
    }
}
