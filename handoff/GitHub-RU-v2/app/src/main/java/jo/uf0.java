package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uf0 {
    public List a;

    public uf0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf0) && k71.k.b(this.a, ((uf0) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("UpdateMobilePushNotificationSchedules(mobilePushNotificationSchedules=", ")", this.a);
    }
}
