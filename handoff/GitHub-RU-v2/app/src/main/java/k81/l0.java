package k81;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class l0 implements KSerializer {
    public static final l0 a = new l0();
    public static final i1 b = new i1("kotlin.Int", i81.e.j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.l());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.l(((Number) obj).intValue());
    }
    public Object x(Object p1) { return null; }
}
