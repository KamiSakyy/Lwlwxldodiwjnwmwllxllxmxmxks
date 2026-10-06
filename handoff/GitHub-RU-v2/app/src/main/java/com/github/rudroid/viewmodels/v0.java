package com.github.rudroid.viewmodels;

import com.github.domain.users.FetchUsersParams$FetchFollowersParams;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 extends za<FetchUsersParams$FetchFollowersParams> {
    public gn.d y;
    public com.github.rudroid.activities.util.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(gn.d dVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        super(a1Var);
        k71.k.g(dVar, "fetchFollowersUseCase");
        k71.k.g(cVar, "accountHolder");
        this.y = dVar;
        this.z = cVar;
        Q();
    }

    @Override // com.github.rudroid.viewmodels.za
    public final Object P(gn.n nVar, String str, j71.c cVar, c71.j jVar) {
        return this.y.a(this.z.d(), ((FetchUsersParams$FetchFollowersParams) nVar).r, str, cVar, jVar);
    }
}
