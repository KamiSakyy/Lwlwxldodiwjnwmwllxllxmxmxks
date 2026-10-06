package k81;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class z0 implements KSerializer {
    public KSerializer a;
    public l1 b;

    public z0(KSerializer kSerializer) {
        k71.k.g(kSerializer, "serializer");
        this.a = kSerializer;
        this.b = new l1(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.s()) {
            return decoder.u(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z0.class == obj.getClass() && k71.k.b(this.a, ((z0) obj).a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            encoder.n(this.a, obj);
        } else {
            encoder.c();
        }
    }
}
