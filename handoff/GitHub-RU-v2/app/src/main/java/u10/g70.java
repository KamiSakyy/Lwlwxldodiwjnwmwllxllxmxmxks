package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g70 {
    public final List a;

    public g70(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g70) && k71.k.b(this.a, ((g70) obj).a);
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








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }
}
