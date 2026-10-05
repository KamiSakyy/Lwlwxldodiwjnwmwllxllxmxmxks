package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xa {
    public final List a;

    public xa(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa) && k71.k.b(this.a, ((xa) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("PendingDeploymentRequests(nodes=", ")", this.a);
    }
}
