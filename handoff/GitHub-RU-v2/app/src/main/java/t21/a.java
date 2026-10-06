package t21;

import c21.uShadow;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static final a a = new a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && uShadow.j(null, null) && uShadow.j(null, null) && uShadow.j(null, null) && uShadow.j(null, null) && uShadow.j(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }
}
