package com.github.rudroid.viewmodels;

import com.github.domain.users.FetchUsersParams$FetchSponsoringParams;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w7 extends za<FetchUsersParams$FetchSponsoringParams> {
    public gn.j y;
    public com.github.rudroid.activities.util.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(gn.j jVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        super(a1Var);
        k71.k.g(jVar, "fetchSponsorablesUseCase");
        k71.k.g(cVar, "accountHolder");
        this.y = jVar;
        this.z = cVar;
        Q();
    }

    @Override // com.github.rudroid.viewmodels.za
    public final Object P(gn.n nVar, String str, j71.c cVar, c71.j jVar) {
        return this.y.a(this.z.d(), ((FetchUsersParams$FetchSponsoringParams) nVar).r, str, cVar, jVar);
    }
}
