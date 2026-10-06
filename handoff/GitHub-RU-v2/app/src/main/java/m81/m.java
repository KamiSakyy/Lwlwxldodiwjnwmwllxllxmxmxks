package m81;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m extends a {
    public kotlinx.serialization.json.a f;
    public int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l81.c cVar, kotlinx.serialization.json.a aVar) {
        super(cVar, null);
        k71.k.g(cVar, "json");
        this.f = aVar;
        this.g = aVar.r.size();
        this.h = -1;
    }

    @Override // m81.a
    public final kotlinx.serialization.json.b F(String str) {
        k71.k.g(str, "tag");
        return (kotlinx.serialization.json.b) this.f.r.get(Integer.parseInt(str));
    }

    @Override // m81.a
    public final String R(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // m81.a
    public final kotlinx.serialization.json.b T() {
        return this.f;
    }

    @Override // j81.a
    public final int t(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
