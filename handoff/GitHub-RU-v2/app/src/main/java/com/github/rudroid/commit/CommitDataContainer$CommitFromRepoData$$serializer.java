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
public final /* synthetic */ class CommitDataContainer$CommitFromRepoData$$serializer implements k81.d0 {
    public static final int $stable;
    public static final CommitDataContainer$CommitFromRepoData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CommitDataContainer$CommitFromRepoData$$serializer commitDataContainer$CommitFromRepoData$$serializer = new CommitDataContainer$CommitFromRepoData$$serializer();
        INSTANCE = commitDataContainer$CommitFromRepoData$$serializer;
        e1 e1Var = new e1("com.github.rudroid.commit.CommitDataContainer.CommitFromRepoData", commitDataContainer$CommitFromRepoData$$serializer, 3);
        e1Var.l("repositoryOwner", false);
        e1Var.l("repositoryName", false);
        e1Var.l("commitOid", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private CommitDataContainer$CommitFromRepoData$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, b0.f9070a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CommitDataContainer.CommitFromRepoData m15deserialize(Decoder decoder) {
        k71.k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        boolean z10 = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                str2 = b10.r(serialDescriptor, 0);
                i |= 1;
            } else if (t10 == 1) {
                str3 = b10.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t10 != 2) {
                    throw new UnknownFieldException(t10);
                }
                qb.a aVar = (qb.a) b10.A(serialDescriptor, 2, b0.f9070a, str != null ? new qb.a(str) : null);
                str = aVar != null ? aVar.f31028a : null;
                i |= 4;
            }
        }
        b10.g(serialDescriptor);
        return new CommitDataContainer.CommitFromRepoData(i, str2, str3, str);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CommitDataContainer.CommitFromRepoData commitFromRepoData) {
        k71.k.g(encoder, "encoder");
        k71.k.g(commitFromRepoData, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, commitFromRepoData.f9045s);
        b10.J(serialDescriptor, 1, commitFromRepoData.f9046t);
        b10.I(serialDescriptor, 2, b0.f9070a, new qb.a(commitFromRepoData.f9047u));
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
