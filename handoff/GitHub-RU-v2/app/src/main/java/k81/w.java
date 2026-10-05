package k81;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class w implements KSerializer {
    public static final w a = new w();
    public static final i1 b = new i1("kotlin.time.Duration", i81.e.m);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i = kotlin.time.a.u;
        String n = decoder.n();
        k71.k.g(n, "value");
        try {
            return new kotlin.time.a(kotlin.time.e.a(n));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(f1.e.z("Invalid ISO duration string format: '", n, "'."), e);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((kotlin.time.a) obj).r;
        int i = kotlin.time.a.u;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long j2 = j < 0 ? kotlin.time.a.j(j) : j;
        long h = kotlin.time.a.h(j2, kotlin.time.c.w);
        boolean z = false;
        int h2 = kotlin.time.a.f(j2) ? 0 : (int) (kotlin.time.a.h(j2, kotlin.time.c.v) % 60);
        int h3 = kotlin.time.a.f(j2) ? 0 : (int) (kotlin.time.a.h(j2, kotlin.time.c.u) % 60);
        int e = kotlin.time.a.e(j2);
        if (kotlin.time.a.f(j)) {
            h = 9999999999999L;
        }
        boolean z2 = h != 0;
        boolean z3 = (h3 == 0 && e == 0) ? false : true;
        if (h2 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(h);
            sb.append('H');
        }
        if (z) {
            sb.append(h2);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            kotlin.time.a.b(sb, h3, e, 9, "S", true);
        }
        encoder.p(sb.toString());
    }
}
