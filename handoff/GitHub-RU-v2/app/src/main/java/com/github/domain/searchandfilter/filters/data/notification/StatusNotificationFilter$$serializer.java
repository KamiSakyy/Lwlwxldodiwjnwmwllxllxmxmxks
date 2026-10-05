package com.github.domain.searchandfilter.filters.data.notification;

import com.github.domain.searchandfilter.filters.data.i;
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
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class StatusNotificationFilter$$serializer implements d0 {
    public static final StatusNotificationFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StatusNotificationFilter$$serializer statusNotificationFilter$$serializer = new StatusNotificationFilter$$serializer();
        INSTANCE = statusNotificationFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter", statusNotificationFilter$$serializer, 4);
        e1Var.l("id", false);
        e1Var.l("queryString", false);
        e1Var.l("status", false);
        e1Var.l("unreadCount", false);
        descriptor = e1Var;
    }

    private StatusNotificationFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = StatusNotificationFilter.w;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, hVarArr[2].getValue(), l0.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final StatusNotificationFilter m68deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = StatusNotificationFilter.w;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        i iVar = null;
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
                iVar = (i) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), iVar);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                i2 = b.m(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new StatusNotificationFilter(i, str, str2, iVar, i2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, StatusNotificationFilter statusNotificationFilter) {
        k.g(encoder, "encoder");
        k.g(statusNotificationFilter, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = StatusNotificationFilter.w;
        b.J(serialDescriptor, 0, statusNotificationFilter.s);
        b.J(serialDescriptor, 1, statusNotificationFilter.t);
        b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), statusNotificationFilter.u);
        b.F(3, statusNotificationFilter.v, serialDescriptor);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
