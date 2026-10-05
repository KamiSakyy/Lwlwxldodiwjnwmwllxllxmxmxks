package com.github.rudroid.viewmodels;

import com.github.domain.users.FetchUsersParams$FetchFollowingParams;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 extends za<FetchUsersParams$FetchFollowingParams> {
    public final gn.f y;
    public final com.github.rudroid.activities.util.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(gn.f fVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        super(a1Var);
        k71.k.g(fVar, "fetchFollowingUseCase");
        k71.k.g(cVar, "accountHolder");
        this.y = fVar;
        this.z = cVar;
        Q();
    }

    @Override // com.github.rudroid.viewmodels.za
    public final Object P(gn.n nVar, String str, j71.c cVar, c71.j jVar) {
        return this.y.a(this.z.d(), ((FetchUsersParams$FetchFollowingParams) nVar).r, str, cVar, jVar);
    }
}
