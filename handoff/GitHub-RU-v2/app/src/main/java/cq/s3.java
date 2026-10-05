package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s3 {
    public final int a;

    public s3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3) && this.a == ((s3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Followers(totalCount=", this.a, ")");
    }
}
