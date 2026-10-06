package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aaShadow implements aaShadow.v0 {
    final ba a;

    public Object aa(ba baVar) {
        this.a = baVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aaShadow) && k71.k.b(this.a, ((aaShadow) obj).a);
    }

    public final int hashCode() {
        ba baVar = this.a;
        if (baVar == null) {
            return 0;
        }
        return baVar.hashCode();
    }

    public final String toString() {
        return "Data(discussionCategory=" + this.a + ")";
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class v0 {
        public v0() {
        }
    }
}
