package c21;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public static final m b = new m(null);
    public final String a;

    public /* synthetic */ m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return u.j(this.a, ((m) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
    public Object s = null;
    public Object t = null;
}
