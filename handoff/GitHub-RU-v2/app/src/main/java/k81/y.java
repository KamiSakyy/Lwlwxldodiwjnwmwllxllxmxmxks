package k81;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class y extends e1 {
    public i81.j l;
    public w61.p m;

    public y(String str, int i) {
        super(str, null, i);
        this.l = i81.j.e;
        this.m = sy.w.t(new com.github.rudroid.repository.file.f(i, str, this));
    }

    @Override // k81.e1, kotlinx.serialization.descriptors.SerialDescriptor
    public final y9.a e() {
        return this.l;
    }

    @Override // k81.e1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.e() == i81.j.e && this.a.equals(serialDescriptor.a()) && k71.k.b(c1.b(this), c1.b(serialDescriptor));
    }

    @Override // k81.e1
    public final int hashCode() {
        int hashCode = this.a.hashCode();
        a5.g1 g1Var = new a5.g1(this);
        int i = 1;
        while (g1Var.hasNext()) {
            int i2 = i * 31;
            String str = (String) g1Var.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // k81.e1, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i) {
        return ((SerialDescriptor[]) this.m.getValue())[i];
    }

    @Override // k81.e1
    public final String toString() {
        return x61.m.c0(new i81.h(0, this), ", ", this.a.concat("("), ")", 0, (j71.c) null, 56);
    }
}
