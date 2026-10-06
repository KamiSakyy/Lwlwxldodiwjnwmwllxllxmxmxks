package k81;

import com.google.android.gms.internal.measurement.d5;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b implements KSerializer {
    public KSerializer a(j81.a aVar, String str) {
        b21.l a = aVar.a();
        r71.b c = c();
        a.getClass();
        k71.k.g(c, "baseClass");
        Map map = (Map) ((Map) a.v).get(c);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = ((Map) a.w).get(c);
        j71.c cVar = k71.z.e(1, obj) ? (j71.c) obj : null;
        if (cVar != null) {
            return (KSerializer) cVar.k(str);
        }
        return null;
    }

    public KSerializer b(Encoder encoder, Object obj) {
        k71.k.g(obj, "value");
        return encoder.a().b(c(), obj);
    }

    public abstract r71.b c();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        j81.a b = decoder.b(descriptor);
        Object obj = null;
        String str = null;
        while (true) {
            int t = b.t(getDescriptor());
            if (t == -1) {
                if (obj == null) {
                    throw new IllegalArgumentException(f1.e.g("Polymorphic value has not been read for class ", str).toString());
                }
                b.g(descriptor);
                return obj;
            }
            if (t == 0) {
                str = b.r(getDescriptor(), t);
            } else {
                if (t != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(tShadow);
                    throw new SerializationException(sb.toString());
                }
                if (str == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                obj = b.A(getDescriptor(), t, b41.b.r(this, b, str), null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k71.k.g(obj, "value");
        KSerializer s = b41.b.s(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        d5 b = encoder.b(descriptor);
        b.J(getDescriptor(), 0, s.getDescriptor().a());
        b.I(getDescriptor(), 1, s, obj);
        b.L(descriptor);
    }
}
