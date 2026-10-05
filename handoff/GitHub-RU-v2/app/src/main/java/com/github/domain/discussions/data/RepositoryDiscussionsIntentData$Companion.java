package com.github.domain.discussions.data;

import g81.d;
import java.lang.annotation.Annotation;
import jk.j;
import k71.x;
import kotlinx.serialization.KSerializer;
import r71.b;

/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryDiscussionsIntentData$Companion {
    public static final /* synthetic */ RepositoryDiscussionsIntentData$Companion a = new RepositoryDiscussionsIntentData$Companion();

    public final KSerializer serializer() {
        return new d("com.github.domain.discussions.data.RepositoryDiscussionsIntentData", x.a(j.class), new b[]{x.a(RepositoryDiscussionsIntentData$Basic.class), x.a(RepositoryDiscussionsIntentData$Deeplink.class), x.a(RepositoryDiscussionsIntentData$DeeplinkWithCategory.class), x.a(RepositoryDiscussionsIntentData$OrganizationDeeplink.class), x.a(RepositoryDiscussionsIntentData$WithCategory.class)}, new KSerializer[]{RepositoryDiscussionsIntentData$Basic$$serializer.INSTANCE, RepositoryDiscussionsIntentData$Deeplink$$serializer.INSTANCE, RepositoryDiscussionsIntentData$DeeplinkWithCategory$$serializer.INSTANCE, RepositoryDiscussionsIntentData$OrganizationDeeplink$$serializer.INSTANCE, RepositoryDiscussionsIntentData$WithCategory$$serializer.INSTANCE}, new Annotation[0]);
    }
}
