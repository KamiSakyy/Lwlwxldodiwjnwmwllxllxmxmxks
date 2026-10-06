package k81;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class n0 implements KSerializer {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;

    public n0(KSerializer kSerializer, KSerializer kSerializer2) {
        this.b = kSerializer;
        this.c = kSerializer2;
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract KSerializer c(kotlinx.serialization.json.b bVar);

    public abstract Object d(Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Decoder kVar;
        switch (this.a) {
            case 0:
                Object obj = c1.c;
                KSerializer kSerializer = (KSerializer) this.c;
                KSerializer kSerializer2 = (KSerializer) this.b;
                SerialDescriptor descriptor = getDescriptor();
                j81.a b = decoder.b(descriptor);
                Object obj2 = obj;
                Object obj3 = obj2;
                while (true) {
                    int t = b.t(getDescriptor());
                    if (t == -1) {
                        if (obj2 == obj) {
                            throw new SerializationException("Element 'key' is missing");
                        }
                        if (obj3 == obj) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        Object d = d(obj2, obj3);
                        b.g(descriptor);
                        return d;
                    }
                    if (t == 0) {
                        obj2 = b.A(getDescriptor(), 0, kSerializer2, null);
                    } else {
                        if (t != 1) {
                            throw new SerializationException(no.a.k("Invalid index: ", t));
                        }
                        obj3 = b.A(getDescriptor(), 1, kSerializer, null);
                    }
                }
            default:
                l81.i O = i4.O(decoder);
                kotlinx.serialization.json.b k = O.k();
                KSerializer c = c(k);
                k71.k.e(c, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
                l81.c w = O.w();
                KSerializer kSerializer3 = c;
                w.getClass();
                String str = null;
                if (k instanceof kotlinx.serialization.json.c) {
                    kVar = new m81.l(w, (kotlinx.serialization.json.c) k, str, 12);
                } else if (k instanceof kotlinx.serialization.json.a) {
                    kVar = new m81.m(w, (kotlinx.serialization.json.a) k);
                } else {
                    if (!(k instanceof l81.o) && !k.equals(JsonNull.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = new m81.k(w, (kotlinx.serialization.json.d) k, null);
                }
                return kVar.u(kSerializer3);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return (i81.g) this.c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.a) {
            case 0:
                d5 b = encoder.b(getDescriptor());
                b.I(getDescriptor(), 0, (KSerializer) this.b, a(obj));
                b.I(getDescriptor(), 1, (KSerializer) this.c, b(obj));
                b.L(getDescriptor());
                return;
            default:
                k71.k.g(obj, "value");
                b21.l a = encoder.a();
                k71.e eVar = (k71.e) this.b;
                KSerializer b2 = a.b(eVar, obj);
                if (b2 == null) {
                    KSerializer L = b91.g.L(k71.x.a(obj.getClass()));
                    if (L == null) {
                        k71.e a2 = k71.x.a(obj.getClass());
                        String c = a2.c();
                        if (c == null) {
                            c = String.valueOf(a2);
                        }
                        throw new SerializationException(x.i.g("Class '", c, "' is not registered for polymorphic serialization ", "in the scope of '" + eVar.c() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                    }
                    b2 = L;
                }
                b2.serialize(encoder, obj);
                return;
        }
    }

    public n0(k71.e eVar) {
        this.b = eVar;
        this.c = y41.t1.o("JsonContentPolymorphicSerializer<" + eVar.c() + '>', i81.c.f, new SerialDescriptor[0]);
    }
}
