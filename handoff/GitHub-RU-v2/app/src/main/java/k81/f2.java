package k81;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f2 implements KSerializer {
    public static final f2 a = new f2();
    public static final i1 b = new i1("kotlin.uuid.Uuid", i81.e.m);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String concat;
        String n = decoder.n();
        k71.k.g(n, "uuidString");
        int length = n.length();
        if (length == 32) {
            long b2 = t71.e.b(0, n, 16);
            long b3 = t71.e.b(16, n, 32);
            if (b2 != 0 || b3 != 0) {
                return new u71.a(b2, b3);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (n.length() <= 64) {
                    concat = n;
                } else {
                    String substring = n.substring(0, 64);
                    k71.k.f(substring, "substring(...)");
                    concat = substring.concat("...");
                }
                sb.append(concat);
                sb.append("\" of length ");
                sb.append(n.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long b4 = t71.e.b(0, n, 8);
            t.q.h(n, 8);
            long b5 = t71.e.b(9, n, 13);
            t.q.h(n, 13);
            long b6 = t71.e.b(14, n, 18);
            t.q.h(n, 18);
            long b7 = t71.e.b(19, n, 23);
            t.q.h(n, 23);
            long j = (b5 << 16) | (b4 << 32) | b6;
            long b8 = t71.e.b(24, n, 36) | (b7 << 48);
            if (j != 0 || b8 != 0) {
                return new u71.a(j, b8);
            }
        }
        return u71.a.t;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u71.a aVar = (u71.a) obj;
        k71.k.g(aVar, "value");
        encoder.p(aVar.toString());
    }
}
