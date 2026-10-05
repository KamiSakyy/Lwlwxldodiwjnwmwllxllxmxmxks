package l81;

import com.google.android.gms.internal.measurement.i4;
import k71.x;
import k81.a2;
import k81.i1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import t71.w;
import w61.v;
import y41.t1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p implements KSerializer {
    public static final p a = new p();
    public static final i1 b = t1.b("kotlinx.serialization.json.JsonLiteral");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.json.b k = i4.O(decoder).k();
        if (k instanceof o) {
            return (o) k;
        }
        throw m81.i.d(-1, k.toString(), "Unexpected JSON element, expected JsonLiteral, had " + x.a(k.getClass()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o oVar = (o) obj;
        k71.k.g(oVar, "value");
        String str = oVar.s;
        i4.K(encoder);
        if (oVar.r) {
            encoder.p(str);
            return;
        }
        Long H = w.H(str);
        if (H != null) {
            encoder.o(H.longValue());
            return;
        }
        v E = sy.w.E(str);
        if (E != null) {
            encoder.m(a2.b).o(E.r);
            return;
        }
        Double u = t71.v.u(str);
        if (u != null) {
            encoder.d(u.doubleValue());
            return;
        }
        Boolean s0 = t71.p.s0(str);
        if (s0 != null) {
            encoder.g(s0.booleanValue());
        } else {
            encoder.p(str);
        }
    }
}
