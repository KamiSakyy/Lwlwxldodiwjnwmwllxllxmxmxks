package k81;

import com.google.android.gms.internal.measurement.d5;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class h1Shadow extends s {
    public g1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Object h1(KSerializer kSerializer) {
        super(kSerializer);
        k71.k.g(kSerializer, "primitiveSerializer");
        this.b = new g1(kSerializer.getDescriptor());
    }

    @Override // k81.a
    public final Object a() {
        return (f1Shadow) g(j());
    }

    @Override // k81.a
    public final int b(Object obj) {
        f1Shadow f1Var = (f1Shadow) obj;
        k71.k.g(f1Var, "<this>");
        return f1Var.d();
    }

    @Override // k81.a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // k81.a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // k81.a
    public final Object h(Object obj) {
        f1Shadow f1Var = (f1Shadow) obj;
        k71.k.g(f1Var, "<this>");
        return f1Var.a();
    }

    @Override // k81.s
    public final void i(int i, Object obj, Object obj2) {
        k71.k.g((f1Shadow) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(d5 d5Var, Object obj, int i);

    @Override // k81.s, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        g1 g1Var = this.b;
        d5 j = encoder.j(g1Var, d);
        k(j, obj, d);
        j.L(g1Var);
    }
}
