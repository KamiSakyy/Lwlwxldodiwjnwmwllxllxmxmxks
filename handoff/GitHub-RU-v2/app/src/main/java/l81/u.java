package l81;

import com.google.android.gms.internal.measurement.i4;
import k71.xShadow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import y41.t1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u implements KSerializer {
    public static final u a = new u();
    public static final i81.g b = t1.o("kotlinx.serialization.json.JsonPrimitive", i81.e.m, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.json.b k = i4.O(decoder).k();
        if (k instanceof kotlinx.serialization.json.d) {
            return (kotlinx.serialization.json.d) k;
        }
        throw m81.i.d(-1, k.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + xShadow.a(k.getClass()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) obj;
        k71.k.g(dVar, "value");
        i4.K(encoder);
        if (dVar instanceof JsonNull) {
            encoder.n(r.a, JsonNull.INSTANCE);
        } else {
            encoder.n(p.a, (o) dVar);
        }
    }
}
