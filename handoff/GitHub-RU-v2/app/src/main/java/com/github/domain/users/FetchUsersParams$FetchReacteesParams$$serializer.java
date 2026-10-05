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
public final /* synthetic */ class FetchUsersParams$FetchReacteesParams$$serializer implements d0 {
    public static final FetchUsersParams$FetchReacteesParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FetchUsersParams$FetchReacteesParams$$serializer fetchUsersParams$FetchReacteesParams$$serializer = new FetchUsersParams$FetchReacteesParams$$serializer();
        INSTANCE = fetchUsersParams$FetchReacteesParams$$serializer;
        e1 e1Var = new e1("com.github.domain.users.FetchUsersParams.FetchReacteesParams", fetchUsersParams$FetchReacteesParams$$serializer, 2);
        e1Var.l("subject", false);
        e1Var.l("contentType", false);
        descriptor = e1Var;
    }

    private FetchUsersParams$FetchReacteesParams$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final FetchUsersParams$FetchReacteesParams m74deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (t != 1) {
                    throw new UnknownFieldException(t);
                }
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new FetchUsersParams$FetchReacteesParams(str, i, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, FetchUsersParams$FetchReacteesParams fetchUsersParams$FetchReacteesParams) {
        k.g(encoder, "encoder");
        k.g(fetchUsersParams$FetchReacteesParams, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, fetchUsersParams$FetchReacteesParams.r);
        b.J(serialDescriptor, 1, fetchUsersParams$FetchReacteesParams.s);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
