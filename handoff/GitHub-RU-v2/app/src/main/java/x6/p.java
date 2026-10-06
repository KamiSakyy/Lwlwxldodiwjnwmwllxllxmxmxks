package x6;

import androidx.lifecycle.k1;
import androidx.lifecycle.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class p extends k1 {

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f33882s = new LinkedHashMap();

    @Override // androidx.lifecycle.k1
    public final void O() {
        LinkedHashMap linkedHashMap = this.f33882s;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((t1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        sy.rShadow.m(16);
        sb2.append(sy.c0.q(16, identityHashCode & 4294967295L));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f33882s.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }
}
