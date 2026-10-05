package com.github.domain.database.serialization;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.Avatar$;
import com.google.android.gms.internal.measurement.d5;
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

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SerializableAssignee$$serializer implements d0 {
    public static final SerializableAssignee$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SerializableAssignee$$serializer serializableAssignee$$serializer = new SerializableAssignee$$serializer();
        INSTANCE = serializableAssignee$$serializer;
        e1 e1Var = new e1("com.github.domain.database.serialization.SerializableAssignee", serializableAssignee$$serializer, 7);
        e1Var.l("login", false);
        e1Var.l("avatar", false);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("isBot", false);
        e1Var.l("isCopilot", false);
        e1Var.l("isAgent", false);
        descriptor = e1Var;
    }

    private SerializableAssignee$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        g gVar = g.a;
        return new KSerializer[]{q1Var, Avatar$.serializer.INSTANCE, q1Var, q1Var, gVar, gVar, gVar};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SerializableAssignee m12deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        Avatar avatar = null;
        String str2 = null;
        String str3 = null;
        boolean z4 = true;
        while (z4) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z4 = false;
                    break;
                case 0:
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    avatar = (Avatar) b.A(serialDescriptor, 1, Avatar$.serializer.INSTANCE, avatar);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z = b.p(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.p(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z3 = b.p(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new SerializableAssignee(i, str, avatar, str2, str3, z, z2, z3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SerializableAssignee serializableAssignee) {
        k.g(encoder, "encoder");
        k.g(serializableAssignee, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, serializableAssignee.r);
        b.I(serialDescriptor, 1, Avatar$.serializer.INSTANCE, serializableAssignee.s);
        b.J(serialDescriptor, 2, serializableAssignee.t);
        b.J(serialDescriptor, 3, serializableAssignee.u);
        b.C(serialDescriptor, 4, serializableAssignee.v);
        b.C(serialDescriptor, 5, serializableAssignee.w);
        b.C(serialDescriptor, 6, serializableAssignee.x);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
