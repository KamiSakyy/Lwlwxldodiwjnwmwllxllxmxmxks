package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public static void a(List list, List list2) {
        Charset charset = e0.f2705a;
        if (list instanceof v0) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size = list2.size();
        for (Object obj : list) {
            if (obj == null) {
                String str = "Element at index " + (list2.size() - size) + " is null.";
                for (int size2 = list2.size() - 1; size2 >= size; size2--) {
                    list2.remove(size2);
                }
                throw new NullPointerException(str);
            }
            list2.add(obj);
        }
    }

    public abstract int b(z0 z0Var);
}
