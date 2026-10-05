package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c30 {
    public final String a;

    public c30(String str) {
        k71.k.g(str, "id");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c30) && k71.k.b(this.a, ((c30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }






















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h<T1,T2,T3,T4> {
        public h() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j<T1,T2,T3,T4> {
        public j() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class y<T1,T2,T3,T4> {
        public y() {
        }
    }
}
