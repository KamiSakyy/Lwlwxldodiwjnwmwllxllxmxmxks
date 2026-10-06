package xn;

import com.google.android.gms.internal.measurement.d5;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d4Shadow implements KSerializer {
    public static final d4Shadow a = new d4Shadow();
    public static final l81.n b = d5.q(new q1(1));
    public static final k81.i1 c = y41.t1.b("SteerCommand");

    public final Object deserialize(Decoder decoder) {
        return a4.a;
    }

    public final SerialDescriptor getDescriptor() {
        return c;
    }

    public final void serialize(Encoder encoder, Object obj) {
        String b2;
        c4 c4Var = (c4) obj;
        k71.k.g(c4Var, "value");
        if (c4Var instanceof b4) {
            b2 = ((b4) c4Var).a;
        } else if (c4Var instanceof a4) {
            b2 = "";
        } else {
            b2 = b.b(b91.g.J(k71.xShadow.a(c4Var.getClass())), c4Var);
        }
        encoder.p(b2);
    }
}
