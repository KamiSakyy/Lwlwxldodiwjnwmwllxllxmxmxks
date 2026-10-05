package kotlinx.serialization.modules;

import b21.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k71.k;
import kotlinx.serialization.KSerializer;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();

    public static void b(d dVar, r71.b bVar, r71.b bVar2, KSerializer kSerializer) {
        Object obj;
        r71.b bVar3;
        k.g(bVar2, "concreteClass");
        k.g(kSerializer, "concreteSerializer");
        String a = kSerializer.getDescriptor().a();
        HashMap hashMap = dVar.b;
        Object obj2 = hashMap.get(bVar);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(bVar, obj2);
        }
        Map map = (Map) obj2;
        HashMap hashMap2 = dVar.d;
        Object obj3 = hashMap2.get(bVar);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(bVar, obj3);
        }
        Map map2 = (Map) obj3;
        KSerializer kSerializer2 = (KSerializer) map.get(bVar2);
        if (kSerializer2 != null && !kSerializer2.equals(kSerializer)) {
            String str = "Serializer for " + bVar2 + " already registered in the scope of " + bVar;
            k.g(str, "msg");
            throw new SerializerAlreadyRegisteredException(str);
        }
        KSerializer kSerializer3 = (KSerializer) map2.get(a);
        if (kSerializer3 == null || kSerializer3.equals(kSerializer)) {
            map.put(bVar2, kSerializer);
            map2.put(a, kSerializer);
            return;
        }
        Iterator it = ((Iterable) m.K(map.entrySet()).b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map.Entry) obj).getValue() == kSerializer3) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (bVar3 = (r71.b) entry.getKey()) == null) {
            throw new IllegalStateException(("Name " + a + " is registered in the module but no Kotlin class is associated with it.").toString());
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + bVar + "' have the same serial name '" + a + "': " + kSerializer + " for '" + bVar2 + "' and " + kSerializer3 + " for '" + bVar3 + '\'');
    }

    public final l a() {
        return new l(this.a, this.b, this.c, this.d, this.e, false);
    }
}
