package w11;

import android.util.SparseArray;
import j11.d;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(d.r, 0);
        hashMap.put(d.s, 1);
        hashMap.put(d.t, 2);
        for (d dVar : hashMap.keySet()) {
            a.append(((Integer) b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = (d) a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(no.a.k("Unknown Priority for value ", i));
    }
}
