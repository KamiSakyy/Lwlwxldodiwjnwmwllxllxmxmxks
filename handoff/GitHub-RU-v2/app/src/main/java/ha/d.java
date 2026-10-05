package ha;

import java.util.LinkedHashMap;
import java.util.Map;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f f25577a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25578b;

    public d(f fVar) {
        k.g(fVar, "record");
        this.f25577a = fVar;
        System.currentTimeMillis();
        LinkedHashMap linkedHashMap = fVar.f25584u;
        int size = linkedHashMap != null ? linkedHashMap.size() * 8 : 0;
        int length = i91.b.c(fVar.f25581r).length + 16;
        for (Map.Entry entry : fVar.f25582s.entrySet()) {
            String str = (String) entry.getKey();
            length += b41.b.X(entry.getValue()) + i91.b.c(str).length;
        }
        this.f25578b = length + size + 8;
    }
}
