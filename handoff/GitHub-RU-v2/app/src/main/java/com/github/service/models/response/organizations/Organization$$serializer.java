package com.github.service.models.response.organizations;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.Avatar$$serializer;
import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1Shadow;
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
public final /* synthetic */ class Organization$$serializer implements d0 {
    public static final Organization$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Organization$$serializer organization$$serializer = new Organization$$serializer();
        INSTANCE = organization$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.organizations.Organization", organization$$serializer, 6);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("login", false);
        e1Var.l("descriptionHtml", false);
        e1Var.l("avatar", false);
        e1Var.l("viewerIsFollowing", false);
        descriptor = e1Var;
    }

    private Organization$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        return new KSerializer[]{kSerializer, a.z(kSerializer), kSerializer, a.z(kSerializer), Avatar$$serializer.INSTANCE, g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final Organization m11deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Avatar avatar = null;
        boolean z2 = true;
        while (z2) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z2 = false;
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
                    str3 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.x(serialDescriptor, 3, q1.a, str4);
                    i |= 8;
                    break;
                case 4:
                    avatar = (Avatar) b.A(serialDescriptor, 4, Avatar$$serializer.INSTANCE, avatar);
                    i |= 16;
                    break;
                case 5:
                    z = b.p(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new Organization(i, str, str2, str3, str4, avatar, z);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Organization organization) {
        k.g(encoder, "encoder");
        k.g(organization, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, organization.r);
        q1 q1Var = q1.a;
        b.H(serialDescriptor, 1, q1Var, organization.s);
        b.J(serialDescriptor, 2, organization.t);
        b.H(serialDescriptor, 3, q1Var, organization.u);
        b.I(serialDescriptor, 4, Avatar$$serializer.INSTANCE, organization.v);
        b.C(serialDescriptor, 5, organization.w);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
