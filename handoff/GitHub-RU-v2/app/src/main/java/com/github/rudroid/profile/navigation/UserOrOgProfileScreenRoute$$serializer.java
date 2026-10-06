package com.github.rudroid.profile.navigation;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
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
import w61.c;

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class UserOrOgProfileScreenRoute$$serializer implements d0 {
    public static final int $stable;
    public static final UserOrOgProfileScreenRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UserOrOgProfileScreenRoute$$serializer userOrOgProfileScreenRoute$$serializer = new UserOrOgProfileScreenRoute$$serializer();
        INSTANCE = userOrOgProfileScreenRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.profile.navigation.UserOrOgProfileScreenRoute", userOrOgProfileScreenRoute$$serializer, 2);
        e1Var.l("userOrOrgLogin", false);
        e1Var.l("displayBlockDialog", true);
        descriptor = e1Var;
        $stable = 8;
    }

    private UserOrOgProfileScreenRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a, g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final UserOrOgProfileScreenRoute m48deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        String str = null;
        boolean z10 = true;
        int i = 0;
        boolean z11 = false;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                str = b10.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (t10 != 1) {
                    throw new UnknownFieldException(t10);
                }
                z11 = b10.p(serialDescriptor, 1);
                i |= 2;
            }
        }
        b10.g(serialDescriptor);
        return new UserOrOgProfileScreenRoute(i, str, z11);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, UserOrOgProfileScreenRoute userOrOgProfileScreenRoute) {
        k.g(encoder, "encoder");
        k.g(userOrOgProfileScreenRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        String str = userOrOgProfileScreenRoute.f17332r;
        boolean z10 = userOrOgProfileScreenRoute.f17333s;
        b10.J(serialDescriptor, 0, str);
        if (b10.X(serialDescriptor) || z10) {
            b10.C(serialDescriptor, 1, z10);
        }
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
