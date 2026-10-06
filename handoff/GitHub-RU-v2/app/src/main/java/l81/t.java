package l81;

import com.google.android.gms.internal.measurement.i4;
import java.util.Map;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t implements KSerializer {
    public static final t a = new t();
    public static final s b = s.b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        i4.O(decoder);
        return new kotlinx.serialization.json.c((Map) m71.a.c(q1.a, k.a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        k71.k.g(cVar, "value");
        i4.K(encoder);
        m71.a.c(q1.a, k.a).serialize(encoder, cVar);
    }
    public static Object B(Object p1) { return null; }
}
