package t;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f32021a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f32022b;

    public f(int i, CharSequence charSequence) {
        this.f32021a = i;
        this.f32022b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f32021a != fVar.f32021a) {
            return false;
        }
        CharSequence charSequence = fVar.f32022b;
        CharSequence charSequence2 = this.f32022b;
        String charSequence3 = charSequence2 != null ? charSequence2.toString() : null;
        String charSequence4 = charSequence != null ? charSequence.toString() : null;
        if (charSequence3 == null && charSequence4 == null) {
            return true;
        }
        return charSequence3 != null && charSequence3.equals(charSequence4);
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f32021a);
        CharSequence charSequence = this.f32022b;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}
