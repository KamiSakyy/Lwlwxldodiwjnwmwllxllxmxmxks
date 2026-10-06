package ea0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 {
    public List a;

    public o1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1) && k71.k.b(this.a, ((o1) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("SocialAccounts(nodes=", ")", this.a);
    }
}
