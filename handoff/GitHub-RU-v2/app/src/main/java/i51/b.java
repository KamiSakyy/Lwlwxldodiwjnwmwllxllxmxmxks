package i51;

import java.util.Collections;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public String a;
    public Map b;

    public b(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static b a(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
