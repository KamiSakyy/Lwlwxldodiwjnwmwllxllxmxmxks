package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2924a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f2924a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((k1) it.next()).L();
        }
        linkedHashMap.clear();
    }
}
