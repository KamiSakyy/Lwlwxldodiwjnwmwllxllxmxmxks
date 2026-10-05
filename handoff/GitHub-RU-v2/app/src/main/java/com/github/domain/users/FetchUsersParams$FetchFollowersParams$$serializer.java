package com.github.domain.users;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1;
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
public final /* synthetic */ class FetchUsersParams$FetchFollowersParams$$serializer implements d0 {
    public static final FetchUsersParams$FetchFollowersParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FetchUsersParams$FetchFollowersParams$$serializer fetchUsersParams$FetchFollowersParams$$serializer = new FetchUsersParams$FetchFollowersParams$$serializer();
        INSTANCE = fetchUsersParams$FetchFollowersParams$$serializer;
        e1 e1Var = new e1("com.github.domain.users.FetchUsersParams.FetchFollowersParams", fetchUsersParams$FetchFollowersParams$$serializer, 1);
        e1Var.l("userId", false);
        descriptor = e1Var;
    }

    private FetchUsersParams$FetchFollowersParams$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final FetchUsersParams$FetchFollowersParams m72deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else {
                if (t != 0) {
                    throw new UnknownFieldException(t);
                }
                str = b.r(serialDescriptor, 0);
                i = 1;
            }
        }
        b.g(serialDescriptor);
        return new FetchUsersParams$FetchFollowersParams(str, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, FetchUsersParams$FetchFollowersParams fetchUsersParams$FetchFollowersParams) {
        k.g(encoder, "encoder");
        k.g(fetchUsersParams$FetchFollowersParams, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, fetchUsersParams$FetchFollowersParams.r);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
