package g81;

import d1.i1;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import sy.w;
import w61.i;
import w61.k;
import x61.l;
import x61.r;
import x61.x;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends k81.b {
    public final k71.e a;
    public final List b;
    public final Object c;
    public final Map d;
    public final LinkedHashMap e;

    public d(String str, k71.e eVar, r71.b[] bVarArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this.a = eVar;
        this.b = r.r;
        this.c = w.s(i.r, new i1(12, str, this));
        if (bVarArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + eVar.c() + " should be marked @Serializable");
        }
        int min = Math.min(bVarArr.length, kSerializerArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new k(bVarArr[i], kSerializerArr[i]));
        }
        Map A = x.A(arrayList);
        this.d = A;
        Set<Map.Entry> entrySet = A.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            String a = ((KSerializer) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(a);
            if (obj == null) {
                linkedHashMap.containsKey(a);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.a + "' have the same serial name '" + a + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(a, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.s(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        this.b = l.r(annotationArr);
    }

    @Override // k81.b
    public final KSerializer a(j81.a aVar, String str) {
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : super.a(aVar, str);
    }

    @Override // k81.b
    public final KSerializer b(Encoder encoder, Object obj) {
        k71.k.g(obj, "value");
        KSerializer kSerializer = (KSerializer) this.d.get(k71.x.a(obj.getClass()));
        KSerializer b = kSerializer != null ? kSerializer : super.b(encoder, obj);
        if (b != null) {
            return b;
        }
        return null;
    }

    @Override // k81.b
    public final r71.b c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }
}
