package com.github.rudroid.draft.navigation;

import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class SerializableProjectV2FieldList$$serializer implements d0 {
    public static final int $stable;
    public static final SerializableProjectV2FieldList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SerializableProjectV2FieldList$$serializer serializableProjectV2FieldList$$serializer = new SerializableProjectV2FieldList$$serializer();
        INSTANCE = serializableProjectV2FieldList$$serializer;
        e1 e1Var = new e1("com.github.rudroid.draft.navigation.SerializableProjectV2FieldList", serializableProjectV2FieldList$$serializer, 1);
        e1Var.l("items", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private SerializableProjectV2FieldList$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SerializableProjectV2FieldList.f12105s[0].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SerializableProjectV2FieldList m33deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        h[] hVarArr = SerializableProjectV2FieldList.f12105s;
        ArrayList arrayList = null;
        boolean z10 = true;
        int i = 0;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else {
                if (t10 != 0) {
                    throw new UnknownFieldException(t10);
                }
                arrayList = (ArrayList) b10.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), arrayList);
                i = 1;
            }
        }
        b10.g(serialDescriptor);
        return new SerializableProjectV2FieldList(i, arrayList);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SerializableProjectV2FieldList serializableProjectV2FieldList) {
        k.g(encoder, "encoder");
        k.g(serializableProjectV2FieldList, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.I(serialDescriptor, 0, (KSerializer) SerializableProjectV2FieldList.f12105s[0].getValue(), serializableProjectV2FieldList.f12106r);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
