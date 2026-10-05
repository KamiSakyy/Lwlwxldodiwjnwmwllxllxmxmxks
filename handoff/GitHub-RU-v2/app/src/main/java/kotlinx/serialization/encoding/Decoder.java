package kotlinx.serialization.encoding;

import j81.a;
import k71.k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public interface Decoder {
    byte B();

    short C();

    float D();

    double E();

    a b(SerialDescriptor serialDescriptor);

    boolean c();

    char d();

    int e(SerialDescriptor serialDescriptor);

    int l();

    String n();

    long o();

    boolean s();

    default Object u(KSerializer kSerializer) {
        k.g(kSerializer, "deserializer");
        return kSerializer.deserialize(this);
    }

    Decoder y(SerialDescriptor serialDescriptor);
}
