package androidx.compose.foundation.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public float f1259a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Float.compare(this.f1259a, ((u0) obj).f1259a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1259a);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("FlowLayoutData(fillCrossAxisFraction="), this.f1259a, ')');
    }
}
