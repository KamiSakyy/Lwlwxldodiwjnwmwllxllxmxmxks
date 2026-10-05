package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aa {
    public final Boolean a;

    public aa(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa) && k71.k.b(this.a, ((aa) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "DeleteMobileDeviceToken(success=", ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m0<T1,T2,T3,T4> {
        public m0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class v0<T1,T2,T3,T4> {
        public v0() {
        }
    }
}
