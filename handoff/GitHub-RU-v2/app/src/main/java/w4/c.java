package w4;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f33317b = new c(new d(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final d f33318a;

    public c(d dVar) {
        this.f33318a = dVar;
    }

    public static c a(String str) {
        if (str == null || str.isEmpty()) {
            return f33317b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i10 = b.f33316a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new c(new d(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f33318a.equals(((c) obj).f33318a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33318a.f33319a.hashCode();
    }

    public final String toString() {
        return this.f33318a.f33319a.toString();
    }

    public static Object b;
}
