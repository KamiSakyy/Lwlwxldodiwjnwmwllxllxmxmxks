package com.github.domain.database.serialization;

import com.github.service.models.response.type.MilestoneState;
import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.l0;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.h;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SerializableMilestone$$serializer implements d0 {
    public static final SerializableMilestone$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SerializableMilestone$$serializer serializableMilestone$$serializer = new SerializableMilestone$$serializer();
        INSTANCE = serializableMilestone$$serializer;
        e1 e1Var = new e1("com.github.domain.database.serialization.SerializableMilestone", serializableMilestone$$serializer, 5);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("state", false);
        e1Var.l("progress", false);
        e1Var.l("dueOnString", false);
        descriptor = e1Var;
    }

    private SerializableMilestone$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = SerializableMilestone.w;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, hVarArr[2].getValue(), l0.a, m71.a.z(q1Var)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SerializableMilestone m14deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = SerializableMilestone.w;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        MilestoneState milestoneState = null;
        String str3 = null;
        boolean z = true;
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
            } else if (t == 2) {
                milestoneState = (MilestoneState) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), milestoneState);
                i |= 4;
            } else if (t == 3) {
                i2 = b.m(serialDescriptor, 3);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                str3 = (String) b.x(serialDescriptor, 4, q1.a, str3);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new SerializableMilestone(i, str, str2, milestoneState, i2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SerializableMilestone serializableMilestone) {
        k.g(encoder, "encoder");
        k.g(serializableMilestone, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = SerializableMilestone.w;
        b.J(serialDescriptor, 0, serializableMilestone.r);
        b.J(serialDescriptor, 1, serializableMilestone.s);
        b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), serializableMilestone.t);
        b.F(3, serializableMilestone.u, serialDescriptor);
        b.H(serialDescriptor, 4, q1.a, serializableMilestone.v);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
