package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qs {
    public boolean a;

    public qs(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs) && this.a == ((qs) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("Signature(isValid=", ")", this.a);
    }
}
