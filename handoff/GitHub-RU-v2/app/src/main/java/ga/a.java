package ga;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends x61.i {
    public final int a() {
        return 0;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super/*x61.a*/.contains((String) obj);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 0;
    }

    public final Iterator iterator() {
        return x61.q.r;
    }
}
