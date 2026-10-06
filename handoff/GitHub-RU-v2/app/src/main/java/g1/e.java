package g1;

import com.github.rudroid.copilot.h1;
import java.util.ArrayList;
import x61.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24454a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f24455b;

    public e(ArrayList arrayList, boolean z10) {
        this.f24454a = z10;
        this.f24455b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f24454a == eVar.f24454a && this.f24455b.equals(eVar.f24455b);
    }

    public final int hashCode() {
        return this.f24455b.hashCode() + (Boolean.hashCode(this.f24454a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Posture(isTabletop=");
        sb2.append(this.f24454a);
        sb2.append(", hinges=[");
        return h1.p(sb2, m.c0(this.f24455b, ", ", (String) null, (String) null, 0, (j71.c) null, 62), "])");
    }
}
