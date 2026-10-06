package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oq {
    public boolean a;

    public oq(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq) && this.a == ((oq) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("Signature(isValid=", ")", this.a);
    }
}
