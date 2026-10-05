package com.github.service.repositorycreation;

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
import m71.a;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class CreateRepositoryInput$$serializer implements d0 {
    public static final CreateRepositoryInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CreateRepositoryInput$$serializer createRepositoryInput$$serializer = new CreateRepositoryInput$$serializer();
        INSTANCE = createRepositoryInput$$serializer;
        e1 e1Var = new e1("com.github.service.repositorycreation.CreateRepositoryInput", createRepositoryInput$$serializer, 6);
        e1Var.l("name", false);
        e1Var.l("description", true);
        e1Var.l("private", true);
        e1Var.l("auto_init", true);
        e1Var.l("gitignore_template", true);
        e1Var.l("license_template", true);
        descriptor = e1Var;
    }

    private CreateRepositoryInput$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        KSerializer z = a.z(kSerializer);
        KSerializer z2 = a.z(kSerializer);
        KSerializer z3 = a.z(kSerializer);
        g gVar = g.a;
        return new KSerializer[]{kSerializer, z, gVar, gVar, z2, z3};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CreateRepositoryInput m22deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = true;
        while (z3) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.x(serialDescriptor, 1, q1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    z = b.p(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.p(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.x(serialDescriptor, 4, q1.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.x(serialDescriptor, 5, q1.a, str4);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new CreateRepositoryInput(i, str, str2, z, z2, str3, str4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CreateRepositoryInput createRepositoryInput) {
        k.g(encoder, "encoder");
        k.g(createRepositoryInput, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        String str = createRepositoryInput.a;
        String str2 = createRepositoryInput.f;
        String str3 = createRepositoryInput.e;
        boolean z = createRepositoryInput.d;
        boolean z2 = createRepositoryInput.c;
        String str4 = createRepositoryInput.b;
        b.J(serialDescriptor, 0, str);
        if (b.X(serialDescriptor) || str4 != null) {
            b.H(serialDescriptor, 1, q1.a, str4);
        }
        if (b.X(serialDescriptor) || !z2) {
            b.C(serialDescriptor, 2, z2);
        }
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 3, z);
        }
        if (b.X(serialDescriptor) || str3 != null) {
            b.H(serialDescriptor, 4, q1.a, str3);
        }
        if (b.X(serialDescriptor) || str2 != null) {
            b.H(serialDescriptor, 5, q1.a, str2);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
