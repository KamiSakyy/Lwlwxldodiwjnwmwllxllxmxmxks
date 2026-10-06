package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 {
    public List a;

    public j2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && k71.k.b(this.a, ((j2) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("ApproveDeployments(deployments=", ")", this.a);
    }
}
