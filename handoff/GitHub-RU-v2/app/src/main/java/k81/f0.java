package k81;

import com.google.android.gms.internal.measurement.d5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f0 extends a {
    public final KSerializer a;
    public final KSerializer b;
    public final /* synthetic */ int c;
    public final e0 d;

    public f0(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    @Override // k81.a
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // k81.a
    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                k71.k.g(hashMap, "<this>");
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                k71.k.g(linkedHashMap, "<this>");
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // k81.a
    public final Iterator c(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                k71.k.g(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                k71.k.g(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // k81.a
    public final int d(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                k71.k.g(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                k71.k.g(map2, "<this>");
                return map2.size();
        }
    }

    @Override // k81.a
    public final void f(j81.a aVar, int i, Object obj) {
        Map map = (Map) obj;
        k71.k.g(map, "builder");
        Object A = aVar.A(getDescriptor(), i, this.a, null);
        int t = aVar.t(getDescriptor());
        if (t != i + 1) {
            throw new IllegalArgumentException(no.a.j(i, t, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean containsKey = map.containsKey(A);
        KSerializer kSerializer = this.b;
        map.put(A, (!containsKey || (kSerializer.getDescriptor().e() instanceof i81.f)) ? aVar.A(getDescriptor(), t, kSerializer, null) : aVar.A(getDescriptor(), t, kSerializer, x61.x.r(A, map)));
    }

    @Override // k81.a
    public final Object g(Object obj) {
        switch (this.c) {
            case 0:
                k71.k.g((Object) null, "<this>");
                return new HashMap((Map) null);
            default:
                k71.k.g((Object) null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.c) {
        }
        return this.d;
    }

    @Override // k81.a
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                k71.k.g(hashMap, "<this>");
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                k71.k.g(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        d5 j = encoder.j(descriptor, d);
        Iterator c = c(obj);
        int i = 0;
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            j.I(getDescriptor(), i, this.a, key);
            i += 2;
            j.I(getDescriptor(), i2, this.b, value);
        }
        j.L(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.c = i;
        switch (i) {
            case 1:
                k71.k.g(kSerializer, "kSerializer");
                k71.k.g(kSerializer2, "vSerializer");
                this(kSerializer, kSerializer2, (byte) 0);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                k71.k.g(descriptor, "keyDesc");
                k71.k.g(descriptor2, "valueDesc");
                this.d = new e0("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                k71.k.g(kSerializer, "kSerializer");
                k71.k.g(kSerializer2, "vSerializer");
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
                k71.k.g(descriptor3, "keyDesc");
                k71.k.g(descriptor4, "valueDesc");
                this.d = new e0("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }



}
