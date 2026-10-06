package n3;

import java.util.Locale;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Locale f29407a;

    public a(Locale locale) {
        this.f29407a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k.b(this.f29407a.toLanguageTag(), ((a) obj).f29407a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f29407a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f29407a.toLanguageTag();
    }
}
