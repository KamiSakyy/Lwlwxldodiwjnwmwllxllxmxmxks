package l81;

import com.google.android.gms.internal.measurement.i4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;
import y41.t1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r implements KSerializer {
    public static final r a = new r();
    public static final i81.g b = t1.o("kotlinx.serialization.json.JsonNull", i81.j.e, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        i4.O(decoder);
        if (decoder.s()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k71.k.g((JsonNull) obj, "value");
        i4.K(encoder);
        encoder.c();
    }
}
