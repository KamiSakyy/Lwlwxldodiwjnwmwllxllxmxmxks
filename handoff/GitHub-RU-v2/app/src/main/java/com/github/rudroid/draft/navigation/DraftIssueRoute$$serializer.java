package com.github.rudroid.draft.navigation;

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
import w61.c;

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class DraftIssueRoute$$serializer implements d0 {
    public static final int $stable;
    public static final DraftIssueRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DraftIssueRoute$$serializer draftIssueRoute$$serializer = new DraftIssueRoute$$serializer();
        INSTANCE = draftIssueRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.draft.navigation.DraftIssueRoute", draftIssueRoute$$serializer, 3);
        e1Var.l("nodeId", false);
        e1Var.l("selectedViewId", false);
        e1Var.l("viewGroupedByFields", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private DraftIssueRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, SerializableProjectV2FieldList$$serializer.INSTANCE};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final DraftIssueRoute m32deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        String str = null;
        boolean z10 = true;
        int i = 0;
        String str2 = null;
        SerializableProjectV2FieldList serializableProjectV2FieldList = null;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                str = b10.r(serialDescriptor, 0);
                i |= 1;
            } else if (t10 == 1) {
                str2 = b10.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t10 != 2) {
                    throw new UnknownFieldException(t10);
                }
                serializableProjectV2FieldList = (SerializableProjectV2FieldList) b10.A(serialDescriptor, 2, SerializableProjectV2FieldList$$serializer.INSTANCE, serializableProjectV2FieldList);
                i |= 4;
            }
        }
        b10.g(serialDescriptor);
        return new DraftIssueRoute(i, str, str2, serializableProjectV2FieldList);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, DraftIssueRoute draftIssueRoute) {
        k.g(encoder, "encoder");
        k.g(draftIssueRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, draftIssueRoute.f12102r);
        b10.J(serialDescriptor, 1, draftIssueRoute.f12103s);
        b10.I(serialDescriptor, 2, SerializableProjectV2FieldList$$serializer.INSTANCE, draftIssueRoute.f12104t);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
