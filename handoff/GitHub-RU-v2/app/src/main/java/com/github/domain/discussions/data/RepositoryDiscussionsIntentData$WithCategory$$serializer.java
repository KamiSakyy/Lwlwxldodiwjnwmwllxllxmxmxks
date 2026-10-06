package com.github.domain.discussions.data;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class RepositoryDiscussionsIntentData$WithCategory$$serializer implements d0 {
    public static final RepositoryDiscussionsIntentData$WithCategory$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RepositoryDiscussionsIntentData$WithCategory$$serializer repositoryDiscussionsIntentData$WithCategory$$serializer = new RepositoryDiscussionsIntentData$WithCategory$$serializer();
        INSTANCE = repositoryDiscussionsIntentData$WithCategory$$serializer;
        e1 e1Var = new e1("com.github.domain.discussions.data.RepositoryDiscussionsIntentData.WithCategory", repositoryDiscussionsIntentData$WithCategory$$serializer, 3);
        e1Var.l("repositoryOwner", false);
        e1Var.l("repositoryName", false);
        e1Var.l("categoryData", false);
        descriptor = e1Var;
    }

    private RepositoryDiscussionsIntentData$WithCategory$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, DiscussionCategoryData$$serializer.INSTANCE};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RepositoryDiscussionsIntentData$WithCategory m22deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        DiscussionCategoryData discussionCategoryData = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                discussionCategoryData = (DiscussionCategoryData) b.A(serialDescriptor, 2, DiscussionCategoryData$$serializer.INSTANCE, discussionCategoryData);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new RepositoryDiscussionsIntentData$WithCategory(i, str, str2, discussionCategoryData);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, RepositoryDiscussionsIntentData$WithCategory repositoryDiscussionsIntentData$WithCategory) {
        k.g(encoder, "encoder");
        k.g(repositoryDiscussionsIntentData$WithCategory, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, repositoryDiscussionsIntentData$WithCategory.r);
        b.J(serialDescriptor, 1, repositoryDiscussionsIntentData$WithCategory.s);
        b.I(serialDescriptor, 2, DiscussionCategoryData$$serializer.INSTANCE, repositoryDiscussionsIntentData$WithCategory.t);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
