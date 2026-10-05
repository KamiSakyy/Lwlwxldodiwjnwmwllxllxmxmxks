package x61;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p extends o {
    public static void H(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void I(List list, Comparator comparator) {
        k71.k.g(list, "<this>");
        k71.k.g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
