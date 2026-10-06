package com.github.domain.searchandfilter.filters.data.notification;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.g;
import k81.l0;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class CustomNotificationFilter$$serializer implements d0 {
    public static final CustomNotificationFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CustomNotificationFilter$$serializer customNotificationFilter$$serializer = new CustomNotificationFilter$$serializer();
        INSTANCE = customNotificationFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.notification.CustomNotificationFilter", customNotificationFilter$$serializer, 5);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("queryString", false);
        e1Var.l("unreadCount", false);
        e1Var.l("isDefault", false);
        descriptor = e1Var;
    }

    private CustomNotificationFilter$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, l0.a, g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CustomNotificationFilter m66deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = true;
        while (z2) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z2 = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str3 = b.r(serialDescriptor, 2);
                i |= 4;
            } else if (t == 3) {
                i2 = b.m(serialDescriptor, 3);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                z = b.p(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new CustomNotificationFilter(i, i2, str, str2, str3, z);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CustomNotificationFilter customNotificationFilter) {
        k.g(encoder, "encoder");
        k.g(customNotificationFilter, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, customNotificationFilter.s);
        b.J(serialDescriptor, 1, customNotificationFilter.t);
        b.J(serialDescriptor, 2, customNotificationFilter.u);
        b.F(3, customNotificationFilter.v, serialDescriptor);
        b.C(serialDescriptor, 4, customNotificationFilter.w);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
