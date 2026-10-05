package t6;

import java.util.LinkedHashMap;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends c {
    public d(c cVar) {
        k.g(cVar, "initialExtras");
        LinkedHashMap linkedHashMap = cVar.f32100a;
        k.g(linkedHashMap, "initialExtras");
        this.f32100a.putAll(linkedHashMap);
    }

    @Override // t6.c
    public final Object a(b bVar) {
        return this.f32100a.get(bVar);
    }

    public /* synthetic */ d(int i) {
        this(a.f32099b);
    }
}
