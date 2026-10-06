package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y8 {
    public final List a;

    public y8(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8) && k71.k.b(this.a, ((y8) obj).a);
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
