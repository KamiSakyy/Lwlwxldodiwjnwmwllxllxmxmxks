package com.github.service.dotcom.repository.model;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.g;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ForkRepositoryInput$$serializer implements d0 {
    public static final ForkRepositoryInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ForkRepositoryInput$$serializer forkRepositoryInput$$serializer = new ForkRepositoryInput$$serializer();
        INSTANCE = forkRepositoryInput$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.repository.model.ForkRepositoryInput", forkRepositoryInput$$serializer, 2);
        e1Var.l("name", false);
        e1Var.l("default_branch_only", false);
        descriptor = e1Var;
    }

    private ForkRepositoryInput$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a, g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ForkRepositoryInput m143deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
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
                z2 = b.p(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new ForkRepositoryInput(i, str, z2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ForkRepositoryInput forkRepositoryInput) {
        k.g(encoder, "encoder");
        k.g(forkRepositoryInput, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, forkRepositoryInput.a);
        b.C(serialDescriptor, 1, forkRepositoryInput.b);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
