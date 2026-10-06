package com.github.rudroid.home.navigation;

import com.google.android.gms.internal.measurement.d5;
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

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class FavoritesRoute$$serializer implements d0 {
    public static final int $stable;
    public static final FavoritesRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FavoritesRoute$$serializer favoritesRoute$$serializer = new FavoritesRoute$$serializer();
        INSTANCE = favoritesRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.home.navigation.FavoritesRoute", favoritesRoute$$serializer, 1);
        e1Var.l("selectedRepositories", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private FavoritesRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SerializableSimpleRepositoryList$$serializer.INSTANCE};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final FavoritesRoute m35deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        SerializableSimpleRepositoryList serializableSimpleRepositoryList = null;
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
                serializableSimpleRepositoryList = (SerializableSimpleRepositoryList) b10.A(serialDescriptor, 0, SerializableSimpleRepositoryList$$serializer.INSTANCE, serializableSimpleRepositoryList);
                i = 1;
            }
        }
        b10.g(serialDescriptor);
        return new FavoritesRoute(i, serializableSimpleRepositoryList);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, FavoritesRoute favoritesRoute) {
        k.g(encoder, "encoder");
        k.g(favoritesRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.I(serialDescriptor, 0, SerializableSimpleRepositoryList$$serializer.INSTANCE, favoritesRoute.f14994r);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
