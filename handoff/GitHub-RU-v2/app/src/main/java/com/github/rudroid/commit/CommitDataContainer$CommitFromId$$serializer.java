package com.github.rudroid.commit;

import com.github.rudroid.commit.CommitDataContainer;
import com.google.android.gms.internal.measurement.d5;
import k81.c1;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@w61.c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class CommitDataContainer$CommitFromId$$serializer implements k81.d0 {
    public static final int $stable;
    public static final CommitDataContainer$CommitFromId$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CommitDataContainer$CommitFromId$$serializer commitDataContainer$CommitFromId$$serializer = new CommitDataContainer$CommitFromId$$serializer();
        INSTANCE = commitDataContainer$CommitFromId$$serializer;
        e1 e1Var = new e1("com.github.rudroid.commit.CommitDataContainer.CommitFromId", commitDataContainer$CommitFromId$$serializer, 1);
        e1Var.l("commitId", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private CommitDataContainer$CommitFromId$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CommitDataContainer.CommitFromId m14deserialize(Decoder decoder) {
        k71.k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        String str = null;
        boolean z10 = true;
        int i = 0;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else {
                if (t10 != 0) {
                    throw new UnknownFieldException(t10);
                }
                str = b10.r(serialDescriptor, 0);
                i = 1;
            }
        }
        b10.g(serialDescriptor);
        return new CommitDataContainer.CommitFromId(str, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CommitDataContainer.CommitFromId commitFromId) {
        k71.k.g(encoder, "encoder");
        k71.k.g(commitFromId, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, commitFromId.f9044s);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
