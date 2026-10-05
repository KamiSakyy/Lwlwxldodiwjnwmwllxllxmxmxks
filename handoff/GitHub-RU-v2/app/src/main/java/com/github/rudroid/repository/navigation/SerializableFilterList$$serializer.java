package com.github.rudroid.repository.navigation;

import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import k71.k;
import k81.c1;
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
public final /* synthetic */ class SerializableFilterList$$serializer implements d0 {
    public static final int $stable;
    public static final SerializableFilterList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SerializableFilterList$$serializer serializableFilterList$$serializer = new SerializableFilterList$$serializer();
        INSTANCE = serializableFilterList$$serializer;
        e1 e1Var = new e1("com.github.rudroid.repository.navigation.SerializableFilterList", serializableFilterList$$serializer, 1);
        e1Var.l("filters", true);
        descriptor = e1Var;
        $stable = 8;
    }

    private SerializableFilterList$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SerializableFilterList.f20039s[0].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SerializableFilterList m75deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        h[] hVarArr = SerializableFilterList.f20039s;
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
        return new SerializableFilterList(i, arrayList);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SerializableFilterList serializableFilterList) {
        k.g(encoder, "encoder");
        k.g(serializableFilterList, "value");
        ArrayList arrayList = serializableFilterList.f20040r;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        h[] hVarArr = SerializableFilterList.f20039s;
        if (b10.X(serialDescriptor) || !k.b(arrayList, new ArrayList())) {
            b10.I(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), arrayList);
        }
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
