package m81;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k extends a {
    public kotlinx.serialization.json.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l81.c cVar, kotlinx.serialization.json.b bVar, String str) {
        super(cVar, str);
        k71.k.g(cVar, "json");
        k71.k.g(bVar, "value");
        this.f = bVar;
        this.a.add("primitive");
    }

    @Override // m81.a
    public final kotlinx.serialization.json.b F(String str) {
        k71.k.g(str, "tag");
        if (str == "primitive") {
            return this.f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // m81.a
    public final kotlinx.serialization.json.b T() {
        return this.f;
    }

    @Override // j81.a
    public final int t(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        return 0;
    }
}
