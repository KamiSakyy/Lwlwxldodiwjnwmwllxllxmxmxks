package k81;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class z implements KSerializer {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public Object d;

    public z(Object obj, String str) {
        k71.k.g(obj, "objectInstance");
        this.b = obj;
        this.c = x61.rShadow.r;
        this.d = sy.w.s(w61.i.r, new d1.i1(24, str, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        switch (this.a) {
            case 0:
                Enum[] enumArr = (Enum[]) this.b;
                int e = decoder.e(getDescriptor());
                if (e >= 0 && e < enumArr.length) {
                    return enumArr[e];
                }
                throw new SerializationException(e + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
            default:
                SerialDescriptor descriptor = getDescriptor();
                j81.a b = decoder.b(descriptor);
                int t = b.t(getDescriptor());
                if (t != -1) {
                    throw new SerializationException(no.a.k("Unexpected index ", t));
                }
                b.g(descriptor);
                return this.b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, w61.h] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.a) {
            case 0:
                return (SerialDescriptor) ((w61.p) this.d).getValue();
            default:
                return (SerialDescriptor) this.d.getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.a) {
            case 0:
                Enum r5 = (Enum) obj;
                k71.k.g(r5, "value");
                Enum[] enumArr = (Enum[]) this.b;
                int Q = x61.l.Q(enumArr, r5);
                if (Q != -1) {
                    encoder.k(getDescriptor(), Q);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                sb.append(" is not a valid enum ");
                sb.append(getDescriptor().a());
                sb.append(", must be one of ");
                String arrays = Arrays.toString(enumArr);
                k71.k.f(arrays, "toString(...)");
                sb.append(arrays);
                throw new SerializationException(sb.toString());
            default:
                k71.k.g(obj, "value");
                encoder.b(getDescriptor()).L(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        k71.k.g(obj, "objectInstance");
        this.c = x61.l.r(annotationArr);
    }

    public z(String str, Enum[] enumArr) {
        k71.k.g(enumArr, "values");
        this.b = enumArr;
        this.d = sy.w.t(new d1.i1(23, this, str));
    }
    public z(String p1, Object p2) {
    }
}
