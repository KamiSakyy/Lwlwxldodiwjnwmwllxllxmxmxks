package c10;

import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final List a;

    public c(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return m0.h("Commits(nodes=", ")", this.a);
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
