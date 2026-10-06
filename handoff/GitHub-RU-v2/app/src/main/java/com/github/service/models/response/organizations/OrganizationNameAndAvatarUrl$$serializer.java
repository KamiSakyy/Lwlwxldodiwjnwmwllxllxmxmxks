package com.github.service.models.response.organizations;

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
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class OrganizationNameAndAvatarUrl$$serializer implements d0 {
    public static final OrganizationNameAndAvatarUrl$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrganizationNameAndAvatarUrl$$serializer organizationNameAndAvatarUrl$$serializer = new OrganizationNameAndAvatarUrl$$serializer();
        INSTANCE = organizationNameAndAvatarUrl$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl", organizationNameAndAvatarUrl$$serializer, 3);
        e1Var.l("login", false);
        e1Var.l("name", false);
        e1Var.l("avatarUrl", false);
        descriptor = e1Var;
    }

    private OrganizationNameAndAvatarUrl$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        return new KSerializer[]{kSerializer, a.z(kSerializer), a.z(kSerializer)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final OrganizationNameAndAvatarUrl m12deserialize(Decoder decoder) {
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
        return new OrganizationNameAndAvatarUrl(i, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl) {
        k.g(encoder, "encoder");
        k.g(organizationNameAndAvatarUrl, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, organizationNameAndAvatarUrl.r);
        q1 q1Var = q1.a;
        b.H(serialDescriptor, 1, q1Var, organizationNameAndAvatarUrl.s);
        b.H(serialDescriptor, 2, q1Var, organizationNameAndAvatarUrl.t);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
