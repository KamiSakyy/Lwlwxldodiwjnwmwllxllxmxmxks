package k81;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u0 extends n0 {
    public final /* synthetic */ int d;
    public final i81.g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(final KSerializer kSerializer, final KSerializer kSerializer2, int i) {
        super(kSerializer, kSerializer2);
        this.d = i;
        switch (i) {
            case 1:
                k71.k.g(kSerializer, "keySerializer");
                k71.k.g(kSerializer2, "valueSerializer");
                super(kSerializer, kSerializer2);
                final int i2 = 1;
                this.e = y41.t1.m("kotlin.Pair", new SerialDescriptor[0], new j71.c() { // from class: k81.s0
                    public final Object k(Object obj) {
                        i81.a aVar = (i81.a) obj;
                        switch (i2) {
                            case 0:
                                k71.k.g(aVar, "$this$buildSerialDescriptor");
                                i81.a.a(aVar, "key", kSerializer.getDescriptor());
                                i81.a.a(aVar, "value", kSerializer2.getDescriptor());
                                break;
                            default:
                                k71.k.g(aVar, "$this$buildClassSerialDescriptor");
                                i81.a.a(aVar, "first", kSerializer.getDescriptor());
                                i81.a.a(aVar, "second", kSerializer2.getDescriptor());
                                break;
                        }
                        return w61.a0.a;
                    }
                });
                break;
            default:
                k71.k.g(kSerializer, "keySerializer");
                k71.k.g(kSerializer2, "valueSerializer");
                final int i3 = 0;
                this.e = y41.t1.n("kotlin.collections.Map.Entry", i81.k.g, new SerialDescriptor[0], new j71.c() { // from class: k81.s0
                    public final Object k(Object obj) {
                        i81.a aVar = (i81.a) obj;
                        switch (i3) {
                            case 0:
                                k71.k.g(aVar, "$this$buildSerialDescriptor");
                                i81.a.a(aVar, "key", kSerializer.getDescriptor());
                                i81.a.a(aVar, "value", kSerializer2.getDescriptor());
                                break;
                            default:
                                k71.k.g(aVar, "$this$buildClassSerialDescriptor");
                                i81.a.a(aVar, "first", kSerializer.getDescriptor());
                                i81.a.a(aVar, "second", kSerializer2.getDescriptor());
                                break;
                        }
                        return w61.a0.a;
                    }
                });
                break;
        }
    }

    @Override // k81.n0
    public final Object a(Object obj) {
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                k71.k.g(entry, "<this>");
                return entry.getKey();
            default:
                w61.k kVar = (w61.k) obj;
                k71.k.g(kVar, "<this>");
                return kVar.r;
        }
    }

    @Override // k81.n0
    public final Object b(Object obj) {
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                k71.k.g(entry, "<this>");
                return entry.getValue();
            default:
                w61.k kVar = (w61.k) obj;
                k71.k.g(kVar, "<this>");
                return kVar.s;
        }
    }

    @Override // k81.n0
    public final Object d(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return new t0(obj, obj2);
            default:
                return new w61.k(obj, obj2);
        }
    }

    @Override // k81.n0, kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.d) {
        }
        return this.e;
    }
}
