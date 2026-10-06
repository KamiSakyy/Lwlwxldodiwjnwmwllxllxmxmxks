package com.github.domain.discussions.data;

import com.google.android.gms.internal.measurement.d5;
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
import m71.a;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class RepositoryDiscussionsIntentData$Deeplink$$serializer implements d0 {
    public static final RepositoryDiscussionsIntentData$Deeplink$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RepositoryDiscussionsIntentData$Deeplink$$serializer repositoryDiscussionsIntentData$Deeplink$$serializer = new RepositoryDiscussionsIntentData$Deeplink$$serializer();
        INSTANCE = repositoryDiscussionsIntentData$Deeplink$$serializer;
        e1 e1Var = new e1("com.github.domain.discussions.data.RepositoryDiscussionsIntentData.Deeplink", repositoryDiscussionsIntentData$Deeplink$$serializer, 3);
        e1Var.l("repositoryOwner", false);
        e1Var.l("repositoryName", false);
        e1Var.l("filtersQuery", false);
        descriptor = e1Var;
    }

    private RepositoryDiscussionsIntentData$Deeplink$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        return new KSerializer[]{kSerializer, a.z(kSerializer), a.z(kSerializer)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RepositoryDiscussionsIntentData$Deeplink m19deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str2 = (String) b.x(serialDescriptor, 1, q1.a, str2);
                i |= 2;
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                str3 = (String) b.x(serialDescriptor, 2, q1.a, str3);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new RepositoryDiscussionsIntentData$Deeplink(i, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, RepositoryDiscussionsIntentData$Deeplink repositoryDiscussionsIntentData$Deeplink) {
        k.g(encoder, "encoder");
        k.g(repositoryDiscussionsIntentData$Deeplink, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, repositoryDiscussionsIntentData$Deeplink.r);
        q1 q1Var = q1.a;
        b.H(serialDescriptor, 1, q1Var, repositoryDiscussionsIntentData$Deeplink.s);
        b.H(serialDescriptor, 2, q1Var, repositoryDiscussionsIntentData$Deeplink.t);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
