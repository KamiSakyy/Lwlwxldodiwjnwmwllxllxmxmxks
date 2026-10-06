package k81;

import com.google.android.gms.internal.measurement.d5;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r1 implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;
    public final KSerializer c;
    public final i81.g d;

    public r1(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        k71.k.g(kSerializer, "aSerializer");
        k71.k.g(kSerializer2, "bSerializer");
        k71.k.g(kSerializer3, "cSerializer");
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
        this.d = y41.t1.m("kotlin.Triple", new SerialDescriptor[0], new h1.r(6, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        i81.g gVar = this.d;
        j81.a b = decoder.b(gVar);
        Object obj = c1.c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int t = b.t(gVar);
            if (t == -1) {
                b.g(gVar);
                if (obj2 == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new w61.q(obj2, obj3, obj4);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (t == 0) {
                obj2 = b.A(gVar, 0, this.a, null);
            } else if (t == 1) {
                obj3 = b.A(gVar, 1, this.b, null);
            } else {
                if (t != 2) {
                    throw new SerializationException(no.a.k("Unexpected index ", t));
                }
                obj4 = b.A(gVar, 2, this.c, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w61.q qVar = (w61.q) obj;
        k71.k.g(qVar, "value");
        i81.g gVar = this.d;
        d5 b = encoder.b(gVar);
        b.I(gVar, 0, this.a, qVar.r);
        b.I(gVar, 1, this.b, qVar.s);
        b.I(gVar, 2, this.c, qVar.t);
        b.L(gVar);
    }
}
