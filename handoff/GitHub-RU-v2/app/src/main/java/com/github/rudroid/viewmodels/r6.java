package com.github.rudroid.viewmodels;

import com.github.domain.users.FetchUsersParams$FetchReacteesParams;
import com.github.service.models.response.type.ReactionContent;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r6 extends za<FetchUsersParams$FetchReacteesParams> {
    public final gn.h y;
    public final com.github.rudroid.activities.util.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(gn.h hVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        super(a1Var);
        k71.k.g(hVar, "fetchReacteesUseCase");
        k71.k.g(cVar, "accountHolder");
        this.y = hVar;
        this.z = cVar;
        Q();
    }

    @Override // com.github.rudroid.viewmodels.za
    public final Object P(gn.n nVar, String str, j71.c cVar, c71.j jVar) {
        ReactionContent reactionContent;
        FetchUsersParams$FetchReacteesParams fetchUsersParams$FetchReacteesParams = (FetchUsersParams$FetchReacteesParams) nVar;
        oa.j d = this.z.d();
        String str2 = fetchUsersParams$FetchReacteesParams.r;
        r01.t tVar = ReactionContent.Companion;
        String str3 = fetchUsersParams$FetchReacteesParams.s;
        tVar.getClass();
        k71.k.g(str3, "rawValue");
        ReactionContent[] values = ReactionContent.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                reactionContent = null;
                break;
            }
            reactionContent = values[i];
            if (k71.k.b(reactionContent.getRawValue(), str3)) {
                break;
            }
            i++;
        }
        if (reactionContent == null) {
            reactionContent = ReactionContent.UNKNOWN__;
        }
        return this.y.a(d, str2, reactionContent, str, cVar, jVar);
    }
}
