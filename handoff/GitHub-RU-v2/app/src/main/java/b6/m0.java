package b6;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3630a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3631b;

    public m0(Map map, Map map2) {
        this.f3630a = map;
        this.f3631b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.f3630a, m0Var.f3630a) && k71.k.b(this.f3631b, m0Var.f3631b);
    }

    public final int hashCode() {
        return this.f3631b.hashCode() + (this.f3630a.hashCode() * 31);
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.f3630a + ", providerNameToReceivers=" + this.f3631b + ')';
    }
}
