package k81;

import com.google.android.gms.internal.measurement.d5;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class s extends a {
    public KSerializer a;

    public s(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // k81.a
    public void f(j81.a aVar, int i, Object obj) {
        i(i, obj, aVar.A(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        d5 j = encoder.j(descriptor, d);
        Iterator c = c(obj);
        for (int i = 0; i < d; i++) {
            j.I(getDescriptor(), i, this.a, c.next());
        }
        j.L(descriptor);
    }
}
