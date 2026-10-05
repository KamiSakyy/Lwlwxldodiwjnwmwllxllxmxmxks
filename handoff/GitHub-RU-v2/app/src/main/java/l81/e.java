package l81;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e implements KSerializer {
    public static final e a = new e();
    public static final d b = d.b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        i4.O(decoder);
        return new kotlinx.serialization.json.a((List) new k81.d(k.a, 0).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.a aVar = (kotlinx.serialization.json.a) obj;
        k71.k.g(aVar, "value");
        i4.K(encoder);
        k kVar = k.a;
        SerialDescriptor descriptor = kVar.getDescriptor();
        k71.k.g(descriptor, "elementDesc");
        k81.c cVar = new k81.c(descriptor, 1);
        int size = aVar.size();
        d5 j = encoder.j(cVar, size);
        Iterator<kotlinx.serialization.json.b> it = aVar.iterator();
        for (int i = 0; i < size; i++) {
            j.I(cVar, i, kVar, it.next());
        }
        j.L(cVar);
    }
}
