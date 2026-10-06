package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w70 {
    public boolean a;

    public w70(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w70) && this.a == ((w70) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("RefUpdateRule(viewerCanPush=", ")", this.a);
    }
}
