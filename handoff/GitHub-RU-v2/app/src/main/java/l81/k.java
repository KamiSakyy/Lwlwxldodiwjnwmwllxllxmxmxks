package l81;

import com.google.android.gms.internal.measurement.i4;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import y41.t1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k implements KSerializer {
    public static final k a = new k();
    public static final i81.g b = t1.n("kotlinx.serialization.json.JsonElement", i81.c.f, new SerialDescriptor[0], new jy.b(21));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return i4.O(decoder).k();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
        k71.k.g(bVar, "value");
        i4.K(encoder);
        if (bVar instanceof kotlinx.serialization.json.d) {
            encoder.n(u.a, bVar);
        } else if (bVar instanceof kotlinx.serialization.json.c) {
            encoder.n(t.a, bVar);
        } else {
            if (!(bVar instanceof kotlinx.serialization.json.a)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.n(e.a, bVar);
        }
    }
}
