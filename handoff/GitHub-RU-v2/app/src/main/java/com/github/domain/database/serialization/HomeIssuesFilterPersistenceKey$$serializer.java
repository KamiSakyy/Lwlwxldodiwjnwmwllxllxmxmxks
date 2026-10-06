package com.github.domain.database.serialization;

import com.github.domain.database.serialization.HomeIssuesFilterPersistenceKey;
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

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class HomeIssuesFilterPersistenceKey$$serializer implements d0 {
    public static final HomeIssuesFilterPersistenceKey$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HomeIssuesFilterPersistenceKey$$serializer homeIssuesFilterPersistenceKey$$serializer = new HomeIssuesFilterPersistenceKey$$serializer();
        INSTANCE = homeIssuesFilterPersistenceKey$$serializer;
        e1 e1Var = new e1("Home_Issues", homeIssuesFilterPersistenceKey$$serializer, 1);
        e1Var.l("key", false);
        descriptor = e1Var;
    }

    private HomeIssuesFilterPersistenceKey$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final HomeIssuesFilterPersistenceKey m3deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else {
                if (t != 0) {
                    throw new UnknownFieldException(t);
                }
                str = b.r(serialDescriptor, 0);
                i = 1;
            }
        }
        b.g(serialDescriptor);
        if (1 == i) {
            return new HomeIssuesFilterPersistenceKey(str);
        }
        c1Shadow.l(i, 1, INSTANCE.getDescriptor());
        throw null;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, HomeIssuesFilterPersistenceKey homeIssuesFilterPersistenceKey) {
        k.g(encoder, "encoder");
        k.g(homeIssuesFilterPersistenceKey, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        HomeIssuesFilterPersistenceKey.Companion companion = HomeIssuesFilterPersistenceKey.Companion;
        b.J(serialDescriptor, 0, homeIssuesFilterPersistenceKey.r);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
