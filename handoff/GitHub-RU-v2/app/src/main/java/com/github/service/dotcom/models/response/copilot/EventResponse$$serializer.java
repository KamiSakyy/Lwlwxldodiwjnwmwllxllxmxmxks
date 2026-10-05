package com.github.service.dotcom.models.response.copilot;

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
import l81.t;
import m71.a;
import w61.c;
import w61.h;
import xn.j3;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class EventResponse$$serializer implements d0 {
    public static final EventResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EventResponse$$serializer eventResponse$$serializer = new EventResponse$$serializer();
        INSTANCE = eventResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.EventResponse", eventResponse$$serializer, 8);
        e1Var.l("id", true);
        e1Var.l("timestamp", true);
        e1Var.l("parentId", true);
        e1Var.l("ephemeral", true);
        e1Var.l("type", true);
        e1Var.l("data", true);
        e1Var.l("dismissed", true);
        e1Var.l("pending", true);
        descriptor = e1Var;
    }

    private EventResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = EventResponse.i;
        q1 q1Var = q1.a;
        g gVar = g.a;
        return new KSerializer[]{q1Var, q1Var, a.z(q1Var), gVar, hVarArr[4].getValue(), a.z(t.a), a.z(gVar), a.z(gVar)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final EventResponse m113deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = EventResponse.i;
        String str = null;
        String str2 = null;
        String str3 = null;
        j3 j3Var = null;
        kotlinx.serialization.json.c cVar = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        boolean z = false;
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
                    str2 = b.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.x(serialDescriptor, 2, q1.a, str3);
                    i |= 4;
                    break;
                case 3:
                    z = b.p(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j3Var = (j3) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), j3Var);
                    i |= 16;
                    break;
                case 5:
                    cVar = (kotlinx.serialization.json.c) b.x(serialDescriptor, 5, t.a, cVar);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) b.x(serialDescriptor, 6, g.a, bool);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) b.x(serialDescriptor, 7, g.a, bool2);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new EventResponse(i, str, str2, str3, z, j3Var, cVar, bool, bool2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, EventResponse eventResponse) {
        k.g(encoder, "encoder");
        k.g(eventResponse, "value");
        Boolean bool = eventResponse.h;
        Boolean bool2 = eventResponse.g;
        kotlinx.serialization.json.c cVar = eventResponse.f;
        j3 j3Var = eventResponse.e;
        boolean z = eventResponse.d;
        String str = eventResponse.c;
        String str2 = eventResponse.b;
        String str3 = eventResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = EventResponse.i;
        if (b.X(serialDescriptor) || !k.b(str3, "")) {
            b.J(serialDescriptor, 0, str3);
        }
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 1, str2);
        }
        if (b.X(serialDescriptor) || str != null) {
            b.H(serialDescriptor, 2, q1.a, str);
        }
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 3, z);
        }
        if (b.X(serialDescriptor) || j3Var != j3.K) {
            b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), j3Var);
        }
        if (b.X(serialDescriptor) || cVar != null) {
            b.H(serialDescriptor, 5, t.a, cVar);
        }
        if (b.X(serialDescriptor) || bool2 != null) {
            b.H(serialDescriptor, 6, g.a, bool2);
        }
        if (b.X(serialDescriptor) || bool != null) {
            b.H(serialDescriptor, 7, g.a, bool);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
