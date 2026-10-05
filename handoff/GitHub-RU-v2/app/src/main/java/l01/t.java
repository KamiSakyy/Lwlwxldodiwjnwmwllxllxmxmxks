package l01;

import java.time.LocalDate;
import k81.i1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import y41.t1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements KSerializer {
    public static final t a = new t();
    public static final i1 b = t1.b("LocalDate");

    public final Object deserialize(Decoder decoder) {
        LocalDate parse = LocalDate.parse(decoder.n());
        k71.k.f(parse, "parse(...)");
        return parse;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        LocalDate localDate = (LocalDate) obj;
        k71.k.g(localDate, "value");
        String localDate2 = localDate.toString();
        k71.k.f(localDate2, "toString(...)");
        encoder.p(localDate2);
    }
}
