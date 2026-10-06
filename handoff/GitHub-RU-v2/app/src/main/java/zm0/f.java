package zm0;

import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public List a;

    public f(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k71.k.b(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return m0.h("MatchingPullRequests(nodes=", ")", this.a);
    }
}
