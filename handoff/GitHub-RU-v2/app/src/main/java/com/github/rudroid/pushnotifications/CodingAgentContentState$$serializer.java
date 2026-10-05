package com.github.rudroid.pushnotifications;

import com.google.android.gms.internal.measurement.d5;
import k81.c1;
import k81.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@w61.c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class CodingAgentContentState$$serializer implements k81.d0 {
    public static final int $stable;
    public static final CodingAgentContentState$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CodingAgentContentState$$serializer codingAgentContentState$$serializer = new CodingAgentContentState$$serializer();
        INSTANCE = codingAgentContentState$$serializer;
        e1 e1Var = new e1("com.github.rudroid.pushnotifications.CodingAgentContentState", codingAgentContentState$$serializer, 1);
        e1Var.l("session_state", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private CodingAgentContentState$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CodingAgentContentState.f18510b[0].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CodingAgentContentState m56deserialize(Decoder decoder) {
        k71.k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        w61.h[] hVarArr = CodingAgentContentState.f18510b;
        SessionState sessionState = null;
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
                sessionState = (SessionState) b10.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), sessionState);
                i = 1;
            }
        }
        b10.g(serialDescriptor);
        return new CodingAgentContentState(i, sessionState);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CodingAgentContentState codingAgentContentState) {
        k71.k.g(encoder, "encoder");
        k71.k.g(codingAgentContentState, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.I(serialDescriptor, 0, (KSerializer) CodingAgentContentState.f18510b[0].getValue(), codingAgentContentState.f18511a);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
