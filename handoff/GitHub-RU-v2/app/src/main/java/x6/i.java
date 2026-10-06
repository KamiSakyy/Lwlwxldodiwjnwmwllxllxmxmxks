package x6;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f33835a;

    /* renamed from: b, reason: collision with root package name */
    public d0 f33836b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f33837c = null;

    public i(int i) {
        this.f33835a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f33835a != iVar.f33835a || !k71.k.b(this.f33836b, iVar.f33836b)) {
            return false;
        }
        Bundle bundle = this.f33837c;
        Bundle bundle2 = iVar.f33837c;
        if (k71.k.b(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !d5.z(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f33835a) * 31;
        d0 d0Var = this.f33836b;
        int hashCode2 = hashCode + (d0Var != null ? d0Var.hashCode() : 0);
        Bundle bundle = this.f33837c;
        if (bundle != null) {
            return d5.A(bundle) + (hashCode2 * 31);
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f33835a));
        sb2.append(")");
        if (this.f33836b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f33836b);
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }
}
