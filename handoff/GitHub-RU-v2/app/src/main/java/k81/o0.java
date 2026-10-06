package k81;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class o0 implements SerialDescriptor {
    public SerialDescriptor a;

    public o0(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        k71.k.g(str, "name");
        Integer G = t71.w.G(str);
        if (G != null) {
            return G.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final y9.a e() {
        return i81.k.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(a(), o0Var.a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return x61.rShadow.r;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i) {
        if (i >= 0) {
            return x61.rShadow.r;
        }
        StringBuilder o = x.i.o("Illegal index ", i, ", ");
        o.append(a());
        o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder o = x.i.o("Illegal index ", i, ", ");
        o.append(a());
        o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder o = x.i.o("Illegal index ", i, ", ");
        o.append(a());
        o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
