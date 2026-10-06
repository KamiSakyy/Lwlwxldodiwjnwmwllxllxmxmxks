package m81;

import java.util.List;
import k81.g0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import x61.x;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n extends l {
    public final kotlinx.serialization.json.c j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l81.c cVar, kotlinx.serialization.json.c cVar2) {
        super(cVar, cVar2, (String) null, 12);
        k71.k.g(cVar, "json");
        this.j = cVar2;
        List F0 = x61.m.F0(cVar2.r.keySet());
        this.k = F0;
        this.l = F0.size() * 2;
        this.m = -1;
    }

    @Override // m81.l, m81.a
    public final kotlinx.serialization.json.b F(String str) {
        k71.k.g(str, "tag");
        if (this.m % 2 != 0) {
            return (kotlinx.serialization.json.b) x.r(str, this.j);
        }
        g0 g0Var = l81.j.a;
        return new l81.o(str, true);
    }

    @Override // m81.l, m81.a
    public final String R(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return (String) this.k.get(i / 2);
    }

    @Override // m81.l, m81.a
    public final kotlinx.serialization.json.b T() {
        return this.j;
    }

    @Override // m81.l
    /* renamed from: Y */
    public final kotlinx.serialization.json.c T_dup() {
        return this.j;
    }

    @Override // m81.l, m81.a, j81.a
    public final void g(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
    }

    @Override // m81.l, j81.a
    public final int t(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
