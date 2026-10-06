package k50;

import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public List a;

    public g(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && k71.k.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return m0.h("Options(nodes=", ")", this.a);
    }
}
