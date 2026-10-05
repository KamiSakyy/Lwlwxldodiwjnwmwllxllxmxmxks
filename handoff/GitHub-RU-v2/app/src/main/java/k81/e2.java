package k81;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e2 implements KSerializer {
    public static final e2 b = new e2();
    public final /* synthetic */ z a = new z(w61.a0.a, "kotlin.Unit");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.a.deserialize(decoder);
        return w61.a0.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w61.a0 a0Var = (w61.a0) obj;
        k71.k.g(a0Var, "value");
        this.a.serialize(encoder, a0Var);
    }
}
