package td;

import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static final C0091a Companion = new C0091a();

    /* renamed from: a, reason: collision with root package name */
    public final String f32174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32175b;

    /* renamed from: td.a$a, reason: collision with other inner class name */
    public static final class C0091a {
    }

    public a(String str, String str2) {
        k.g(str, "imageId");
        k.g(str2, "status");
        this.f32174a = str;
        this.f32175b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f32174a, aVar.f32174a) && k.b(this.f32175b, aVar.f32175b);
    }

    public final int hashCode() {
        return this.f32175b.hashCode() + (this.f32174a.hashCode() * 31);
    }

    public final String toString() {
        return i.g("UnfurledIcon(imageId=", this.f32174a, ", status=", this.f32175b, ")");
    }
}
