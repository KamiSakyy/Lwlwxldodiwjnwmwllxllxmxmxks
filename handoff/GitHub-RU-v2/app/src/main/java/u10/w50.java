package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w50 {
    public final boolean a;

    public w50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w50) && this.a == ((w50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("RefUpdateRule(viewerCanPush=", ")", this.a);
    }










}
