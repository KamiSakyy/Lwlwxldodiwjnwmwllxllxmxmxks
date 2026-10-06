package androidx.compose.runtime.tooling;

import com.google.android.gms.internal.measurement.b4;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1847a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f1848b;

    public b(int i, b4 b4Var, Integer num) {
        this.f1847a = i;
        this.f1848b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1847a == bVar.f1847a && k.b((Object) null, (Object) null) && k.b(this.f1848b, bVar.f1848b);
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.f1847a) * 31) + 0) * 31;
        Integer num = this.f1848b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f1847a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f1848b + ')';
    }
}
