package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eaShadow {
    public String a;

    public Object ea(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaShadow) && k71.k.b(this.a, ((eaShadow) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteRef(clientMutationId=", this.a, ")");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f {
        public f() {
        }
    }
}
