package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wo {
    public List a;

    public wo(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo) && k71.k.b(this.a, ((wo) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("MobilePushNotificationSchedules(nodes=", ")", this.a);
    }
}
