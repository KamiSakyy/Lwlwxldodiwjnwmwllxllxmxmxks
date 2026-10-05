package com.github.domain.users;

import g81.d;
import gn.n;
import java.lang.annotation.Annotation;
import k71.x;
import kotlinx.serialization.KSerializer;
import r71.b;

/* loaded from: /home/user/work/p/classes3.dex */
public final class FetchUsersParams$Companion {
    public static final /* synthetic */ FetchUsersParams$Companion a = new FetchUsersParams$Companion();

    public final KSerializer serializer() {
        return new d("com.github.domain.users.FetchUsersParams", x.a(n.class), new b[]{x.a(FetchUsersParams$FetchContributorsParams.class), x.a(FetchUsersParams$FetchFollowersParams.class), x.a(FetchUsersParams$FetchFollowingParams.class), x.a(FetchUsersParams$FetchReacteesParams.class), x.a(FetchUsersParams$FetchReleaseMentionsParams.class), x.a(FetchUsersParams$FetchSponsoringParams.class), x.a(FetchUsersParams$FetchStargazersParams.class), x.a(FetchUsersParams$FetchWatchersParams.class)}, new KSerializer[]{FetchUsersParams$FetchContributorsParams$$serializer.INSTANCE, FetchUsersParams$FetchFollowersParams$$serializer.INSTANCE, FetchUsersParams$FetchFollowingParams$$serializer.INSTANCE, FetchUsersParams$FetchReacteesParams$$serializer.INSTANCE, FetchUsersParams$FetchReleaseMentionsParams$$serializer.INSTANCE, FetchUsersParams$FetchSponsoringParams$$serializer.INSTANCE, FetchUsersParams$FetchStargazersParams$$serializer.INSTANCE, FetchUsersParams$FetchWatchersParams$$serializer.INSTANCE}, new Annotation[0]);
    }
}
