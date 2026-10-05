package bm;

import java.util.ArrayList;
import java.util.List;
import k81.i1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements KSerializer {
    public static final n a = new n();
    public static final i1 b = t1.b("com.github.rudroid.serialization.FilterListSerializer");
    public static final fk.g c = new fk.g();
    public static final fk.c d = new fk.c();

    public final Object deserialize(Decoder decoder) {
        String n = decoder.n();
        d.getClass();
        ArrayList a2 = fk.c.a(n);
        return a2 == null ? x61.r.r : a2;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        List list = (List) obj;
        k71.k.g(list, "value");
        c.getClass();
        encoder.p(fk.g.a(list));
    }
}
